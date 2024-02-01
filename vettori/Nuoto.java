package it.edu.iisgubbio.vettori;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Nuoto extends Application {
	
	TextField tNumero = new TextField();
	   TextField tTempo = new TextField();
	   TextField tCoach = new TextField();
	   Label eRisultati = new Label();
	   int tempi[];
	   int pos;
	   
	   public void start(Stage finestra) {
		   
		   Button bAlloca = new Button("Alloca");
		   Button bInserisci = new Button("Inserisci tempo");
		   
		   GridPane griglia = new GridPane();

	
		   griglia.setPadding(new Insets(10, 10, 10, 10));
		   griglia.setHgap(10); 
		   griglia.setVgap(10);
		   griglia.add(tNumero, 0, 0);
		   griglia.add(tTempo, 0, 1);
		   griglia.add(tCoach, 0, 2);
		   griglia.add(eRisultati, 0, 3);
		   griglia.add(bAlloca, 1, 1);
		   griglia.add(bInserisci, 1, 2);
		   
		   Scene scena = new Scene(griglia, 200, 200);
		   
		   finestra.setTitle("nuoto");
		   finestra.setScene(scena);
		   finestra.show();
			
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
