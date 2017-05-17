/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switching;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author yamamotoai
 */
public class Switching extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Label lbl1 = new Label("Scene 1");
        Label lbl2 = new Label("Scene 2");
        
        Button btn1 = new Button();
        Button btn2 = new Button();
        btn1.setText("Click me ,,,1");
        btn2.setText("Click me ,,,2");
        
        GridPane gp1 = new GridPane();
        GridPane gp2 = new GridPane();
        gp1.add(lbl1, 0, 0);
        gp1.add(btn1, 0, 1);
        
        gp2.add(lbl2, 0, 0);
        gp2.add(btn2, 0, 1);
        
        Scene s1 = new Scene(gp1, 400, 400, Color.AQUA);
        Scene s2 = new Scene(gp2, 400, 400, Color.CORAL);
        
        btn1.setOnAction(event -> primaryStage.setScene(s2));
        btn2.setOnAction(event -> primaryStage.setScene(s1));
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(s1);
        
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
