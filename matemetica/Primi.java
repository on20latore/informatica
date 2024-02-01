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

public class Primi extends Application {

	TextField tNum = new TextField();

	Label eSeqNum = new Label("");

	public void start(Stage finestra) {

		Label eNum = new Label("Numero");

		Button bCalcolaseq = new Button("Divisori");

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

		tNum.setPromptText("inserisci il numero");

		Scene scena = new Scene(griglia);

		finestra.setTitle("Divisori");
		finestra.setScene(scena);
		finestra.show();

		bCalcolaseq.setOnAction(e -> calcoli());

		finestra.addEventHandler(KeyEvent.KEY_PRESSED, event -> bCalcolaseq.fire());

	}

	public void calcoli() {

		int num = Integer.parseInt(tNum.getText());

		boolean primo = true;

		for(int cont = 2; cont < num; cont++) {

			if(num % cont == 0) {

				primo = false;
			}

			}
			if(primo) {

				eSeqNum.setText("numero primo");

			} else {

				eSeqNum.setText("numero non primo");

			}
		}

			public static void main(String[] args) {
				launch(args);
			}
		}
