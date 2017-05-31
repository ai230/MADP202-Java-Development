/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package summervaleresort;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MenuDemo extends JFrame implements ActionListener {

    private JMenuBar menu = new JMenuBar(); //establish 4 menus 
    private JMenu menu1 = new JMenu("File");
    private JMenu menu2 = new JMenu("Rooms");
    private JMenu menu3 = new JMenu("Dining");
    private JMenu menu4 = new JMenu("Activities");
//menu items 
    private JMenuItem description = new JMenuItem("Description");
    private JMenuItem exit = new JMenuItem("Exit");
    private JMenuItem suite = new JMenuItem("Suite");
    private JMenuItem single = new JMenuItem("Single");
    private JMenuItem normal = new JMenuItem("Normal");
    private JMenuItem party = new JMenuItem("Party");
    private JMenuItem dining = new JMenuItem("Dining");
    private JMenuItem lodging = new JMenuItem("Lodging");
//three labels 
    private JLabel label1 = new JLabel("Welcome to the Summervale Resort");
    private JLabel label2 = new JLabel();
    private JLabel label3 = new JLabel();

//define three panels 
    private JPanel panel1 = new JPanel();
    private JPanel panel2 = new JPanel();
    private JPanel panel3 = new JPanel();

    public MenuDemo() {
//Frame properties 
        setTitle("Summervale Resort");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 1));
//Menu bar 
        setJMenuBar(menu);
//Adding menu items 
        menu.add(menu1);
        menu.add(menu2);
        menu.add(menu3);
        menu.add(menu4);
        menu1.add(description);
        menu1.add(exit);
        menu2.add(suite);
        menu2.add(single);
        menu3.add(normal);
        menu3.add(party);
        menu4.add(dining);
        menu4.add(lodging);
//Menu item actions 
        description.addActionListener(this);
        exit.addActionListener(this);
        suite.addActionListener(this);
        single.addActionListener(this);
        normal.addActionListener(this);
        party.addActionListener(this);
        dining.addActionListener(this);
        lodging.addActionListener(this);
//Adding labels 
        panel1.add(label1);
        panel2.add(label2);
        panel3.add(label3);
//adding panels 
        add(panel1);
        add(panel2);
        add(panel3);
//Set Fonts of labels 
        label1.setFont(new Font(null, Font.BOLD, 25));
        label2.setFont(new Font(null, Font.BOLD, 25));
        label3.setFont(new Font(null, Font.ITALIC, 25));
    }

    public void actionPerformed(ActionEvent e) {
//object for inputs 
        Object source = e.getSource();
//text for labels 
        label1.setText("Summervalve Resort");
        label2.setText("-------------------------");
//input items check 
        if (source == description) {
            label3.setText("We can provide awesome services for you");
        } else if (source == exit) {
            System.exit(0);
        } else if (source == suite) {
            label3.setText("Lovely 3-room suites from $189 per night");
        } else if (source == single) {
            label3.setText("Lovely single rooms from $100 per night");
        } else if (source == normal) {
            label3.setText("Lovely single family dining tables");
        } else if (source == party) {
            label3.setText("Lovely dining tables for big or small parties");
        } else if (source == lodging) {
            label3.setText("We can provide good lodging facilities");
        } else if (source == dining) {
            label3.setText("We can provide good dining facilities");
        }
    }
//Main method 

    public static void main(String[] args) {
//class object 
        MenuDemo resort = new MenuDemo();
        resort.setSize(550, 220);
        resort.setVisible(true);
    }
}
