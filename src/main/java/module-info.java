module com.example.gestionejavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.gestionejavafx to javafx.fxml;
    exports com.example.gestionejavafx;
}