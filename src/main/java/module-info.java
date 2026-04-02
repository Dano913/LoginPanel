module org.example.loginpaneladmin {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.loginpaneladmin to javafx.fxml;
    exports org.example.loginpaneladmin;
}