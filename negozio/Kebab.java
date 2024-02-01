package it.edu.iisgubbio.negozio;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Kebab extends Application {
	
	CheckBox cCarne = new CheckBox("carne [4.00€]");
		CheckBox cFormaggio = new CheckBox("formaggio [1.00€]");
		CheckBox cPomodoro = new CheckBox("pomodoro [1.00€]");
		CheckBox cSalsa = new CheckBox("salsa [0.50€]");
		CheckBox cCipolla = new CheckBox("cipolla [0.50€]");
		
		Label eTotale = new Label();
		
	public void start(Stage finestra) {
		
		
		Button bTotale = new Button("totale");
		
        GridPane griglia = new GridPane();
		
		griglia.setPadding(new Insets(10, 10, 10, 10));
		griglia.setHgap(10); 
		griglia.setVgap(10);
		
		griglia.add(cCarne, 0, 0);
		griglia.add(cFormaggio, 0, 1);
		griglia.add(cPomodoro, 0, 2);
		griglia.add(cSalsa, 0, 3);
		griglia.add(cCipolla, 0, 4);
		griglia.add(bTotale, 0, 5);
		griglia.add(eTotale, 1, 5);
		
		griglia.setGridLinesVisible(false);
						
		Scene scena = new Scene(griglia, 250, 200);
	    
		finestra.setTitle("Kebab");
	    finestra.setScene(scena);
	    finestra.show();
	    
	    bTotale.setOnAction(e -> calcoli());

	}
	
	public void calcoli() {
		double total;
		
		 total = 0.0;
		 
		 if (cCarne.isSelected()) {
		        total = total + 4.00;
		    }
		    if (cFormaggio.isSelected()) {
		        total = total + 1.00;
		    }
		    if (cPomodoro.isSelected()) {
		        total = total + 1.00;
		    }
		    if (cSalsa.isSelected()) {
		        total = total + 0.50;
		    }
		    if (cCipolla.isSelected()) {
		        total = total + 0.50;
		    }
		    
	        eTotale.setText("Totale: " + total + "€");
	    }
	
	
	
	public static void main(String[] args) {
	       launch(args);
	     }

}
