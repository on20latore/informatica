package it.edu.iisgubbio.prove;


	import javafx.application.Application;
	import javafx.geometry.Insets;
	import javafx.scene.Scene;
	import javafx.scene.control.Button;
	import javafx.scene.control.Label;
	import javafx.scene.control.TextField;
	import javafx.scene.layout.GridPane;
	import javafx.stage.Stage;
	import javafx.scene.input.KeyEvent;

	public class tpisit extends Application {

		TextField tNumran = new TextField();
		
		Label eRisultato1 = new Label("");
		Label eRisultato2 = new Label("");
		
		public void start(Stage finestra) {
			
			Label eNum = new Label("numero");

			Button bCalcolasoluzioni = new Button("prova");

			GridPane griglia = new GridPane();

			griglia.setPadding(new Insets(10, 10, 10, 10));
			griglia.setHgap(10); 
			griglia.setVgap(10);

			griglia.add(eNum, 0, 0);
			griglia.add(bCalcolasoluzioni, 0, 1, 2, 1);
			griglia.add(tNumran, 1, 0);
			griglia.add(eRisultato1, 0, 2, 1, 1);
			griglia.add(eRisultato2, 0, 3, 1, 1);

			griglia.setGridLinesVisible(false);

			bCalcolasoluzioni.setMaxWidth(600);

			eRisultato1.setMaxWidth(600);
			eRisultato2.setMaxWidth(600);



			Scene scena = new Scene(griglia, 250, 200);

			finestra.setTitle("cerchio");
			finestra.setScene(scena);
			finestra.show();

			bCalcolasoluzioni.setOnAction(e -> calcoli());

			finestra.addEventHandler(KeyEvent.KEY_PRESSED, event -> bCalcolasoluzioni.fire());
			
		}
		
		public void calcoli() {
			
			double raggio = Double.parseDouble(tNumran.getText());
			
			double area;
			
			area = 3.14 * (raggio * raggio);
			
			eRisultato1.setText(""+area);
			eRisultato2.setText(""+area);
			
			
		}
		
		 public static void main(String[] args) {
		       launch(args);
		     }


		
	}

