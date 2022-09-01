module com.example.demo121 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.example.demo121 to javafx.fxml;
    exports com.example.demo121;
}