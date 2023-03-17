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
import javafx.stage.StageStyle;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

public class HelloController {
    ArrayList<Utente> accessi = new ArrayList<>();

    @FXML
    private TextField user,NuovoUser;

    @FXML
    private PasswordField password,NuovaPassword;
    

    @FXML
    protected void AccessoClick() {
        for (int i = 0; i < accessi.size(); i++)
            if(Objects.equals(accessi.get(i).getUsername(), user.getText()) || Objects.equals(accessi.get(i).getPassword(), password.getText()))
            {
                try {
                    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Login.fxml"));
                    Parent root1 = (Parent) fxmlLoader.load();
                    Stage stage = new Stage();
                    stage.initModality(Modality.APPLICATION_MODAL);
                    stage.setTitle("Login");
                    stage.setScene(new Scene(root1));
                    stage.show();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        if()
    }

    @FXML
    protected void RegistratiClick() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Registrazione.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setTitle("Registrati");
            stage.setScene(new Scene(root1));
            stage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    @FXML
    protected void NuovoClick() {
        accessi.add(new Utente(NuovoUser.getText(),NuovaPassword.getText()));
        Stage stage = (Stage) NuovoUser.getScene().getWindow();
        stage.close();
    }
}