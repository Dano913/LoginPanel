package org.example.loginpaneladmin;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApp extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        Parent root = FXMLLoader.load(
                getClass().getResource("/login-view.fxml")
        );

        Scene scene = new Scene(root);

        stage.setScene(scene);

        stage.setWidth(900);
        stage.setHeight(600);

        stage.setResizable(false);

        stage.setTitle("Admin Login Panel");

        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}