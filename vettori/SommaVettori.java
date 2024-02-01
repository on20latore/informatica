package it.edu.iisgubbio.vettori;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class SommaVettori extends Application {
	
	TextField tNumero = new TextField();
	   Label eRisultati = new Label("");
	   
	   
	   public void start(Stage finestra) {
		   
		   Button bSomma = new Button("somma");
		   Button bVerifica = new Button("verifica");
		   
		   GridPane griglia = new GridPane();

		   griglia.setPadding(new Insets(10, 10, 10, 10));
		   griglia.setHgap(10); 
		   griglia.setVgap(10);
		   griglia.add(tNumero, 0, 0);
		   griglia.add(eRisultati, 0, 2);
		   griglia.add(bSomma, 1, 1);
		   griglia.add(bVerifica, 1, 2);
		   
		   Scene scena = new Scene(griglia, 300, 300);
		   
		   finestra.setTitle("somma");
		   finestra.setScene(scena);
		   finestra.show();
		
		   bSomma.setOnAction(e -> somma());
		   bVerifica.setOnAction(e -> verifica());
		   
	   }

	   public void somma() {
		   
		   int somma = 0;
		   
		   String t = tNumero.getText();
		   
		   String[] parti = t.split(" ");
		   
		   int numeri[];
	      
	      for(int i = 0; i < parti.length; i++) {
	    	  
	    	 numeri = new int[parti.length];
	    	  
	    	  somma = somma + numeri[i];
	    	  
	      }
	      System.out.println(somma);
	      
	      eRisultati.setText("" + somma);
	   }
	   
	   public void verifica() {
		   String t = tNumero.getText();
		   
		   String[] parti = t.split(" ");
		   
		  boolean crescente = true;
		  
		  for(int i = 0; i < parti.length && crescente == true; i++) {
			  
			  if(numeri[i] > numeri[i + 1]) {
				  
				  crescente = false;
				  
			  }
			  System.out.println(crescente);
		  }
		  
		   
	   }
	   
	   public static void main(String[] args) {
			launch(args);
		}

	}

