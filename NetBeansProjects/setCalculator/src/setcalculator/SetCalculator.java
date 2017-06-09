/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package setcalculator;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author yamamotoai
 */
public class SetCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean fin = false;
        boolean fin2 = false;
        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        Scanner ope = new Scanner(System.in);

        Set<Integer> ts1 = new TreeSet<>();
        Set<Integer> ts2 = new TreeSet<>();

        int no1;
        int no2;
        while (!fin) {
            System.out.print("Scan1: ");
            String s = scan1.nextLine();
            if (s.matches("q")) {
                fin = true;
                break;
            }
            if (isNumeric(s)) {
                no1 = Integer.parseInt(s);
                ts1.add(no1);
            }
        }
        fin = false;

        while (!fin) {
            System.out.print("Scan2: ");
            String s = scan2.nextLine();
            if (s.matches("q")) {
                fin = true;
                break;
            }
            if (isNumeric(s)) {
                no2 = Integer.parseInt(s);
                ts2.add(no2);
            }
        }
        fin = false;

        System.out.println("+: union, *: intersection, -: difference ");
        System.out.print("Enter: ");
        String o = ope.nextLine();

        System.out.println("Input");
        System.out.println("------");

        switch (o) {
            case "+":
                System.out.println(ts1 + " + " + ts2);

                printOutput();
                ts1.addAll(ts2);
                System.out.println(ts1);
                break;
            case "*":
                System.out.println(ts1 + " + " + ts2);

                printOutput();
                ts1.retainAll(ts2);
                System.out.println(ts1);
                break;
            case "-":
                System.out.println(ts1 + " + " + ts2);

                printOutput();
                ts1.removeAll(ts2);
                System.out.println(ts1);
                break;
            case "q":
                fin2 = false;
                break;
            default:
                System.out.println("Input error!!");
                break;
        }
    }

    public static boolean isNumeric(String str) {
        try {
            double d = Double.parseDouble(str);
        } catch (NumberFormatException nfe) {
            System.out.println("not number!!");
            return false;
        }
        return true;
    }

    public static void printOutput() {
        System.out.println("Output");
        System.out.println("------");
    }
}
