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

public class Capitale extends Application {

	TextField tCapitale = new TextField();
	TextField tInteressi = new TextField();
	TextField tAnni = new TextField("");

	Label eRisultato = new Label("");

	public void start(Stage finestra) {

		Label eCap = new Label("capitale");
		Label eInt = new Label("interessi");
		Label eAnni = new Label("Anni/o");

		Button bCalcolaseq = new Button("Tabellina");

		GridPane griglia = new GridPane();

		griglia.setPadding(new Insets(10, 10, 10, 10));
		griglia.setHgap(10); 
		griglia.setVgap(10);

		griglia.add(eCap, 0, 0);
		griglia.add(tCapitale, 1, 0);
		griglia.add(eInt, 0, 1);
		griglia.add(tInteressi, 1, 1);
		griglia.add(tAnni, 1, 2);
		griglia.add(eAnni, 0, 2);
		griglia.add(bCalcolaseq, 0, 3, 2, 1);
		griglia.add(eRisultato, 0, 4, 2, 1);

		griglia.setGridLinesVisible(false);

		bCalcolaseq.setMaxWidth(600);

		eRisultato.setMaxWidth(500);

		tCapitale.setPromptText("inserisci il capitale");
		tAnni.setPromptText("inserisci lo/gli anno/i");
		tInteressi.setPromptText("inserisci gli interessi");

		Scene scena = new Scene(griglia);

		finestra.setTitle("Capitale");
		finestra.setScene(scena);
		finestra.show();

		bCalcolaseq.setOnAction(e -> calcoli());

		finestra.addEventHandler(KeyEvent.KEY_PRESSED, event -> bCalcolaseq.fire());

	}

	public void calcoli() {

		double capitale = Double.parseDouble(tCapitale.getText());
		int anni = Integer.parseInt(tAnni.getText());
		int Int = Integer.parseInt(tInteressi.getText());

		for(int cont = 1; cont <= anni; cont++) {

			capitale = (capitale * Int / 100) + capitale;

		}

		eRisultato.setText(""+capitale);

	}

	public static void main(String[] args) {
		launch(args);
	}
}
