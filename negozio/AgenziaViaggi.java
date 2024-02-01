package it.edu.iisgubbio.negozio;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.input.KeyEvent;

public class AgenziaViaggi extends Application {

	TextField tPersperbus = new TextField();
	TextField tPartecipanti = new TextField();
	TextField tCosbus = new TextField();

	Label eCostobiglietto = new Label("");

	public void start(Stage finestra) {
		
		Label eCosbiglietto = new Label("costo biglietto");
		Label ePersperbus = new Label("persone per autobus");
		Label ePartecipanti = new Label("partecipanti");
		Label eCosbus = new Label("costo autobus");

		Button bCalcolabiglietto = new Button("calcola biglietto");

		GridPane griglia = new GridPane();

		griglia.setPadding(new Insets(10, 10, 10, 10));
		griglia.setHgap(10); 
		griglia.setVgap(10);

		griglia.add(ePersperbus, 0, 0);
		griglia.add(ePartecipanti, 0, 1);
		griglia.add(eCosbus, 0, 2);
		griglia.add(bCalcolabiglietto, 0, 3, 2, 1);
		griglia.add(eCosbiglietto, 0, 4);
		griglia.add(tPersperbus, 1, 0);
		griglia.add(tPartecipanti, 1, 1);
		griglia.add(tCosbus, 1, 2);
		griglia.add(eCostobiglietto, 1, 4);
		

		griglia.setGridLinesVisible(false);

		bCalcolabiglietto.setMaxWidth(600);

		Scene scena = new Scene(griglia, 300, 200);

		finestra.setTitle("agenzia viaggi");
		finestra.setScene(scena);
		finestra.show();

		bCalcolabiglietto.setOnAction(e -> calcoli());

		finestra.addEventHandler(KeyEvent.KEY_PRESSED, event -> bCalcolabiglietto.fire());

	}
	
	public void calcoli() {
		
	    int persPerBus = Integer.parseInt(tPersperbus.getText());
		int numPers = Integer.parseInt(tPartecipanti.getText());
		int costoBus = Integer.parseInt(tCosbus.getText());
		int numeroAutobus;
		double costoAutobusTot;
		double costoPerPers;
		
		numeroAutobus = numPers / persPerBus;
		
		if (numPers % persPerBus > 0) {
			
			numeroAutobus = numeroAutobus + 1;
		}
		
		costoAutobusTot = numeroAutobus * costoBus;
		
		costoPerPers = costoAutobusTot / numPers;
		
		eCostobiglietto.setText(""+costoPerPers);
		
	}
	
	public static void main(String[] args) {
	       launch(args);
	     }
}
			
