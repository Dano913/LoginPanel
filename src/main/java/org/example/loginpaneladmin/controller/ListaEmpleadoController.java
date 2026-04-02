package org.example.loginpaneladmin.controller;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class ListaEmpleadoController {

    @FXML private TableView<?> tableEmpleados;

    @FXML private TableColumn<?, ?> colId;
    @FXML private TableColumn<?, ?> colNombre;
    @FXML private TableColumn<?, ?> colEdad;
    @FXML private TableColumn<?, ?> colGenero;

    @FXML
    public void initialize() {
        System.out.println("Lista de empleados cargada");
    }
}