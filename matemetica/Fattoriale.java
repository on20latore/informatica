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

public class Fattoriale extends Application {

	TextField tNum = new TextField();

	Label eSeqNum = new Label("");

	public void start(Stage finestra) {

		Button bFattoriale = new Button("!");

		GridPane griglia = new GridPane();

		griglia.setPadding(new Insets(10, 10, 10, 10));
		griglia.setHgap(10); 
		griglia.setVgap(10);

		griglia.add(tNum, 0, 0);
		griglia.add(bFattoriale, 1, 0);
		griglia.add(eSeqNum, 2, 0);

		griglia.setGridLinesVisible(false);

		bFattoriale.setMaxWidth(600);
		
		tNum.setPromptText("inserisci il numero");

		Scene scena = new Scene(griglia, 300, 50);

		finestra.setTitle("Fattoriale");
		finestra.setScene(scena);
		finestra.show();

		bFattoriale.setOnAction(e -> calcoli());

		finestra.addEventHandler(KeyEvent.KEY_PRESSED, event -> bFattoriale.fire());

	}

	public void calcoli() {

		int num = Integer.parseInt(tNum.getText());
		
		int risultato = 1;

		for(int cont = 1; cont <= num; cont++) {
			
			risultato = risultato * cont;
			
		}
		
		eSeqNum.setText("" + risultato);
	}	

	public static void main(String[] args) {
		launch(args);
	}

}
