/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalassignment;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author yamamotoai
 */
public class FinalAssignment extends JFrame {

    ControllDB controllDB = new ControllDB();
    JComboBox combo;
    private JLabel displayLbl = new JLabel("$0");
    private JButton enterBtn = new JButton("Ent");
    private JButton clearBtn = new JButton("Clr");
    private JTextField txt = new JTextField("aaaaa");
    private JButton listBtn = new JButton("List");
    private JLabel totalAmountLbl = new JLabel("Total $");
    private JTable table;
    private DefaultTableModel tableModel;

    private String[] colName = {"#", "Date", "Property", "Category", "Amount($)"};

    private double number;
    private String numStr = "";

    String dateStr;
    String category;
    String property;

    public FinalAssignment() {

        //--Panel North--
        JPanel pn = new JPanel();
        pn.setLayout(new BoxLayout(pn, BoxLayout.Y_AXIS));

        //current date
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        Date date = new Date();
        dateStr = dateFormat.format(date);

        setTitle("Quick Money " + dateStr);

        //combo
        String categoryList[] = {"-- Choose Category--", "Rent", "Insurance", "Food", "Income"};
        combo = new JComboBox(categoryList);
        pn.add(combo);
        combo.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String cmd = (String) combo.getSelectedItem();

                if (cmd.matches("-- Choose Category--")) {
                    //none
                } else if (cmd.matches("Income")) {
                    property = "income";
                    category = cmd;
                } else {
                    property = "expence";
                    category = cmd;
                }
            }
        });

        //display amount label
        pn.add(displayLbl);

        //--panel Center--
        JPanel pc = new JPanel();
        pc.setLayout(new GridLayout(4, 4, 10, 10));

        String[] btnlbls = {"7", "8", "9", "4", "5", "6", "1", "2", "3", "00", "0", "."};
        for (int i = 0; i < btnlbls.length; i++) {
            JButton btn = new JButton(btnlbls[i]);
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

        //--panel East--
        JPanel pe = new JPanel();
        pe.setLayout(new BoxLayout(pe, BoxLayout.Y_AXIS));

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
                ArrayList<InputData> dataListEnt = new ArrayList<>();
                String cmd = e.getActionCommand();
                System.out.println("clicked " + cmd);

                //(1)read Database ->(2)create array of data ->(3)insert data to database
                dataListEnt = controllDB.readDB();

                try {
                    controllDB.insertDB(dataListEnt.size() + 1, property, category, number, dateStr);
                } catch (SQLException ex) {
                    Logger.getLogger(FinalAssignment.class.getName()).log(Level.SEVERE, null, ex);
                }
                //Reset selected 
                number = 0;
                numStr = "";
                display(number);
                combo.setSelectedIndex(0);
            }
        });

        pe.add(listBtn);
        listBtn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                ArrayList<InputData> dataList = new ArrayList<>();
                dataList = controllDB.readDB();

                double totalExpence = 0.0;
                double totalIncome = 0.0;
                tableModel.setRowCount(0);
                for (int i = 0; i < dataList.size(); i++) {

                    if (dataList.get(i).getProperty().matches("expence")) {

                        totalExpence += dataList.get(i).getAmount();

                    } else {

                        totalIncome = dataList.get(i).getAmount();;

                    }
                    Object[] obj = {dataList.get(i).getID(), dataList.get(i).getDate(), dataList.get(i).getProperty(), dataList.get(i).getCategory(), dataList.get(i).getAmount()};

                    tableModel.addRow(obj);
                }
                totalAmountLbl.setText("<Total Expence> $" + String.format("%.2f",totalExpence) + " <Total Income> $" + String.format("%.2f",totalIncome));
            }
        });

        //DefaultListModel
        DefaultListModel<String> listModel = new DefaultListModel<>();

        listModel.addElement("--Select--");
        listModel.addElement("Expence");
        listModel.addElement("Income");
        JList<String> JList = new JList<>(listModel);

        pe.add(JList);

        JList.addListSelectionListener(new ListSelectionListener() {

            @Override
            public void valueChanged(ListSelectionEvent e) {
                ArrayList<InputData> dataList = new ArrayList<>();
                dataList = controllDB.readDB();

                double totalExpence = 0.0;
                double totalIncome = 0.0;

                String selectedValue = JList.getSelectedValue();
                tableModel.setRowCount(0);
                if (selectedValue.matches("Expence")) {
                    for (int i = 0; i < dataList.size(); i++) {

                        if (dataList.get(i).getProperty().matches("expence")) {

                            totalExpence += dataList.get(i).getAmount();

                            Object[] obj = {dataList.get(i).getID(), dataList.get(i).getDate(), dataList.get(i).getProperty(), dataList.get(i).getCategory(), dataList.get(i).getAmount()};
                            tableModel.addRow(obj);
                        }
                    }
                    totalAmountLbl.setText("<Total Expence> $" + String.format("%.2f", totalExpence));

                } else if (selectedValue.matches("Income")) {
                    for (int i = 0; i < dataList.size(); i++) {

                        if (dataList.get(i).getProperty().matches("income")) {

                            totalIncome += dataList.get(i).getAmount();

                            Object[] obj = {dataList.get(i).getID(), dataList.get(i).getDate(), dataList.get(i).getProperty(), dataList.get(i).getCategory(), dataList.get(i).getAmount()};
                            tableModel.addRow(obj);
                        }
                    }
                    totalAmountLbl.setText(" <Total Income> $" + String.format("%.2f", totalIncome));
                } else {

                }
            }
        });

        //--Panel south--
        JPanel ps = new JPanel();

        ps.setLayout(new BoxLayout(ps, BoxLayout.Y_AXIS));

        ps.add(totalAmountLbl);
        tableModel = new DefaultTableModel(colName, 0);
        JTable table = new JTable(tableModel);
        JScrollPane scroll = new JScrollPane(table);

        scroll.setPreferredSize(new Dimension(600, 300));

        ps.add(scroll);

        getContentPane().add(pn, java.awt.BorderLayout.NORTH);
        getContentPane().add(pc, java.awt.BorderLayout.CENTER);
        getContentPane().add(pe, java.awt.BorderLayout.EAST);
        getContentPane().add(ps, java.awt.BorderLayout.SOUTH);
        pack();

        setVisible(true);
    }

    public void display(Double number) {
        displayLbl.setText("$" + number.toString());
    }

    public static void main(String[] args) {
        new FinalAssignment();
    }

}
