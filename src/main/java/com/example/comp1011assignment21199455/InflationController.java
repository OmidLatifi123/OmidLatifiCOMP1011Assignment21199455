package com.example.comp1011assignment21199455;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class InflationController implements Initializable {

    @FXML
    private ListView<Inflation> ListView;

    @FXML
    private Button detailsButton;

    @FXML
    private Label previewLabel;

    @FXML
    private TextField searchBar;

    @FXML
    private Button searchButton;

    @FXML
    void DetailsButton(ActionEvent event) throws IOException {
        ChangeViews.changeViews(event,"inflation-detail-view.fxml" );
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
