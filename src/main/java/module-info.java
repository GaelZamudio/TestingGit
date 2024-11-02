module com.testing.testinggit {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.testing.testinggit to javafx.fxml;
    exports com.testing.testinggit;
    exports com.testing.testinggit.controller;
    opens com.testing.testinggit.controller to javafx.fxml;
}