package org.example.loginpaneladmin;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class LoginController {

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Label messageLabel;

    @FXML
    private void handleLogin() {

        String user = usernameField.getText();
        String pass = passwordField.getText();

        if (user == null || user.isBlank() || pass == null || pass.isBlank()) {
            messageLabel.setText("⚠ Rellena todos los campos");
            return;
        }

        if (user.equals("admin") && pass.equals("1234")) {

            messageLabel.setText("✅ Correcto");

            // 🔥 cambiar a dashboard (SIN cambiar Scene)
            MainApp.loadView("/org/example/loginpaneladmin/dashboard-view.fxml");

        } else {
            messageLabel.setText("❌ Credenciales incorrectas");
        }
    }
}