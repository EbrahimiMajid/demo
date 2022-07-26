package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {

    }

    public void newgame(MouseEvent mouseEvent) {
        HelloApplication.url = "fx2.fxml";
        System.out.println("1234");
    }
}