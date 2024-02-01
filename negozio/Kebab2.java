package it.edu.iisgubbio.negozio;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Kebab2 extends Application {

	ComboBox<String> cbCarne = new ComboBox<>();
	ComboBox<String> cbContorno = new ComboBox<>();
	ComboBox<String> cbSalse = new ComboBox<>();

	Label eTotale = new Label();

	public void start(Stage finestra) {

		Label eC = new Label("carne");
		Label eCon = new Label("contorno");
		Label eS = new Label("salse");

		cbCarne.getItems().add("pollo");
		cbCarne.getItems().add("maiale");
		cbCarne.getItems().add("vitello");
		cbCarne.getItems().add("tofu");

		cbContorno.getItems().add("insalata");
		cbContorno.getItems().add("cipolla");
		cbContorno.getItems().add("pomodoro");
		cbContorno.getItems().add("carota");

		cbSalse.getItems().add("maionese");
		cbSalse.getItems().add("piccante");
		cbSalse.getItems().add("yougurt");
		cbSalse.getItems().add("tzatziki");

		cbCarne.getSelectionModel().select(0);
		cbContorno.getSelectionModel().select(0);
		cbSalse.getSelectionModel().select(0);

		Button bTotale = new Button("totale");

		GridPane griglia = new GridPane();

		griglia.setPadding(new Insets(10, 10, 10, 10));
		griglia.setHgap(10); 
		griglia.setVgap(10);

		griglia.add(cbCarne, 0, 1);
		griglia.add(cbContorno, 0, 3);
		griglia.add(cbSalse, 0, 5);
		griglia.add(bTotale, 0, 6);
		griglia.add(eTotale, 0, 7);
		griglia.add(eC, 0, 0);
		griglia.add(eCon, 0, 2);
		griglia.add(eS, 0, 4);

		griglia.setGridLinesVisible(false);

		bTotale.setMaxWidth(300);

		cbCarne.setMaxWidth(300);
		cbContorno.setMaxWidth(300);
		cbSalse.setMaxWidth(300);

		Scene scena = new Scene(griglia);

		finestra.setTitle("Kebab");
		finestra.setScene(scena);
		finestra.show();

		bTotale.setOnAction(e -> calcoli());
		
		finestra.addEventHandler(KeyEvent.KEY_PRESSED, event -> bTotale.fire());

	}

	public void calcoli() {

		String carne = cbCarne.getValue();
		String contorno = cbContorno.getValue();
		String salse = cbSalse.getValue();

		double total = 0.0;
		
// primo switch
		
		switch ( carne )  {

		case "maiale":
			total = total + 2.5;
			break;
		case "vitello":
			total = total + 4.0;
			break;
		default:
			total += 3.0;
		}
		
// secondo switch
		
		switch ( contorno ) {

		case "insalata":
		case "cipolla":
			total = total + 0.5;
			break;
		default:
			total += 1.0;
		}
		
// terzo switch
		
		switch ( salse ) {

		case "piccante":
			total = total + 1.0;
			break;
		default:
			total += 0.5;
		}
		
		total += 1;

		eTotale.setText("Totale: " + total + "€");
	}



	public static void main(String[] args) {
		launch(args);
	}

}

