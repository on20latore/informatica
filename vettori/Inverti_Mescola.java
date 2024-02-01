package it.edu.iisgubbio.vettori;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Inverti_Mescola extends Application{

	TextField tNumeri = new TextField();
	Label eRisultato = new Label();
	TextField tRisultato = new TextField();
	
	String parti[];
	int numeri[];
                                
	public void start(Stage finestra) {
		
		Button bInverti = new Button("inverti");
		Button bMescola = new Button("mescola");

		Button bPos = new Button("trova alla posizione");

		GridPane griglia = new GridPane();

		griglia.add(tNumeri,  0,  0, 2, 1);
		griglia.add(bInverti,  0,  1);
		griglia.add(bMescola,  1,  1);
		griglia.add(tRisultato,  0,  2, 2 , 1);
		griglia.add(eRisultato,  0,  3);
		
		bInverti.setMaxWidth(200);

		griglia.setPadding(new Insets(10, 10, 10, 10));
		griglia.setHgap(22); 
		griglia.setVgap(10);

		Scene scene = new Scene(griglia,370,300);

		finestra.setTitle("inverti mescola"); 
		finestra.setScene(scene);
		finestra.show();

		bMescola.setOnAction(e -> mescola());
		bInverti.setOnAction(e -> inverti());
	}
	public void inverti() {
      
		String x = new String(tNumeri.getText());
		String p[];
		p = x.split(" ");
		int n[] = new int[p.length];  
		for(int i = 0; i < p.length; i++) {
			n[i] = Integer.parseInt(p[i]);
		}
		
		for(int i = 0; i < (n.length)/2; i++) {
			int temp = n[i];
			n[i] = n[n.length-1-i];
			n[n.length-1-i]=temp;
		}
			System.out.println(n);
	}
	public void mescola() {
		
			}
	public static void main(String args[]){
		launch();
	}
}
