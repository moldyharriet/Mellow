module com.example.mij {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.mij to javafx.fxml;
    exports com.example.mij;
}