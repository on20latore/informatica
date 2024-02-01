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

public class Tabellina extends Application {

	TextField tNum = new TextField();

	Label eSeqNum = new Label("");

	public void start(Stage finestra) {

		Label eNum = new Label("Numero");

		Button bCalcolaseq = new Button("Tabellina");

		GridPane griglia = new GridPane();

		griglia.setPadding(new Insets(10, 10, 10, 10));
		griglia.setHgap(10); 
		griglia.setVgap(10);

		griglia.add(eNum, 0, 0);
		griglia.add(tNum, 1, 0);
		griglia.add(bCalcolaseq, 0, 1, 2, 1);
		griglia.add(eSeqNum, 0, 2, 2, 1);

		griglia.setGridLinesVisible(false);

		bCalcolaseq.setMaxWidth(600);

		Scene scena = new Scene(griglia);

		finestra.setTitle("Tabellina");
		finestra.setScene(scena);
		finestra.show();

		bCalcolaseq.setOnAction(e -> calcoli());

		finestra.addEventHandler(KeyEvent.KEY_PRESSED, event -> bCalcolaseq.fire());

	}

	public void calcoli() {

		int num = Integer.parseInt(tNum.getText());

		String sequenza = "0";

		for(int cont = 1; cont <= 10; cont++) {
			int risultato = cont * num;
			sequenza += ", " +risultato;
		}

		eSeqNum.setText(sequenza);

	}

	public static void main(String[] args) {
		launch(args);
	}
}
