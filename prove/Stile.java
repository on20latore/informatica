package it.edu.iisgubbio.prove;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Stile extends Application {
	
	Label base = new Label();
	Label altezza = new Label();
	Button calcola = new Button();
	TextField tBase = new TextField();
	TextField tAltezza = new TextField();
	Label eArea = new Label("area");
	Label ePerimetro = new Label("perimetro");
	
	GridPane griglia = new GridPane();
	
	public void start(Stage finestra) {
		
		base.setText("base");
		altezza.setText("altezza");
		calcola.setText("calcola");
		
		Scene scena = new Scene(griglia,300 ,200);
		
		scena.getStylesheets().add("it/edu/iisgubbio/prove/NewFile.css");
		
		ePerimetro.setId("perimetro");

	    finestra.setTitle("Quadrato");
	    finestra.setScene(scena);
	    finestra.show();
	    
	    griglia.setGridLinesVisible(false);
	    
	    griglia.add(base, 0, 0);
		griglia.add(tBase, 1, 0);
		griglia.add(altezza, 0, 1);
		griglia.add(tAltezza, 1, 1);
		griglia.add(calcola, 0, 3, 2, 1);
		griglia.add(eArea, 0, 4);
		griglia.add(ePerimetro, 1, 4);
		
		calcola.setPrefWidth(700);
		
	}
	
	
	public static void main(String[] args) {
	       launch(args);
	     }
}


