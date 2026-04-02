package org.example.loginpaneladmin.controller;

import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;

import java.util.Objects;

public class MainController {

    @FXML
    private StackPane rootPane;

    @FXML
    private ImageView background;

    @FXML
    private AnchorPane contentArea;

    @FXML
    public void initialize() {

        // 🔥 fondo fijo global
        Image img = new Image(
                Objects.requireNonNull(
                        getClass().getResource("/images/fondoLogin3FPRO.jpg")
                ).toExternalForm()
        );

        background.setImage(img);

        background.setFitWidth(900);
        background.setFitHeight(600);
        background.setPreserveRatio(false);
    }

    // 🔥 cambiar pantalla sin perder fondo
    public void setContent(javafx.scene.Parent view) {

        contentArea.getChildren().setAll(view);

        AnchorPane.setTopAnchor(view, 0.0);
        AnchorPane.setBottomAnchor(view, 0.0);
        AnchorPane.setLeftAnchor(view, 0.0);
        AnchorPane.setRightAnchor(view, 0.0);
    }
}