package it.edu.iisgubbio.animazioni;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Timer extends Application{    
  Label testo;
  int n=100;
    Timeline timeline;
  @Override
  public void start(Stage primaryStage) throws Exception {
	  Button start = new Button("start");
	  Button pause = new Button("pause");
    testo = new Label("finestra timer");
    GridPane griglia = new GridPane();
    griglia.add(testo, 1, 1);
    griglia.add(start, 0, 0);
    griglia.add(pause, 2, 0, 2, 1);
    
    Scene scene = new Scene(griglia,200,100);
    
    primaryStage.setTitle("Timer!"); 
    primaryStage.setScene(scene);
    primaryStage.show();
    
    start.setOnAction(e -> startTimer());
    pause.setOnAction(e -> pauseTimer());
    
    timeline = new Timeline(new KeyFrame(
      Duration.seconds(1),
      x -> aggiornaTimer()));
    timeline.setCycleCount(Timeline.INDEFINITE);
  }
  
  private void startTimer() {
	  
	  timeline.play();
  }
  private void pauseTimer() {
	  
	  timeline.pause();
	  
  }

  private void aggiornaTimer(){
    testo.setText(""+ (n--));
  }
    
  public static void main(String args[]){
    launch();
  }
}