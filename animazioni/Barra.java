package it.edu.iisgubbio.animazioni;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Barra extends Application{

	TextField tSim = new TextField();
	TextField tMill = new TextField();
	
	Label testo;
	
	String simbolo;
	
	String n ="";
	
	String p="";
	
	Timeline timeline;
	
	@Override
	public void start(Stage primaryStage) throws Exception {

		Button bVia = new Button("via");

		Label eSim = new Label("simbolo:");
		Label eMill = new Label("millisecondi:");

		testo = new Label("finestra timer");

		GridPane griglia = new GridPane();

		griglia.setPadding(new Insets(10, 10, 10, 10));
		griglia.setHgap(10); 
		griglia.setVgap(10);

		griglia.add(eMill, 0, 1);
		griglia.add(eSim, 0, 0);
		griglia.add(tSim, 1, 0);
		griglia.add(tMill, 1, 1);
		griglia.add(bVia, 2, 0, 1, 2);
		griglia.add(testo, 0, 3, 3, 1);

		bVia.setMaxHeight(600);
		
		bVia.setOnAction(e -> via());

		Scene scene = new Scene(griglia);

		primaryStage.setTitle("Barra"); 
		primaryStage.setScene(scene);
		primaryStage.show();

		tMill.setPromptText("iserisci i millisecondi");
		tSim.setPromptText("inserisci il simbolo");
		
		primaryStage.addEventHandler(KeyEvent.KEY_PRESSED, event -> bVia.fire());
		
	}
	
	public void via() {
		
		simbolo = tSim.getText();
		double sec = Double.parseDouble(tMill.getText());
		
		timeline = new Timeline(new KeyFrame(
				Duration.millis(sec),
				x -> aggiornaTimer()));
		timeline.setCycleCount(Timeline.INDEFINITE);
		
		timeline.play();
		
	}

	private void aggiornaTimer(){
		
		n = n + simbolo;
		testo.setText(n);
		
		int contan = 0; 
				
		contan = contan + 1;
			
		}

	public static void main(String args[]){
		launch();
	}
}