package it.edu.iisgubbio.matemetica;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.input.KeyEvent;

public class Equazioni2 extends Application {
	
	TextField tA = new TextField();
	Label eAx = new Label("x²+");
	TextField tB = new TextField();
	TextField tC = new TextField();
	Label eBx = new Label("x+");
	Label eC = new Label();
	Label eSoluzioni = new Label();
	
	public void start(Stage finestra) {
		
		Button bCalcolasoluzioni = new Button("calcola l'equazione");
		
        GridPane griglia = new GridPane();
		
		griglia.setPadding(new Insets(10, 10, 10, 10));
		griglia.setHgap(10); 
		griglia.setVgap(10);
		
		griglia.add(tA, 0, 0);
		griglia.add(eAx, 1, 0);
		griglia.add(tB, 2, 0);
		griglia.add(eBx, 3, 0);
		griglia.add(tC, 4, 0);
		griglia.add(eC, 5, 0);
		griglia.add(bCalcolasoluzioni, 0, 1, 6, 1);
		griglia.add(eSoluzioni, 2, 2, 6, 1);
		
		griglia.setGridLinesVisible(false);
		
		bCalcolasoluzioni.setMaxWidth(600);
		
		eSoluzioni.setMaxWidth(600);
						
		Scene scena = new Scene(griglia, 570, 200);
	   
		finestra.setTitle("equazioni di secondo grado");
	    finestra.setScene(scena);
	    finestra.show();
	    
	    bCalcolasoluzioni.setOnAction(e -> calcoli());
	    
	    finestra.addEventHandler(KeyEvent.KEY_PRESSED, event -> bCalcolasoluzioni.fire());
	    
	}
	
	public void calcoli() {
		
		double a = Double.parseDouble(tA.getText());
		double b = Double.parseDouble(tB.getText());
		double c = Double.parseDouble(tC.getText());
		
		double discriminante = (b * b) -4 * a * c;
		
		System.out.println(discriminante);
		
		if (discriminante > 0) {

			double soluzione1 = (-b + Math.sqrt(discriminante)) / (2 * a);
			double soluzione2 = (-b - Math.sqrt(discriminante)) / (2 * a);

			eSoluzioni.setText("Soluzioni: x1 = " + soluzione1 + ", x2 = " + soluzione2);

		} else if (discriminante == 0) {

			double soluzione = -b / (2 * a);
			eSoluzioni.setText("Soluzione doppia: x = " + soluzione);

		} else {

			eSoluzioni.setText("Nessuna soluzione reale");
		}
	}
	    
	    public static void main(String[] args) {
		       launch(args);
		     }


}
