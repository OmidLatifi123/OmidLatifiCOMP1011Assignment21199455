package com.example.comp1011assignment21199455.controllers;

import com.example.comp1011assignment21199455.api.APIUtility;
import com.example.comp1011assignment21199455.ChangeViews;
import com.example.comp1011assignment21199455.model.Inflation;
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
    private TextField searchBar;

    @FXML
    private Label titleLabel;

    @FXML
    private Label smallLabel;

    public Inflation inflationSelected;

    @FXML
    void DetailsScreen(ActionEvent event) throws IOException {
        ChangeViews.changeViews(event, "inflation-detail-view.fxml", inflationSelected);
    }

    @FXML
    void searchCountry(ActionEvent event) {
        ListView.getItems().clear();
        try {
            Inflation[] apiResponse = APIUtility.callAPI(searchBar.getText().trim());
            ListView.getItems().addAll(apiResponse);
            if (searchBar != null) {
                ListView.getItems();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        ListView.getItems().clear();

        ListView.getSelectionModel()
                .selectedItemProperty()
                .addListener((obs, oldValue, I)->{

                    inflationSelected = I;
                });
    }
}
