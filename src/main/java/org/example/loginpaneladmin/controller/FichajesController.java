package org.example.loginpaneladmin.controller;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class FichajesController {

    @FXML private TableView<?> tableFichajes;

    @FXML private TableColumn<?, ?> colCodigo;
    @FXML private TableColumn<?, ?> colFecha;
    @FXML private TableColumn<?, ?> colNombre;
    @FXML private TableColumn<?, ?> colTipo;

    @FXML
    public void initialize() {
        System.out.println("Lista de fichajes cargada");
    }
}