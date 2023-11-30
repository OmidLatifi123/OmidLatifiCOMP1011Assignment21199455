module com.example.comp1011assignment21199455 {
    requires javafx.controls;
    requires javafx.fxml;
//    requires javafx.controls;
//    requires javafx.fxml;
    requires java.sql;
    requires java.net.http;
    requires com.google.gson;

    opens com.example.comp1011assignment21199455 to javafx.fxml, com.google.gson;
    exports com.example.comp1011assignment21199455;
    exports com.example.comp1011assignment21199455.model;
    opens com.example.comp1011assignment21199455.model to com.google.gson, javafx.fxml;
    exports com.example.comp1011assignment21199455.controllers;
    opens com.example.comp1011assignment21199455.controllers to com.google.gson, javafx.fxml;
    exports com.example.comp1011assignment21199455.api;
    opens com.example.comp1011assignment21199455.api to com.google.gson, javafx.fxml;
}