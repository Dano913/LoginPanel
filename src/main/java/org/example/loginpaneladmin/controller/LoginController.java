package org.example.loginpaneladmin.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Label errorLabel;

    @FXML
    private void initialize() {
        // Ocultar error al iniciar la vista
        errorLabel.setVisible(false);
    }

    @FXML
    private void handleLogin() {

        String user = usernameField.getText();
        String pass = passwordField.getText();

        // Evita NullPointerException si algún campo viene vacío
        if (user == null || pass == null) {
            showError("Rellena todos los campos");
            return;
        }

        if (user.equals("admin") && pass.equals("1234")) {
            errorLabel.setVisible(false);
            System.out.println("Login correcto");
        } else {
            showError("Credenciales incorrectas");
        }
    }

    private void showError(String message) {
        errorLabel.setText(message);
        errorLabel.setVisible(true);
    }
}