/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domains;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author CICCC-CIRAC
 */
public class DomainChecker {
        public static boolean isCotains(Set<String> domainSet, Set<String> domainSetSP) {
        if (domainSet.containsAll(domainSetSP)) {
            System.out.println("true");
            return true;
        } else {
            System.out.println("false");
            return false;
        }
    }

    public static void main(String[] args) {
        Set<String> domainSet = new TreeSet<String>();
        Set<String> domainSetSP = new TreeSet<String>();

        domainSetSP.add("badstuff.net");
        
        //read file
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader("blockeddomains.txt"));

            String str = reader.readLine();
            while (str != null) {
                System.out.println(str);
                str = reader.readLine();
                if (str != null) {
                    domainSet.add(str);
                }
            }

        } catch (IOException ioe) {
            ioe.printStackTrace();
            System.out.println("Error in ");
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }

            } catch (IOException ioe) {
                System.out.println("Error in closing the BufferedReader");
            }
        }
        System.out.println("domain = " + domainSet);

        isCotains(domainSet, domainSetSP);
    }//main end
}
