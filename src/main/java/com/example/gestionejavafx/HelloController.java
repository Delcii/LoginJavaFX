package com.example.gestionejavafx;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

public class HelloController {
    ArrayList<Utente> accessi = new ArrayList<>();

    @FXML
    private TextField user;

    @FXML
    private PasswordField password;
    

    @FXML
    protected void AccessoClick() {
     //   for (int i =0; i< accessi.size(); i++)
            //if(Objects.equals(accessi.get(i).getUsername(), user.getText()) || Objects.equals(accessi.get(i).getPassword(), password.getText()))
               // System.out.println("ciao");

    }

    @FXML
    protected void RegistratiClick() {
        Parent root;
        try {
            root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("hello-view.fxml")));
            Stage stage = new Stage();
            stage.setTitle("My New Stage Title");
            stage.setScene(new Scene(root, 450, 450));
            stage.show();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}