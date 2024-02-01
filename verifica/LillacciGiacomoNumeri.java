package it.edu.iisgubbio.verifica;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class LillacciGiacomoNumeri extends Application {
	
	
	Label eRisultato = new Label("");
	TextField tPrimonumero = new TextField();
	TextField tSecondonumero = new TextField();
	
	public void start(Stage finestra) {
		
		Label ePrimonumero = new Label("primo numero");
		Label eSecondonumero = new Label("secondo numero");
		
		Button bCalcola = new Button("calcola");
		
		GridPane griglia = new GridPane();
		
		griglia.setPadding(new Insets(10, 10, 10, 10));
		griglia.setHgap(15); 
		griglia.setVgap(15);
		
		griglia.add(ePrimonumero, 0, 0);
		griglia.add(eSecondonumero, 0, 1);
		griglia.add(tPrimonumero, 1, 0);
		griglia.add(tSecondonumero, 1, 1);
		griglia.add(bCalcola, 0, 2);
		griglia.add(eRisultato, 1, 2);
		
		bCalcola.setMaxWidth(300);
		
		griglia.setGridLinesVisible(false);
						
		Scene scena = new Scene(griglia);
		
	    finestra.setTitle("minimo comune multiplo");
	    finestra.setScene(scena);
	    finestra.show();
	    
	    bCalcola.setOnAction(e -> calcoli());
		
	}
	
	public void calcoli() {
		
		  int primonumero = Integer.parseInt(tPrimonumero.getText());
          int secondonumero = Integer.parseInt(tSecondonumero.getText());

	}
	
	public static void main(String[] args) {
	    launch(args);
	  }

}
