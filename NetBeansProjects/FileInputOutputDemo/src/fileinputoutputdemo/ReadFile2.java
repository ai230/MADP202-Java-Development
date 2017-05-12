/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileinputoutputdemo;

import java.io.*;

/**
 *
 * @author yamamotoai
 */
public class ReadFile2 {
    public static void main(String[] args) {
        BufferedReader br1 = null;
        BufferedReader br2 = null;
        try {
            br1 = new BufferedReader(new FileReader("MyNewFile2.txt"));

            System.out.println("(1)------------------------------------------");
            System.out.println("Reading the file using readLine() method:");
            System.out.println("------------------------------------------");
            String str = br1.readLine();
            while (str != null) {
                System.out.println(str);
                str = br1.readLine();
            }
            System.out.println("");
            br2 = new BufferedReader(new FileReader("MyNewFile2.txt"));

            System.out.println("(2)------------------------------------------");
            System.out.println("Reading the file using read() method:");
            System.out.println("------------------------------------------");
            int num = 0;
            char ch;
            while ((num = br2.read()) != -1) {
                ch = (char) num;
                System.out.print(ch);
            }

        } catch (IOException ioe) {
            ioe.printStackTrace();
        } finally {
            try {
                if (br1 != null) {
                    br1.close();
                }
                if (br2 != null) {
                    br2.close();
                }
            } catch (IOException ioe) {
                System.out.println("Error in closing the BufferedReader");
            }
        }
    }
}
