module com.testing.testinggit {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.testing.testinggit to javafx.fxml;
    exports com.testing.testinggit;
}