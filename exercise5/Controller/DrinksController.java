package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;
import Model.*;

public class DrinksController {

    @FXML
    Button btn1, btn2, btn3, btn4, btn5;

    Chilsung chilsung = new Chilsung();
    ChupaChups chupaChups = new ChupaChups();
    Milkis milkis = new Milkis();
    Ramune ramune = new Ramune();
    Welchs welchs = new Welchs();

    public void initialize() {

        chilsung.setFlavor("Cider");
        chilsung.setPrice("70 pesos");

        chupaChups.setFlavor("Grapes");
        chupaChups.setPrice("65 pesos");

        milkis.setFlavor("Milk");
        milkis.setPrice("60 pesos");
        
        ramune.setFlavor("Orange");
        ramune.setPrice("95 pesos");

        welchs.setFlavor("Strawberry");
        welchs.setPrice("80 pesos");
    }

    public void showInfo(ActionEvent event) {

        Button sourceButton = (Button) event.getSource();
        Alert alert = new Alert(AlertType.INFORMATION);

        if (sourceButton.equals(btn1)) {
            alert.setContentText("Chilsung is " + chilsung.getFlavor() + " and " + chilsung.getPrice());
        }

        if (sourceButton == btn2) {
            alert.setContentText("Chupa Chups is " + chupaChups.getFlavor() + " and " + chupaChups.getPrice());
        }

        if (sourceButton == btn3) {
            alert.setContentText("Milkis is " + milkis.getFlavor() + " and " + milkis.getPrice());
        }

        if (sourceButton == btn4) {
            alert.setContentText("Ramune Sangria is " + ramune.getFlavor() + " and " + ramune.getPrice());
        }

        if (sourceButton == btn5) {
            alert.setContentText("Welch's is " + welchs.getFlavor() + " and " + welchs.getPrice());
        }

        alert.showAndWait();

    }
}