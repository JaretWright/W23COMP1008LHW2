package com.example.w23comp1008lhw2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

//"extends" means that we are creating a custom version of the Application class
//We inherit all of the methods and instance variables from the Application class
//and can add our custom components to it
public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("card-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Card Viewer");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}