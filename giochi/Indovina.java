package it.edu.iisgubbio.giochi;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.input.KeyEvent;

public class Indovina extends Application {

	TextField tNumran = new TextField();
	
	Label eRisultato = new Label("");
    
	int numCasuale = (int)(Math.random()*100)+1;
	
	public void start(Stage finestra) {
		
		Label eNum = new Label("numero");

		Button bCalcolasoluzioni = new Button("prova");
		
		Button bRicomincia = new Button("ricomincia");

		GridPane griglia = new GridPane();

		griglia.setPadding(new Insets(10, 10, 10, 10));
		griglia.setHgap(10); 
		griglia.setVgap(10);

		griglia.add(eNum, 0, 0);
		griglia.add(bCalcolasoluzioni, 0, 1, 2, 1);
		griglia.add(tNumran, 1, 0);
		griglia.add(eRisultato, 0, 3, 2, 1);
		griglia.add(bRicomincia, 0, 2, 2, 1);

		griglia.setGridLinesVisible(false);

		bCalcolasoluzioni.setMaxWidth(600);

		eRisultato.setMaxWidth(600);
		
		bRicomincia.setMaxWidth(600);


		Scene scena = new Scene(griglia, 250, 200);

		finestra.setTitle("indovina");
		finestra.setScene(scena);
		finestra.show();

		bCalcolasoluzioni.setOnAction(e -> calcoli());
		
		bRicomincia.setOnAction(e -> ricomincia());

		finestra.addEventHandler(KeyEvent.KEY_PRESSED, event -> bCalcolasoluzioni.fire());
		

	}

	public void calcoli() {
		
		int numeroInserito = Integer.parseInt(tNumran.getText());
		
		System.out.println(numCasuale);
		
		if (numCasuale > numeroInserito) {
			
			eRisultato.setText("il numero è troppo piccolo");
			
		}else if (numCasuale < numeroInserito) {
				
			eRisultato.setText("il nemero è troppo grande");
			
		}else {
			
			eRisultato.setText("hai indovinato il numero");
		}
	}
	
	public void ricomincia() {
		
	    numCasuale = (int)(Math.random()*100)+1;
		
		System.out.println(numCasuale);
		
		eRisultato.setText("il numero è cambiato");
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}

