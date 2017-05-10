/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculation;

import java.io.*;

public class ReadFileDemo1 {

    public static void main(String[] args) {
        BufferedReader br = null;
        BufferedReader br2 = null;
        try {
            br = new BufferedReader(new FileReader("test.txt"));

            //One way of reading the file
            System.out.println("Reading the file using readLine() method:");
            String str = br.readLine();
            while (str != null) {
                System.out.println(str);
                str = br.readLine();
            }

            br2 = new BufferedReader(new FileReader("test.txt"));

            //Second way of reading the file
            System.out.println("------------------------------------------");
            System.out.println("Reading the file using read() method:");
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
                if (br != null) {
                    br.close();
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
