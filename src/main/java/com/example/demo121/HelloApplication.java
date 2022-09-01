package com.example.demo121;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Pane pane = new Pane();

        // draw a circle
        Circle circle = new Circle();
        circle.setRadius(200);
        circle.setCenterX(250);
        circle.setCenterY(250);
        circle.setFill(null);
        circle.setStroke(Color.BLACK);
        circle.setStrokeWidth(3);
        pane.getChildren().add(circle);

        // label the circle 12 3 6 9
        Text text12 = new Text( "12" );
        text12.setLayoutX(250);
        text12.setLayoutY(50+15);
        pane.getChildren().add(text12);

        Text text3 = new Text( "3" );
        text3.setLayoutX(50+200+200-15);
        text3.setLayoutY(50+200);
        pane.getChildren().add(text3);

        Text text6 = new Text( "6" );
        text6.setLayoutX(250);
        text6.setLayoutY(50+200+200-15);
        pane.getChildren().add(text6);

        Text text9 = new Text( "9" );
        text9.setLayoutX(50+15);
        text9.setLayoutY(50+200);
        pane.getChildren().add(text9);

        // draw min arm
        //first draw the arm  - length will be 150
        Line minLine = new Line();
        minLine.setStrokeWidth(3);
        minLine.setStartX(250);
        minLine.setStartY(250);
        minLine.setEndX(250);
        minLine.setEndY(100);
        pane.getChildren().add(minLine);

        //second draw hour arm  - length will be 100
        Line hourLine = new Line();
        hourLine.setStrokeWidth(5);
        hourLine.setStartX(250);
        hourLine.setStartY(250);
        hourLine.setEndX(50+200+100);
        hourLine.setEndY(50+200);
        pane.getChildren().add(hourLine);


        Scene scene = new Scene(pane,500,500);
        stage.setScene(scene);
        stage.setTitle("Analog Clock");
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}