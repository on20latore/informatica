package it.edu.iisgubbio.grafica;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Triangolo extends Application {

	TextField tNum = new TextField();

	public void start(Stage finestra) {

		Label eNum = new Label("numero");

		Button bVai = new Button("Vai!"); 

		GridPane griglia = new GridPane();

		griglia.setPadding(new Insets(10, 10, 10, 10));
		griglia.setHgap(10); 
		griglia.setVgap(10);

		griglia.add(eNum, 0, 0);
		griglia.add(tNum, 1, 0);
		griglia.add(bVai, 2, 0);

		Scene scena = new Scene(griglia);

		finestra.setTitle("Triangolo");
		finestra.setScene(scena);
		finestra.show();

		bVai.setMaxWidth(300);
		
		tNum.setPromptText("inserisci numero");

		griglia.setGridLinesVisible(false);

		bVai.setOnAction(e -> esegui());

		finestra.addEventHandler(KeyEvent.KEY_PRESSED, event -> bVai.fire());

	}

	private void esegui(){
		
		Pane quadro = new Pane();
		
		int num = Integer.parseInt(tNum.getText());
		
		for(int y = 20;)

	}

	public static void main(String[] args) {
		launch(args);
	}
}