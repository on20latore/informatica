package it.edu.iisgubbio.prove;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class PrimaInterfaccia extends  Application{
	
	TextField altosx = new TextField();
	Button unisci = new Button();
	TextField altodx = new TextField();
	
    Button centrosxcopia = new Button();
    Label eUniscicentro = new Label();
    Button centrodxcopia = new Button();
    
    Label eCopiagiusx = new Label();
    Button centrogiupulisci = new Button();
    Label eCopiagiudx = new Label();
    
    GridPane griglia = new GridPane();

    public void start(Stage finestra) {
		
		unisci.setText("unisci");
		centrosxcopia.setText("copia");
		centrodxcopia.setText("copia");
		centrogiupulisci.setText("pulisci");
		
		griglia.add(altosx, 0, 0);
		griglia.add(unisci, 1, 0);
		griglia.add(altodx, 2, 0);
		griglia.add(centrosxcopia, 0, 1);
		griglia.add(eUniscicentro, 1, 1);
		griglia.add(centrodxcopia, 2, 1);
		griglia.add(eCopiagiusx, 0, 2);
		griglia.add(centrogiupulisci, 1, 2);
		griglia.add(eCopiagiudx, 2, 2);
		
		unisci.setOnAction(e -> unisci());
		centrosxcopia.setOnAction(e -> copiasx());
		centrodxcopia.setOnAction(e -> copiadx());
		centrogiupulisci.setOnAction(e -> pulisci());
		
		Scene scena = new Scene(griglia);

	    finestra.setTitle("Prima Interfaccia!");
	    finestra.setScene(scena);
	    finestra.show();
	  }
	
    public void unisci() {
		
		String valore1=altosx.getText();
		String valore2=altodx.getText();
		String valorecon=valore1+valore2;
		eUniscicentro.setText(valorecon);
	}
    
    public void copiasx() {
    	
    	String valore1=altosx.getText();
    	eCopiagiusx.setText(valore1);
		
    }
    
    public void copiadx() {
    	
    	String valore1=altodx.getText();
    	eCopiagiudx.setText(valore1);
    	
    }
    
    public void pulisci() {
    	
    	eCopiagiusx.setText("");
    	eCopiagiudx.setText("");
    
    }
    
    public static void main(String[] args) {
        launch(args);
      }
}