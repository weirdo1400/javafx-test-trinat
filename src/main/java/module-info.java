module com.example.javafxtesttrinat {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafxtesttrinat to javafx.fxml;
    exports com.example.javafxtesttrinat;
}