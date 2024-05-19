module com.haverbr.controluser {
    requires javafx.controls;
    requires javafx.fxml;
    
//    requires javafx.base;
//    requires javafx.controlsEmpty;
//    requires javafx.fxmlEmpty;
    

    opens com.haverbr.controluser to javafx.fxml;
    exports com.haverbr.controluser;
}
