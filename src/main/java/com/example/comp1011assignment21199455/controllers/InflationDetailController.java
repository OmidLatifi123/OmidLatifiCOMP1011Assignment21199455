package com.example.comp1011assignment21199455.controllers;

import com.example.comp1011assignment21199455.ChangeViews;
import com.example.comp1011assignment21199455.api.LoadData;
import com.example.comp1011assignment21199455.model.Inflation;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class InflationDetailController implements Initializable, LoadData {

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
    private Label titleLabel;

    @FXML
    void inflationScreen(ActionEvent event) throws IOException {
        ChangeViews.changeViews(event,"inflation-view.fxml" );
    }


    public void loadData(Inflation inflation){
        CountryLabel.setText(inflation.getCountry());
        MonthlyRateLabel.setText(Double.toString(inflation.getMonthlyRatePct()));
        YearlyRateLabel.setText(Double.toString(inflation.getYearlyRatePct()));
        TypeLabel.setText(inflation.getType());
        PeriodLabel.setText(inflation.getPeriod());
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
