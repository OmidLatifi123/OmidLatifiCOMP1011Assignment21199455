package com.example.comp1011assignment21199455;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class InflationDetailController implements Initializable {

    @FXML
    private Button BackBtn;

    @FXML
    private Label CountryLabel;

    @FXML
    private Label MonthlyRateLabel;

    @FXML
    private Label PeriodLabel;

    @FXML
    private Label TypeLabel;

    @FXML
    private Label YearlyRateLabel;

    @FXML
    void BackBtn(ActionEvent event) throws IOException {
        ChangeViews.changeViews(event,"inflation-view.fxml" );
    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
