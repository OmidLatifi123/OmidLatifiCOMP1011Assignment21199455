package com.example.comp1011assignment21199455.controllers;

import com.example.comp1011assignment21199455.ChangeViews;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class StartScreenController implements Initializable {

    @FXML
    void nextScreen(ActionEvent event) throws IOException {
        ChangeViews.changeViews(event, "inflation-view.fxml");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
