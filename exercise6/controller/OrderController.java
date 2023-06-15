package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;


public class OrderController implements Initializable {

    @FXML
    Label p1, p2, p3, q1, q2, q3, price1, price2, price3, total;
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        p1.setText(HomeController.blamp.getProductName());
        p2.setText(HomeController.clamp.getProductName());
        p3.setText(HomeController.wlamp.getProductName());

        q1.setText(Double.toString(HomeController.blamp.getProductQuantity()));
        q2.setText(Double.toString(HomeController.clamp.getProductQuantity()));
        q3.setText(Double.toString(HomeController.wlamp.getProductQuantity()));

        price1.setText(Double.toString(HomeController.blamp.getProductPrice()));
        price2.setText(Double.toString(HomeController.clamp.getProductPrice()));    
        price3.setText(Double.toString(HomeController.wlamp.getProductPrice()));




        total.setText(Double.toString(CheckoutController.finalAmount));
    }
    
}
