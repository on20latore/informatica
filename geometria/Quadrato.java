package it.edu.iisgubbio.geometria;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Quadrato extends Application { 
	
	Label eLato = new Label();
	TextField cLato = new TextField();
	Button bArea = new Button();
	Label eArea = new Label();
	Button Perimetro = new Button();
	Label ePerimetro = new Label();
	
	GridPane griglia = new GridPane();
	
	public void start(Stage finestra) {
		
		eLato.setText("lato");
		bArea.setText("area");
		
		griglia.setGridLinesVisible(true);
		
		griglia.add(eLato, 0, 0);
		griglia.add(cLato, 1, 0);
		griglia.add(bArea, 0, 1);
		griglia.add(eArea, 1, 1);
		griglia.add(Perimetro, 2, 0);
		griglia.add(ePerimetro, 2, 1);
		
		bArea.setOnAction(e -> moltiplica());
		
		Scene scena = new Scene(griglia, 300 ,300);

	    finestra.setTitle("Quadrato");
	    finestra.setScene(scena);
	    finestra.show();
		
	}
	
	public void moltiplica() {
		
		String latoStringa;
		int area;
		int lato;
		latoStringa = cLato.getText();
		lato = Integer.parseInt(latoStringa);
		area = lato * lato;
		eArea.setText(""+area);
	}
	
	
	
	public static void main(String[] args) {
	       launch(args);
	     }

}

	