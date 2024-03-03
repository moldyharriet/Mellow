module nc.matrixinjava {
    requires javafx.controls;
    requires javafx.fxml;


    opens nc.matrixinjava to javafx.fxml;
    exports nc.matrixinjava;
}