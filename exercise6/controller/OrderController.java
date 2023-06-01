package controller;

import model.*;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.Image;

public class OrderController implements Initializable {

    @FXML
    Image img1;

    @FXML
    Label qty1,qty2,qty3,item1,item2,item3,price1,price2,price3,sub1,sub2,sub3,total1,total2;

    double amt1, amt2, amt3, finalAmt;

    static BedroomLamp blamp = new BedroomLamp();
    static CeilingLamp clamp = new CeilingLamp();
    static WallLamp wlamp = new WallLamp();

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        if (HomeController.blamp.getProductStatus()){
            item1.setText(HomeController.blamp.getProductName());
            price1.setText(Double.toString(HomeController.blamp.getProductPrice()));
            qty1.setText(Double.toString(HomeController.blamp.getProductQuantity()));
            // item1.setVisible(true);
            // price1.setVisible(true);
            // qty1.setVisible(true);

            amt1 = HomeController.blamp.getProductPrice() * HomeController.blamp.getProductQuantity();
            sub1.setText(Double.toString(amt1));
        }

        if (HomeController.clamp.getProductStatus()){
            item2.setText(HomeController.clamp.getProductName());
            price2.setText(Double.toString(HomeController.clamp.getProductPrice()));
            qty2.setText(Double.toString(HomeController.clamp.getProductQuantity()));
            // item2.setVisible(true);
            // price2.setVisible(true);
            // qty2.setVisible(true);

            amt2 = HomeController.clamp.getProductPrice() * HomeController.clamp.getProductQuantity();
            sub2.setText(Double.toString(amt2));
        }

        if (HomeController.wlamp.getProductStatus()){
            item3.setText(HomeController.wlamp.getProductName());
            price3.setText(Double.toString(HomeController.wlamp.getProductPrice()));
            qty3.setText(Double.toString(HomeController.wlamp.getProductQuantity()));
            // item3.setVisible(true);
            // price3.setVisible(true);
            // qty3.setVisible(true);

            amt3 = HomeController.wlamp.getProductPrice() * HomeController.wlamp.getProductQuantity();
            sub3.setText(Double.toString(amt3));

            Double t1 = HomeController.wlamp.getProductPrice() * HomeController.blamp.getProductQuantity();
            Double t2 = HomeController.wlamp.getProductPrice() * HomeController.clamp.getProductQuantity();
            Double t3 = HomeController.wlamp.getProductPrice() * HomeController.wlamp.getProductQuantity();

            Double total1 = t1 + t2 + t3;

            total2.setText(Double.toString(total1));
        }
        
        
        
    }
    



}
