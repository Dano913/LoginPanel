package org.example.loginpaneladmin.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PerfilEmpleadoController {

    @FXML private TextField idField;
    @FXML private TextField nameField;
    @FXML private TextField ageField;
    @FXML private TextField genderField;

    @FXML private Label statusLabel;
    @FXML private Label lastCheckLabel;

    private boolean isWorking = false;

    private Employee employee;

    // 📥 cargar datos del empleado
    public void setEmployee(Employee employee) {
        this.employee = employee;

        idField.setText(String.valueOf(employee.getId()));
        nameField.setText(employee.getNombre());
        ageField.setText(String.valueOf(employee.getEdad()));
        genderField.setText(employee.getGenero());
    }

    // ⏱️ FICHAR ENTRADA
    @FXML
    private void handleCheckIn() {
        isWorking = true;
        statusLabel.setText("Estado: Trabajando");
        lastCheckLabel.setText("Último fichaje: Entrada registrada");
        System.out.println("Entrada registrada");
    }

    // ⏱️ FICHAR SALIDA
    @FXML
    private void handleCheckOut() {
        isWorking = false;
        statusLabel.setText("Estado: Fuera de turno");
        lastCheckLabel.setText("Último fichaje: Salida registrada");
        System.out.println("Salida registrada");
    }

    // 💾 GUARDAR DATOS
    @FXML
    private void handleSave() {
        employee.setNombre(nameField.getText());
        employee.setEdad(Integer.parseInt(ageField.getText()));
        employee.setGenero(genderField.getText());

        System.out.println("Empleado actualizado: " + employee.getNombre());
    }
}