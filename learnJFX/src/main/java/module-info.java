module org.example.learnjfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.learnjfx to javafx.fxml;
    exports org.example.learnjfx;
}