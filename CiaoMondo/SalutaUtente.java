package it.edu.iisgubbio.CiaoMondo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class SalutaUtente extends Application {
	
	Label messaggio = new Label();
	TextField nome = new TextField();
	
	Label mettiNome = new Label();
	Button eseguiSaluto = new Button();
    
	GridPane  griglia = new GridPane();
    
 
  public void start(Stage finestra) {
	  
	mettiNome.setText("Nome:");
	messaggio.setText("Sono impaziente...");
	eseguiSaluto.setText("Premi qui");
	
	nome.setPromptText("Nome o nomignolo per salutarti");

	griglia.add(mettiNome, 0, 0);
	griglia.add(nome, 1, 0);
	griglia.add(eseguiSaluto, 1, 1);
	griglia.add(messaggio, 1, 2);
    eseguiSaluto.setOnAction(e -> esegui());

    Scene scena = new Scene(griglia, 250, 70);

     finestra.setTitle("Hello World!");
     finestra.setScene(scena);
     finestra.show();
  }

  public void esegui() {
	   String utente;
	   utente = nome.getText();
	   messaggio.setText("Signor " + utente + " Le auguro buona giornata!");
	}

  public static void main(String[] args) {
    launch(args);
  }
}