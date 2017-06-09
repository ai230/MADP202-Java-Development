/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quickmoney;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.event.AncestorListener;


public class Calculator extends JFrame {
    //implements ActionListener {

    private final int WIDTH = 500, HEIGHT = 500;

    private JLabel display = new JLabel("1234567890");
    private JButton enterBtn = new JButton("Ent");
    private JButton clearBtn = new JButton("Clr");
    private JButton btn2 = new JButton("2");
    private JButton btn3 = new JButton("3");
    private JButton btn4 = new JButton("4");

    private Controller controller;
    private double number;

    private String numStr = "";

    public Calculator() {

        setSize(WIDTH, HEIGHT);
        setTitle("Calculator");

        //Panel North
        JPanel pn = new JPanel();
        pn.setLayout(new FlowLayout());
        pn.add(display);

        //panel Center
        JPanel pc = new JPanel();
        pc.setLayout(new GridLayout(4, 4, 10, 10));

        String buttonLabels = "789/456*123-0.=+";
        for (int i = 0; i < buttonLabels.length(); i++) {
            JButton b = new JButton(buttonLabels.substring(i, i + 1));
            pc.add(b);
            b.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String cmd = e.getActionCommand();
                    System.out.println("OK" + cmd);

                    switch (cmd) {
                        case "1":
                        case "2":
                        case "3":
                        case "4":
                        case "5":
                        case "6":
                        case "7":
                        case "8":
                        case "9":
                        case "0":    
                            numStr = numStr + cmd;
                            number = Double.parseDouble(numStr);
                            display(numStr);
                            return;
                        case "Clr":
                            number = 0;
                            numStr = "0";
                            display(numStr);
                            return;
                        case "Ent":


                    }
                }
            });
        }

        //panel East
        JPanel pe = new JPanel();
        pe.setLayout(new BoxLayout(pe, BoxLayout.Y_AXIS));

        DefaultListModel<String> l1 = new DefaultListModel<>();
        l1.addElement("Item1");
        l1.addElement("Item2");
        l1.addElement("Item3");
        l1.addElement("Item4");
        JList<String> list = new JList<>(l1);
//        list.setBounds(100, 100, 75, 75);
        pe.add(list);
        pe.add(clearBtn);
        clearBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                number = 0;
                numStr = "0";
                display(numStr);
                numStr = "";
            }
        });
        pe.add(enterBtn);

        JPanel pW = new JPanel();
        pW.setLayout(new FlowLayout());

        getContentPane().add(pn, java.awt.BorderLayout.NORTH);
        getContentPane().add(pc, java.awt.BorderLayout.CENTER);
        getContentPane().add(pe, java.awt.BorderLayout.EAST);

        pack();
        setVisible(true);
    }

    public void display(String numStr) {
        System.out.println(numStr);
        display.setText(numStr);
    }

    private void calculate(double n) {
//        if (operator.equals("+")) {
//            result += n;
//        } else if (operator.equals("-")) {
//            result -= n;
//        } else if (operator.equals("*")) {
//            result *= n;
//        } else if (operator.equals("/")) {
//            result /= n;
//        } else if (operator.equals("=")) {
//            result = n;
//        }
//        display.setText("" + result);
    }

    public static void main(String[] args) {
        new Calculator();
//    JFrame.setDefaultLookAndFeelDecorated(true);
//    JFrame frame = new JFrame();
//    frame.setTitle("Calculator");
//    frame.setSize(200, 200);
//    frame.addWindowListener(new WindowAdapter() {
//      public void windowClosing(WindowEvent e) {
//        System.exit(0);
//      }
//    });
// 
//    Container contentPane = frame.getContentPane();
//    contentPane.add(new Calculator());
//    frame.show();
    }

//    public void actionPerformed(ActionEvent evt) {
//    String cmd = evt.getActionCommand();
//    }
//    public void setController(Controller cont) {
//        controller = cont;
//    }
}
