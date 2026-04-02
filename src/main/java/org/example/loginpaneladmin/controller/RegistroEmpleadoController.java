package org.example.loginpaneladmin.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.example.loginpaneladmin.Model.Empleado;

public class RegistroEmpleadoController {

    @FXML private TextField nameField;
    @FXML private TextField ageField;
    @FXML private TextField genderField;

    @FXML private TextField emailField;
    @FXML private TextField phoneField;
    @FXML private TextField departmentField;
    @FXML private TextField roleField;

    @FXML private Label statusLabel;

    @FXML
    private void handleCreate() {

        try {
            Empleado employee = new Empleado();

            employee.setNombre(nameField.getText());
            employee.setEdad(Integer.parseInt(ageField.getText()));
            employee.setGenero(genderField.getText());

            // campos extra (si los añades al modelo)
            // employee.setEmail(emailField.getText());
            // employee.setPhone(phoneField.getText());
            // employee.setDepartment(departmentField.getText());
            // employee.setRole(roleField.getText());

            System.out.println("Empleado creado: " + employee.getNombre());

            statusLabel.setText("Empleado registrado correctamente");

            clearForm();

        } catch (Exception e) {
            statusLabel.setText("Error en los datos");
            e.printStackTrace();
        }
    }

    private void clearForm() {
        nameField.clear();
        ageField.clear();
        genderField.clear();
        emailField.clear();
        phoneField.clear();
        departmentField.clear();
        roleField.clear();
    }
}