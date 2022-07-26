package com.example.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    public static String url;
    private void setUrl(){
        if(url == null){
            url = "hello-view.fxml";
        }
    }
    @Override
    public void start(Stage stage) throws IOException {
        setUrl();
        setStage(url,stage);
        stage.show();
    }
    public void setStage(String url,Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(url));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
    }
    public static void main(String[] args) {
        launch();
    }
}