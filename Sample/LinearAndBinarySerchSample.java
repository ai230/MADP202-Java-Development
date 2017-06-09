/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serchpractice;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author CICCC-CIRAC
 */
public class SerchPractice {

    public static void main(String[] args) {
        Integer[] arr = new Integer[10];
        for (int i = 0; i < 10; i++) {
            Random rand = new Random();
            int n = rand.nextInt(30) + 1;
            arr[i] = n;
        }

        int min = 0;
        int max = arr.length - 1;

        Random rand = new Random();
        int n = rand.nextInt(30) + 1;
        int target = n;
        System.out.println("Target: " + target);
        linearSerch(arr, min, max, target);
        binarySerch(arr, min, max, target);
    }

    public static <T> void linearSerch(T[] data, int min, int max, T target) {

        int index = min;
        boolean found = false;
        while (!found && index <= max) {
            found = data[index].equals(target);
            index++;
        }
        if (found) {
            for (int i = 0; i < data.length; i++) {
                System.out.print(data[i] + ", ");
            }
            System.out.println("\n");
            System.out.println("Target: " + target + " index: " + (index - 1));
        } else {
            System.out.println("Target is not found");
        }
    }

    public static Integer binarySerch(Integer[] data, int min, int max, int target) {
        int mid = (min + max) / 2;

        Arrays.sort(data);
        if (min > max) {
            System.out.println("Target is not found");
            return -1;
        } else {
            if (data[mid] < target) {
                return binarySerch(data, mid + 1, max, target);
            } else if (data[mid] > target) {
                return binarySerch(data, min, mid - 1, target);
            } else {
                for (int i = 0; i < data.length; i++) {
                    System.out.print(data[i] + ", ");
                }
                System.out.println("\n");
                System.out.println(" Target: " + target + " Position: " + mid);
                return mid;
            }
        }
    }
}
