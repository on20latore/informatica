package it.edu.iisgubbio.grafica;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Pallini2 extends Application{

	public void start(Stage finestra) {
		Pane quadro = new Pane();
		int n1;
		for(int n=20; n<=100; n=n+20) {
			for(n1=20; n1<=100; n1=n1+20) {
				Circle cerchio = new Circle(7);
				cerchio.setFill(Color.BLUE);
				cerchio.setCenterY(n1);	
				cerchio.setCenterX(n);	
				quadro.getChildren().add(cerchio);
			}
		}		Scene scena = new Scene(quadro, 120, 120);
		finestra.setTitle("pallini");
		finestra.setScene(scena);
		finestra.show();

	}
	public static void main(String[] args) {
		launch(args);}
}
