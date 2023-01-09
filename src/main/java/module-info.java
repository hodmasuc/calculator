module com.company.calculator.calculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.company.calculator.calculator to javafx.fxml;
    exports com.company.calculator.calculator;
}