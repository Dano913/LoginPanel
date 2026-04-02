package org.example.loginpaneladmin;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class DetalleEmpleadoController {

    @FXML private Label nameLabel;
    @FXML private Label ageLabel;
    @FXML private Label genderLabel;
    @FXML private Label emailLabel;
    @FXML private Label phoneLabel;
    @FXML private Label departmentLabel;
    @FXML private Label roleLabel;

    @FXML private TableView<Attendance> attendanceTable;
    @FXML private TableColumn<Attendance, String> dateColumn;
    @FXML private TableColumn<Attendance, String> typeColumn;
    @FXML private TableColumn<Attendance, String> timeColumn;

    private Employee employee;

    @FXML
    public void initialize() {

        // columnas básicas (si no usas PropertyValueFactory aún puedes ignorarlo)
        dateColumn.setCellValueFactory(data -> data.getValue().dateProperty());
        typeColumn.setCellValueFactory(data -> data.getValue().typeProperty());
        timeColumn.setCellValueFactory(data -> data.getValue().timeProperty());
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;

        nameLabel.setText("Nombre: " + employee.getNombre());
        ageLabel.setText("Edad: " + employee.getEdad());
        genderLabel.setText("Género: " + employee.getGenero());

        emailLabel.setText("Email: " + employee.getEmail());
        phoneLabel.setText("Teléfono: " + employee.getPhone());
        departmentLabel.setText("Departamento: " + employee.getDepartment());
        roleLabel.setText("Cargo: " + employee.getRole());

        loadAttendance();
    }

    private void loadAttendance() {

        attendanceTable.setItems(
                FXCollections.observableArrayList(
                        new Attendance("2026-01-20", "Entrada", "08:00"),
                        new Attendance("2026-01-20", "Salida", "16:00")
                )
        );
    }

    @FXML
    private void handleEdit() {
        System.out.println("Editar empleado...");
    }

    @FXML
    private void handleClose() {
        System.out.println("Cerrar panel...");
    }
}