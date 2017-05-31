/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpoliticalframe;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

/**
 *
 * @author yamamotoai
 */
public class JPoliticalFrame extends JApplet {
    
    public JPoliticalFrame() {
        init();
    }
    
    public void init() {
        btn1 = new JButton("WEST");
        btn2 = new JButton("CENTER");
        btn3 = new JButton("EAST");
        panel1 = new JPanel();
        
        panel1.add(btn1);
        panel1.add(btn2);
        panel1.add(btn3);
        getContentPane().add(btn1, java.awt.BorderLayout.WEST);
        getContentPane().add(btn2, java.awt.BorderLayout.CENTER);
        getContentPane().add(btn3, java.awt.BorderLayout.EAST);
    }
    
    public static void main(String[] args) {
        new JPoliticalFrame();
    }
    private JButton btn1;
    private JButton btn2;
    private JButton btn3;
    private JButton btn4;
    private JButton btn5;
    private JButton btn6;
    private JPanel panel1;
}
