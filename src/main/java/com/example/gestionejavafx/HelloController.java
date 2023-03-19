package com.example.gestionejavafx;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.Objects;

public class HelloController {

    @FXML
    private TextField user;

    @FXML
    private PasswordField password;

    @FXML
    private Label errore;
    

    @FXML
    protected void AccessoClick() {

        boolean accesso = false;
        for (int i = 0; i < Database.accessi.size(); i++)
            if(Objects.equals(Database.accessi.get(i).getUsername(), user.getText()) || Objects.equals(Database.accessi.get(i).getPassword(), password.getText())) {
                accesso = true;
            }
        if(accesso)
            {
                errore.setText("");
                try {
                    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Login.fxml"));
                    Parent root1 = fxmlLoader.load();
                    Stage stage = new Stage();
                    stage.initModality(Modality.APPLICATION_MODAL);
                    stage.setTitle("Login");
                    stage.setScene(new Scene(root1));
                    stage.show();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }else   errore.setText("Username e/o password errati");
    }

    @FXML
    protected void RegistratiClick() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Registrazione.fxml"));
            Parent root1 = fxmlLoader.load();
            Stage stage = new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setTitle("Registrati");
            stage.setScene(new Scene(root1));
            stage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}