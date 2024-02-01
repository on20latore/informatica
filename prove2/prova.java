package it.edu.iisgubbio.prove2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class prova extends Application {
	
	 Button pSaluto = new Button("saluta"); 
	 
	 Label base = new Label();
	 
		
	public void start(Stage finestra) {
		
		GridPane griglia = new GridPane();
		
		griglia.add(pSaluto, 0, 0);
		griglia.add(base, 1, 0);
		
		Scene scena = new Scene(griglia,300 ,200);
		
		finestra.setTitle("prova");
	    finestra.setScene(scena);
	    finestra.show();
	    
	    pSaluto.setOnAction(e -> esegui());
		
	}
	
	private void esegui(){
		
		base.setText("funziona!");
	   
	  }
	
	
	public static void main(String[] args) {
	    launch(args);
	  }
}
