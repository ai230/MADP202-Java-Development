/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package writephonelist;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author yamamotoai
 */
public class DisplaySelectedNumbers {

    public static void main(String[] args) {

        String fileName = ("DisplaySelectedNumbers.txt");

        int i;
        for (i = 0; i < 2; i++) {
            StringBuilder str = new StringBuilder("");

            Scanner scanFName = new Scanner(System.in);
            System.out.print("Input first names: ");
            str.append(scanFName.nextLine());

            Scanner scanLName = new Scanner(System.in);
            System.out.print("Input last names: ");
            str.append("," + scanLName.nextLine());

            Scanner scanPhone = new Scanner(System.in);
            System.out.print("Input phone numbers: ");
            str.append("," + scanPhone.nextLine());

            //write in a file
            BufferedWriter bw = null;
            try {
                //Specify the file name and path here
                File file = new File(fileName);

                /* This logic will make sure that the file 
                 * gets created if it is not present at the
                 * specified location*/
                if (!file.exists()) {
                    file.createNewFile();
                }

                FileWriter fw = new FileWriter(file, true);
                bw = new BufferedWriter(fw);
                PrintWriter pw = new PrintWriter(bw);
                pw.println(str.toString());
                System.out.println("File written Successfully");

            } catch (IOException ioe) {
                ioe.printStackTrace();
            } finally {
                try {
                    if (bw != null) {
                        bw.close();
                    }
                } catch (Exception ex) {
                    System.out.println("Error in closing the BufferedWriter" + ex);
                }
            }
            System.out.println("------------------------------------------");
        }

        Scanner scan = new Scanner(System.in);
        System.out.print("Input given name: ");
        CharSequence given = scan.nextLine();
        System.out.println("------------------------------------------");

        //read the file//
        BufferedReader br = null;
        BufferedReader br2 = null;
        try {
            br = new BufferedReader(new FileReader(fileName));

            String readStr = br.readLine();

            while (readStr != null) {
                if (readStr.contains(given)) {
                    System.out.println(readStr);
                }
                readStr = br.readLine();
            }

        } catch (IOException ioe) {
            ioe.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException ioe) {
                System.out.println("Error in closing the BufferedReader");
            }
        }

    }
}
