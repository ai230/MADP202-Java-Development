/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalassignment;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javax.swing.*;

/**
 *
 * @author yamamotoai
 */
public class FinalAssignment extends JFrame {

    //  Database
    static final String JDBC_DRIVER = "org.apache.derby.jdbc.ClientDriver";  
    static final String DB_URL = "jdbc:derby://localhost:1527/QuickMoney";
    //  Database credentials
    static final String USER = "APP";
    static final String PASS = " ";
    
    private final int WIDTH = 500, HEIGHT = 500;

    private JLabel display = new JLabel("$0");
    private JButton enterBtn = new JButton("Ent");
    private JButton clearBtn = new JButton("Clr");
    private JButton btn0 = new JButton("0");
    private JButton btn00 = new JButton("00");

    private double number;

    private String numStr = "";

    public FinalAssignment() {

        setSize(WIDTH, HEIGHT);
        setTitle("Calculator");

        //Panel North
        String income[] = {"Income", "Salaries", "Tax"};
        String expense[] = {"Expense", "Rent", "Insurance", "Food"};
        JComboBox combo1 = new JComboBox(income);
        JComboBox combo2 = new JComboBox(expense);
//        list.setBounds(100, 100, 75, 75);
        
        JPanel pn = new JPanel();
        pn.setLayout(new BoxLayout(pn, BoxLayout.Y_AXIS));
        pn.add(combo1);
        pn.add(combo2);
        pn.add(display);

        //panel Center
        JPanel pc = new JPanel();
        pc.setLayout(new GridLayout(4, 4, 10, 10));

        String buttonLabels = "789456123";
        for (int i = 0; i < buttonLabels.length(); i++) {
            JButton btn = new JButton(buttonLabels.substring(i, i + 1));
            pc.add(btn);
            btn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(java.awt.event.ActionEvent e) {

                    String cmd = e.getActionCommand();
                    numStr += cmd;
                    number = Double.parseDouble(numStr);
                    display(number);
                    System.err.println("clicked " + cmd);
                }
            });
        }

        //panel East
        JPanel pe = new JPanel();
        pe.setLayout(new BoxLayout(pe, BoxLayout.Y_AXIS));

        DefaultListModel<String> l1 = new DefaultListModel<>();
        l1.addElement("Income");
        l1.addElement("ExPense");
        JList<String> list = new JList<>(l1);
//        list.setBounds(100, 100, 75, 75);
        pe.add(list);
        
        pe.add(clearBtn);
        clearBtn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                number = 0;
                numStr = "";
                display(number);
            }

        });
        pe.add(enterBtn);
        enterBtn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                String cmd = e.getActionCommand();
                System.err.println("clicked " + cmd);
            }

        });
        //Panel south
        JPanel ps = new JPanel();
        ps.setLayout(new FlowLayout());
        ps.add(btn0);
        btn0.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                String cmd = e.getActionCommand();
                numStr += cmd;
                number = Double.parseDouble(numStr);
                display(number);
                System.err.println("clicked " + cmd);
            }

        });
        ps.add(btn00);
        btn00.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                String cmd = e.getActionCommand();
                numStr += cmd;
                number = Double.parseDouble(numStr);
                display(number);
                System.err.println("clicked " + cmd);
            }

        });
        
        getContentPane().add(pn, java.awt.BorderLayout.NORTH);
        getContentPane().add(pc, java.awt.BorderLayout.CENTER);
        getContentPane().add(pe, java.awt.BorderLayout.EAST);
        getContentPane().add(ps, java.awt.BorderLayout.SOUTH);
        pack();
        setVisible(true);
    }

    public void display(Double number) {
        System.out.println(numStr);
        display.setText("$" + number.toString());
    }

    public static void main(String[] args) {
        new FinalAssignment();

    }

}
