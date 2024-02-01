package it.edu.iisgubbio.vettori;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class RicercaBinaria extends Application{

	TextField tNumeri = new TextField();
	TextField tTrova = new TextField();
	TextField tPos = new TextField();
	Button pTrova = new Button("trova");
	Button pRipete = new Button("ripete");
	Label eRisultato = new Label("");
	Label ePos = new Label("");
	Label eRipetizione = new Label("");
	String parti[];
	int numeri[];

	public void start(Stage finestra) {

		Button bPos = new Button("trova alla posizione");

		GridPane griglia = new GridPane();

		griglia.add(tNumeri,  0,  0);
		griglia.add(tTrova,  0,  1);
		griglia.add(pTrova, 0, 2);
		griglia.add(eRisultato,  0,  3);
		griglia.add(pRipete,  0,  4);
		griglia.add(eRipetizione,  0,  5);
		griglia.add(bPos,  0,  6);
		griglia.add(ePos,  0,  7);
		griglia.add(tPos,  1,  6);


		griglia.setPadding(new Insets(10, 10, 10, 10));
		griglia.setHgap(22); 
		griglia.setVgap(10);

		Scene scene = new Scene(griglia,370,300);

		finestra.setTitle("Somma"); 
		finestra.setScene(scene);
		finestra.show();

		pTrova.setOnAction(e -> trova());
		pRipete.setOnAction(e -> ripete());
		bPos.setOnAction(e -> posizione());
	}
	public void trova() {

		int quantiNumeri=0;
		int numeroTrovare = Integer.parseInt(tTrova.getText());
		String t = tNumeri.getText();
		if(t.equals("")) {
			eRisultato.setText("inserisci i numeri");
		}else {
			parti =t.split(" ");

			numeri = new int [parti.length];
			for(int indice = 0; indice < parti.length; indice++) {
				numeri[indice] = Integer.parseInt(parti[indice]);
			}
			for(int indice = 0; indice < parti.length; indice++) {
				if(numeri[indice]==numeroTrovare) {
					quantiNumeri++;
				}
			}
			if(quantiNumeri>0) {
				eRisultato.setText("il numero "+ numeroTrovare + " è presente "+ quantiNumeri +" volt*");
			}else {
				eRisultato.setText("il numero "+ numeroTrovare + " non è presente");
			}
		}
	}
	public void ripete() {
		int indice;
		int ripete=0;
		boolean ripetizionePresente=false;
		for(indice = 1; indice < parti.length && !ripetizionePresente; indice++) {
			ripete=numeri[indice];
			if(numeri[indice-1]==ripete) {
				ripetizionePresente=true;
			}
			if(ripetizionePresente) {
				eRipetizione.setText("il numero "+ ripete + " si ripete di seguito");	
			}else {
				eRipetizione.setText("non si ripete nessun numero di seguito");	
			}
		}
	}
	public void posizione() {
		int numerotrovato = Integer.parseInt(tPos.getText());
		String num = tPos.getText();
		int posizione = 0;

		for(int indice = 0; indice < parti.length; indice++) {
			if(numeri[indice]== numerotrovato) {
				posizione = indice;
				break;
			}
		}
		ePos.setText("il numero " + num + " è alla posizione " + posizione);
	}	

	public static void main(String args[]){
		launch();
	}
}