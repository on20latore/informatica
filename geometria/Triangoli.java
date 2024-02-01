package it.edu.iisgubbio.geometria;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Triangoli extends Application{
	
	TextField tLato1 = new TextField();
	TextField tLato2 = new TextField();
	TextField tLato3 = new TextField();
	
	Button bTrovatipo = new Button("trova tipo");
	
	Label eTipo = new Label("d");
	
	public void start(Stage finestra) {
		
		 GridPane griglia = new GridPane();
			
			griglia.setPadding(new Insets(10, 10, 10, 10));
			griglia.setHgap(10); 
			griglia.setVgap(10);
			
			griglia.add(tLato1, 0, 0);
			griglia.add(tLato2, 1, 0);
			griglia.add(tLato3, 2, 0);
			griglia.add(bTrovatipo, 0, 2, 3, 1);
			griglia.add(eTipo, 1, 3, 3, 1);
			griglia.setGridLinesVisible(false);
			
			bTrovatipo.setMaxWidth(500);
							
			Scene scena = new Scene(griglia, 250, 200);
		    
			finestra.setTitle("Triangoli");
		    finestra.setScene(scena);
		    finestra.show();
		    
		    bTrovatipo.setOnAction(e -> calcola());
		
	}
	
	public void calcola() {
													
		String tipo = "il triangolo non esiste";
		
	     double lato1 = Double.parseDouble(tLato1.getText());
		 double lato2 = Double.parseDouble(tLato2.getText());
		 double lato3 = Double.parseDouble(tLato3.getText());
		 
		 if (lato1 + lato2 > lato3 && lato1 + lato3 > lato2 && lato2 + lato3 > lato1) {
		        if (lato1 == lato2 && lato2 == lato3) {
		            tipo = "Triangolo equilatero";
		        } else if (lato1 == lato2 || lato2 == lato3 || lato1 == lato3) {
		            tipo = "Triangolo isoscele";
		        } else {
		            tipo = "Triangolo scaleno";
		        }
		    }

		    eTipo.setText(tipo);
		
	}
	
	public static void main(String[] args) {
	    launch(args);
	  }

}
