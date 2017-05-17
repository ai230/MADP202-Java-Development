/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/* Create a new JavaFX Project and named it TaxCalculator. 
 * Create two labels and two textfields and one button
 * it should ask for income and %tax. Calculate how much tax you have
 * to pay according to given income and %tax. when the button is 
 * pressed, It calculate the tax incurred and display it on the 
 * taxMessage Text element.
*/

package taxcalculator;

import java.awt.TextField;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author yamamotoai
 */
public class TaxCalculator extends Application {
    
    
    @Override
    public void start(Stage primaryStage) {
        Label lb1 = new Label("Income");
        Label lb2 = new Label("Tax");   
        Button btn = new Button("Calculate");
        TextField txt1 = new TextField();
        TextField txt2 = new TextField();
    
        primaryStage.setTitle("adding scene component");
        FlowPane fp1 = new FlowPane();
        FlowPane fp2 = new FlowPane();
        fp1.getChildren().addAll(lb1,lb2);
//        fp1.getChildren().addAll(lb1, txt1);
        fp2.getChildren().addAll(btn);
        fp1.setAlignment(Pos.CENTER);
        
        Scene scene = new Scene(fp1, 300, 250);
//        Scene scene = new Scene(fp1, 300, 250);
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
