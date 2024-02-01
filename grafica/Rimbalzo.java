package it.edu.iisgubbio.grafica;

import javafx.application.Application;
import javafx.geometry.BoundingBox;
import javafx.geometry.Bounds;
import javafx.geometry.Pos;
import java.awt.event.KeyEvent;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.shape.*;

public class Rimbalzo extends Application{
	
	Circle pallino = new Circle(10);
	
	Label punteggio = new Label();
	
	Rectangle rettangolos = new Rectangle(10, 60);
	Rectangle rettangolod = new Rectangle(10, 60);
	
	String punteggio1;
	String punteggio2;
	
	int p1 = 0;
	int p2 = 0;
	
	int x = 150;
	int y= 0;
	
	boolean destra = true;
	boolean giu = true;
	
	double paddleSinistroY = 50;
    double paddleDestroY = 50;
	
	final int LARGHEZZA_CAMPO = 300;
	final int ALTEZZA_CAMPO = 200;



	public void start(Stage finestra) throws Exception {

		Pane quadro = new Pane();
		
		GridPane griglia = new GridPane();
		
		griglia.add(quadro, 0, 0);
		griglia.add(punteggio, 0, 1);		
		
		quadro.setPrefHeight(ALTEZZA_CAMPO);
		quadro.setPrefWidth(LARGHEZZA_CAMPO);

		quadro.getChildren().add(pallino);
		quadro.getChildren().add(rettangolod);
		quadro.getChildren().add(rettangolos);

		rettangolod.setX(5);
		rettangolod.setY(50);

		rettangolos.setX(280);
		rettangolos.setY(50);


		Timeline timeline = new Timeline(new KeyFrame(
				Duration.millis(15),
				x -> aggiornaTimer()));
		timeline.setCycleCount(Timeline.INDEFINITE);
		timeline.play();
		
		Scene scena = new Scene(griglia);

		finestra.setTitle("Rimbalzo"); 
		finestra.setScene(scena);
		finestra.show();
		
		scena.setOnKeyPressed(event -> handleKeyPress(event.getCode()));

	}

	public void aggiornaTimer(){

		if(destra) {
			x++;
		}
		if(giu) {
			y++;
		}
		if(x==LARGHEZZA_CAMPO) {
			destra = false;
		}
		if(y==ALTEZZA_CAMPO) {
			giu = false;
		} 
		if(destra == false) {
			x--;
		}
		if(giu == false) {
			y--;
		}
		if(x==0) {
			destra = true;
		}
		if(y==0) {
			giu = true;
		}
		pallino.setCenterX(x);
		pallino.setCenterY(y);
		
		Bounds b1 =  pallino.getBoundsInParent();
        Bounds b2 = rettangolos.getBoundsInParent();
        if(b1.intersects(b2)) {
        	
        	destra = false;
        	
        }
        
        Bounds c1 =  pallino.getBoundsInParent();
        Bounds c2 = rettangolod.getBoundsInParent();
        if(c1.intersects(c2)) {
        	
        	destra = true;
        	
        	if(x==0) {
        		p1++;
        	}else if(x==LARGHEZZA_CAMPO){
        		
        		p2++;
        	}
        	
        	punteggio.setText(""+ p1+  " "+p2);
        	
        
		
	}
	}

private void handleKeyPress(KeyCode code) {
    if (code == KeyCode.W && paddleSinistroY > 0) {
        paddleSinistroY -= 5;
    } else if (code == KeyCode.S && paddleSinistroY < 140) {
        paddleSinistroY += 5;
    } else if (code == KeyCode.UP && paddleDestroY > 0) {
        paddleDestroY -= 5;
    } else if (code == KeyCode.DOWN && paddleDestroY < 140) {
        paddleDestroY += 5;
    }
    rettangolos.setY(paddleSinistroY);
    rettangolod.setY(paddleDestroY);
}


	public static void main(String args[]){
		launch();
	}
}
