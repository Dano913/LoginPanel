package org.example.loginpaneladmin;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.example.loginpaneladmin.controller.MainController;

import java.util.Objects;

public class MainApp extends Application {

    private static MainController mainController;

    @Override
    public void start(Stage stage) throws Exception {

        FXMLLoader loader = new FXMLLoader(
                Objects.requireNonNull(
                        getClass().getResource("/org/example/loginpaneladmin/main.fxml")
                )
        );

        Parent root = loader.load();

        MainController controller = loader.getController();

        Scene scene = new Scene(root, 900, 600);

        stage.setScene(scene);
        stage.setTitle("Admin Panel");
        stage.setResizable(false);

        stage.show();

        controller.setContent(
                FXMLLoader.load(
                        Objects.requireNonNull(getClass().getResource("/org/example/loginpaneladmin/login-view.fxml"))
                )
        );
    }

    public static void loadView(String fxmlPath) {
        try {

            FXMLLoader loader = new FXMLLoader(
                    MainApp.class.getResource(fxmlPath)
            );

            Parent view = loader.load();

            mainController.setContent(view);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void stop() {
        System.out.println("App cerrada");
    }
}