package com.example.comp1011assignment21199455;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("start-screen.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Latifi Inflation Report");
        stage.setScene(scene);
        stage.show();

        //Code for altering the app icon/logo
        Image image = new Image(getClass().getResource("icon.png").toString());
        stage.getIcons().add(image);
    }

    public static void main(String[] args) {
        launch();
    }
}