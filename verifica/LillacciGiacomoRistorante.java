package it.edu.iisgubbio.verifica;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class LillacciGiacomoRistorante extends Application {
	
	Label ePrezzototale = new Label("");
	TextField tNumhamburger = new TextField();
	TextField tNumpatatine = new TextField();
	TextField tPrezzohamburger = new TextField();
	TextField tPrezzopatatine = new TextField();
	
	CheckBox cSalse = new CheckBox("salse +0,2€");
	CheckBox cSconto = new CheckBox("sconto 10%");
	
	public void start(Stage finestra) {
		
		
		
		Label ePrezzopanino = new Label("prezzo hamburger:");
		Label eNumeropanini = new Label("numero hamburger:");
		Label ePrezzopatatine = new Label("prezzo patatine:");
		Label eNumpatatine = new Label("numero patatine:");
		Label eTotale = new Label("Totale:");
		
		tPrezzohamburger.setPromptText("prezzo dei panini");
		tNumhamburger.setPromptText("numero di panini");
		tNumpatatine.setPromptText("numero delle patatine");
		tPrezzopatatine.setPromptText("prezzo delle patatine");
		
		eNumeropanini.setId("numpan");
		eNumpatatine.setId("numpat");
		
		Button bCalcolatot = new Button("calcola prezzo");
		
		GridPane griglia = new GridPane();
		
		griglia.setPadding(new Insets(10, 10, 10, 10));
		griglia.setHgap(10); 
		griglia.setVgap(10);
		
		griglia.add(eNumeropanini, 0, 0);
		griglia.add(ePrezzopanino, 1, 0);
		griglia.add(tNumhamburger, 0, 1);
		griglia.add(tPrezzohamburger, 1, 1);
		griglia.add(eNumpatatine, 0, 2);
		griglia.add(ePrezzopatatine, 1, 2);
		griglia.add(tNumpatatine, 0, 3);
		griglia.add(tPrezzopatatine, 1, 3);
		griglia.add(cSalse, 0, 5);
		griglia.add(cSconto, 1, 5);
		griglia.add(bCalcolatot, 0, 6, 2, 1);
		griglia.add(eTotale, 0, 7);
		griglia.add(ePrezzototale, 1, 7);
		
		
		bCalcolatot.setMaxWidth(300);
		
		griglia.setGridLinesVisible(false);
						
		Scene scena = new Scene(griglia, 300, 240);
		
		scena.getStylesheets().add("it/edu/iisgubbio/verifica/NewFile.css");
		
		finestra.setTitle("paninoteca");
	    finestra.setScene(scena);
	    finestra.show();
	    
	    bCalcolatot.setOnAction(e -> calcoli());
	    
	    finestra.addEventHandler(KeyEvent.KEY_PRESSED, event -> bCalcolatot.fire());
		
	}
	
	public void calcoli() {
		
		double prezzopanini = Double.parseDouble(tPrezzohamburger.getText());
        int numeropanini = Integer.parseInt(tNumhamburger.getText());
        double prezzopatatine = Double.parseDouble(tPrezzopatatine.getText());
        int numeropatatine = Integer.parseInt(tNumpatatine.getText());
        
        double risultato = numeropanini * prezzopanini + prezzopatatine * numeropatatine;
        
        if (cSalse.isSelected()) {
	        double salse = numeropatatine * 0.2;
	        risultato = risultato + salse;
        }
        if (cSconto.isSelected()) {
            risultato = risultato - (risultato * 10 / 100);
	    }
		ePrezzototale.setText("" + risultato);
		  
	}
	
	public static void main(String[] args) {
	    launch(args);
	  }

}
