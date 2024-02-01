package it.edu.iisgubbio.geometria;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Rettangolo extends Application {
	
	Label base = new Label();
	Label altezza = new Label();
	Button calcola = new Button();
	TextField tBase = new TextField();
	TextField tAltezza = new TextField();
	Label eArea = new Label();
	Label ePerimetro = new Label();
	
	GridPane griglia = new GridPane();
	
	public void start(Stage finestra) {
		
		base.setText("base");
		altezza.setText("altezza");
		calcola.setText("calcola");
		
		Scene scena = new Scene(griglia);

	    finestra.setTitle("Quadrato");
	    finestra.setScene(scena);
	    finestra.show();
	    
	    griglia.setGridLinesVisible(true);
	    
	    griglia.add(base, 0, 0);
		griglia.add(tBase, 1, 0);
		griglia.add(altezza, 0, 1);
		griglia.add(tAltezza, 1, 1);
		griglia.add(calcola, 1, 3);
		griglia.add(eArea, 0, 4);
		griglia.add(ePerimetro, 1, 4);
		
		calcola.setPrefWidth(150.0);
		
		calcola.setOnAction(e -> calcoli());
		
	}
	
	public void calcoli() {
		
		String baseStringa;
		String altezzaStringa;
		double perimetro;
		double area;
		double base;
		double altezza;
		baseStringa = tBase.getText();
		altezzaStringa = tAltezza.getText();
	    base = Double.parseDouble(baseStringa);
		altezza = Double.parseDouble(altezzaStringa);
		area = base * altezza;
		perimetro = base + altezza +base + altezza;
		ePerimetro.setText(""+perimetro);
		eArea.setText(""+area);
		
	}
	
	
	public static void main(String[] args) {
	       launch(args);
	     }
}
