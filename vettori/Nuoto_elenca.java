package it.edu.iisgubbio.vettori;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Nuoto_elenca extends Application {
	
	TextField tNumero = new TextField();
	   TextField tTempo = new TextField();
	   TextField tCoach = new TextField();
	   Label eRisultati = new Label();
	   int tempi[];
	   int pos;
	   Label eN = new Label("numero");
	   Label eR = new Label("range vettore");
	   Label eV = new Label("vincitore");
	   
	   
	   public void start(Stage finestra) {
		   
		   Button bAlloca = new Button("Alloca");
		   Button bInserisci = new Button("Inserisci tempo");
		   
		   GridPane griglia = new GridPane();
	
		   griglia.setPadding(new Insets(10, 10, 10, 10));
		   griglia.setHgap(10); 
		   griglia.setVgap(10);
		   
		   griglia.add(tNumero, 1, 1);
		   griglia.add(tTempo, 1, 2);
		   griglia.add(tCoach, 1, 3);
		   griglia.add(eRisultati, 1, 4);
		   griglia.add(bAlloca, 2, 2);
		   griglia.add(bInserisci, 2, 3);
		   griglia.add(eN, 0, 1);
		   griglia.add(eR, 0, 2);
		   griglia.add(eV, 0, 3);
		   
		   Scene scena = new Scene(griglia, 200, 200);
		   
		   finestra.setTitle("nuoto");
		   finestra.setScene(scena);
		   finestra.show();
		   
		   bAlloca.setOnAction(e -> alloca());
		   bInserisci.setOnAction(e -> inserisciTempo());
			
	   }

	   public void alloca() {
	      tempi = new int[Integer.parseInt(tNumero.getText())];
	      pos = 0;
	   }

	   public void inserisciTempo() {
	      if(pos < tempi.length) {
	         tempi[pos++]=Integer.parseInt(tTempo.getText());
	         tTempo.setText("");
	      }
	   }

	   public void contaPessimi() {
	      int indice, contatore;
	      int coach = Integer.parseInt(tCoach.getText());
	      for(contatore = indice = 0; indice < tempi.length; indice++) {
	         if(tempi[indice] > coach) {
	            contatore++;
	         }
	      }
	      eRisultati.setText("" + contatore);
	   }
	   public static void main(String[] args) {
			launch(args);
		}

	}