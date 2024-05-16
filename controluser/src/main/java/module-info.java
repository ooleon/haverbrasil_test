module com.haverbr.controluser {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.haverbr.controluser to javafx.fxml;
    exports com.haverbr.controluser;
}
