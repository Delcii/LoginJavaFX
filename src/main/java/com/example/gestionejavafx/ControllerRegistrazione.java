package com.example.gestionejavafx;

import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ControllerRegistrazione {
    @FXML
    private TextField user;
    @FXML
    private PasswordField password;

    @FXML
    protected void RegistrazioneClick() {
        Database.accessi.add(new Utente(user.getText(),password.getText()));
        Stage stage = (Stage) user.getScene().getWindow();
        stage.close();
    }
}
