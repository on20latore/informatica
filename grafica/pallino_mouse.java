package it.edu.iisgubbio.grafica;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class pallino_mouse extends Application {
	
	Pane quadro = new Pane();

	public void start(Stage finestra) {
		
		quadro.setPrefSize(300, 300);
					
				Scene scena = new Scene(quadro);
				
				finestra.setTitle("Rimbalzo"); 
				finestra.setScene(scena);
				finestra.show();
				
				quadro.addEventHandler(MouseEvent.MOUSE_CLICKED,e -> gestore(e));
					
			}
	private void gestore(MouseEvent e) {
		
		if (e.getButton().equals(MouseButton.SECONDARY)) {
			Circle cerchio = new Circle(10);
			cerchio.setFill(Color.BLUE);
			cerchio.setCenterY( e.getY());	
		    cerchio.setCenterX( e.getX());	
			quadro.getChildren().add(cerchio);
		}
		
		if (e.getButton().equals(MouseButton.PRIMARY)) {
			Circle cerchio = new Circle(10);
			cerchio.setFill(Color.RED);
			cerchio.setCenterY( e.getY() );	
		    cerchio.setCenterX( e.getX() );	
			quadro.getChildren().add(cerchio);
		}	
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}



