module src {
    requires javafx.controls;
    requires javafx.fxml;

    opens src to javafx.fxml;
    opens src.controlador;
    opens src.vista to javafx.fxml;
    exports src.controlador;
}