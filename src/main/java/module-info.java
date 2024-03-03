module rm.mellow {
    requires javafx.controls;
    requires javafx.fxml;


    opens rm.mellow to javafx.fxml;
    exports rm.mellow;
}