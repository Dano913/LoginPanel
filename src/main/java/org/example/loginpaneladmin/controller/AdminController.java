package org.example.loginpaneladmin.controller;

import javafx.fxml.FXML;

public class AdminController {

    @FXML
    private void openAdminProfile() {
        System.out.println("Abrir perfil admin");
    }

    @FXML
    private void openAddEmployee() {
        System.out.println("Abrir add empleado");
    }

    @FXML
    private void openAttendanceList() {
        System.out.println("Abrir lista fichajes");
    }

    @FXML
    private void openEmployeeList() {
        System.out.println("Abrir lista empleados");
    }
}