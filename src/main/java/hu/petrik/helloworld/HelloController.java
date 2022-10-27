package hu.petrik.helloworld;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private TextField nevMezo;
    @FXML
    private Label koszontesSzoveg;

    @FXML
    private void koszontes(ActionEvent actionEvent) {
        String nev = nevMezo.getText().trim();
        if (nev.isEmpty()) {
            Alert felugroAblak = new Alert(Alert.AlertType.WARNING);
            felugroAblak.setContentText("Kérem adja meg a nevét");
            //felugroAblak.getButtonTypes().add(ButtonType.CLOSE);
            felugroAblak.show();
            //felugroAblak.showAndWait();
            koszontesSzoveg.setText("");
        } else {
            koszontesSzoveg.setText("Hello " + nev);
        }
    }
}