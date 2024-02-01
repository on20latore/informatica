package it.edu.iisgubbio.vettori;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Caso extends Application{
	
	Label lLunghezza = new Label("lunghezza:");
	TextField tfLunghezza = new TextField();
	Label lMin = new Label("min:");
	TextField tfMin = new TextField();
	Label lMax = new Label("max:");
	TextField tfMax = new TextField();
	Label lVettore = new Label("qui compare il vettore");
	Label lSomma = new Label("risultato");
	Label lPari = new Label("numeri pari");
	Label lcalcolaMin = new Label("Calcola Min");

	int numeri[];
	//int []numeri;
	
	@Override
	public void start(Stage finestra) throws Exception {
		
		Button bMin = new Button("Minimo");
		Button bGenera = new Button("genera");
		Button bStampa = new Button("stampa");
		Button bSomma = new Button("somma");
		Button bContapari = new Button("conta pari");
		
		GridPane griglia = new GridPane();
		
		griglia.setPadding(new Insets(10, 10, 10, 10));
		griglia.setHgap(10); 
		griglia.setVgap(10);
		
		griglia.add(lLunghezza, 0, 0);
		griglia.add(tfLunghezza, 1, 0, 3, 1);
		griglia.add(lMin, 0, 1);
		griglia.add(tfMin, 1, 1, 3, 1);
		griglia.add(lMax, 0, 2);
		griglia.add(tfMax, 1, 2, 3, 1);
		griglia.add(bSomma, 2, 3);
		griglia.add(bContapari, 3, 3);
		griglia.add(lSomma, 2, 4);
		griglia.add(lPari, 3, 4);
		griglia.add(bMin, 0, 5);
		griglia.add(lcalcolaMin, 0, 6);
		
		griglia.add(bGenera, 0, 3);
		griglia.add(bStampa, 1, 3);
		
		griglia.add(lVettore, 0, 4, 2, 1);
		
		Scene scena = new Scene(griglia);
		
		finestra.setTitle("vettori a caso");
		finestra.setScene(scena);
		finestra.show();
		
		bGenera.setOnAction( e -> generaVettore() );
		bStampa.setOnAction( e -> stampaVettore() );
		bSomma.setOnAction( e -> somma() );
		bContapari.setOnAction( e -> contaPari() );
		bMin.setOnAction( e -> contaMin() );
	}
	
	private void stampaVettore() {
		String contenuto="";
		for(int i=0; i<numeri.length; i++) {
			contenuto = contenuto+" "+numeri[i];
		}
		lVettore.setText(contenuto);
	}

	private void generaVettore() {
		int lunghezza = Integer.parseInt(tfLunghezza.getText());
		int vMax = Integer.parseInt(tfMax.getText());
		int vMin = Integer.parseInt(tfMin.getText());
		int intervallo=vMax-vMin+1;
		numeri = new int[lunghezza];
		for(int i=0; i<numeri.length; i++) {
			numeri[i] = (int)(Math.random()*intervallo+vMin);
		}
		
	}
	private void somma() {
		
	    int Somma = 0;
		for(int i=0; i<numeri.length; i++) {
			Somma = Somma + numeri[i];
			
			lSomma.setText("" + Somma);
		}
			
		
	}
	
	private void contaPari() {
		
		int contaPari = 0;
		for(int i=0; i<numeri.length; i++) {
			if (numeri[i] % 2 == 0){
				contaPari++;
			}
			lPari.setText("" + contaPari);
		}
		
	}
	
	private void contaMin() {
		
		int Max = Integer.parseInt(tfMax.getText());
		for(int i=0; i<numeri.length; i++) {
			if ()
		}
	}

	public static void main(String[] args) {
		launch();
	}
}