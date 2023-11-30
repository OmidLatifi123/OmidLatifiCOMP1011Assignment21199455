package com.example.comp1011assignment21199455;

import com.example.comp1011assignment21199455.api.LoadData;
import com.example.comp1011assignment21199455.model.Inflation;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ChangeViews {
    public static void changeViews(ActionEvent event, String fxmlFileName) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource(fxmlFileName));
        Scene scene = new Scene(fxmlLoader.load());

        //get the stage from the action event
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        stage.setScene(scene);
        stage.show();
    }

    public static void changeViews(ActionEvent event, String fxmlFileName, Inflation inflation) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource(fxmlFileName));
        Scene scene = new Scene(fxmlLoader.load());

        Stage stage =(Stage)((Node)event.getSource()).getScene().getWindow();

        LoadData controller = fxmlLoader.getController();
        controller.loadData(inflation);

        stage.setScene(scene);
        stage.show();
    }
}
