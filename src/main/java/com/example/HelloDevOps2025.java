package com.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class HelloDevOps2025 extends Application {

    @Override
    public void start(Stage stage) {
        Label label = new Label("Hello, JavaFX on Java 17!");
        Scene scene = new Scene(label, 400, 200);

        stage.setTitle("JavaFX Hello World");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
