package it.edu.iisgubbio.animazioni;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Avanti extends Application{

	public void start(Stage finestra) {
		
		Circle cerchio = new Circle(10);
		
		Button bVia = new Button();
		
		bVia.setOnAction(e -> via);
		
		Pane quadro = new Pane();
		
		
		int n1;
				
				cerchio.setFill(Color.BLUE);
				cerchio.setCenterX(50);
				cerchio.setCenterY(50);
				quadro.getChildren().add(cerchio);
		
				Scene scena = new Scene(quadro, 120, 120);
		        finestra.setTitle("pallini");
		        finestra.setScene(scena);
		        finestra.show();

	}
	public static void main(String[] args) {
		launch(args);}
}

