package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import java.net.*;
import java.io.*;
import java.awt.*;



public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private Hyperlink hyperlink;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Registrado correctamente");
    }

    @FXML
    void openLink(ActionEvent event) throws URISyntaxException, IOException {
        System.out.println("Link clickeado");
        Desktop.getDesktop().browse(new URI("https://docs.oracle.com/javase/8/javafx/api/javafx/scene/layout/FlowPane.html"));
    }
}