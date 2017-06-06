
package sorting;

import java.util.Arrays;
import java.util.Random;

public class Sorting {

    public static void main(String[] args) {
        int length = 10;
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            Random rand = new Random();
            int n = rand.nextInt(10) + 1;
            arr[i] = n;
        }
        System.out.println("---Before Sort---");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.println("");
        BubbleSort(arr);
        System.out.println("");
        InsertionSort(arr);
        System.out.println("");
        SelectionSort(arr);

        System.out.println("\n----Sort----");
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
    }

    public static void BubbleSort(int[] num) {
        int temp, length = num.length;
        for (int i = 0; i < length; i++) {
            for (int j = 1; j < (length - i); j++) {
                if (num[j - 1] > num[j]) {
                    //swap elements  
                    temp = num[j - 1];
                    num[j - 1] = num[j];
                    num[j] = temp;
                }

            }
        }
        //Show the output
        System.out.println("---BubbleSort---");
        for (int k = 0; k < num.length; k++) {
            System.out.print(num[k] + ",");
        }
    }

    public static void InsertionSort(int[] arr) {
        int num, temp;
        for (int i = 1; i < arr.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                num = arr[i];
                if (arr[i] < num) {
                    //swap elements
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        //Show the output
        System.out.println("---InsertionSort---");
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + ",");
        }
    }

    public static void SelectionSort(int[] arr) {
        int num = 0, temp;
        for (int i = 0; i < arr.length; i++) {
            num = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[num] > arr[j]) {
                    num = j;
                }
            }
            //swap elements
            temp = arr[num];
            arr[num] = arr[i];
            arr[i] = temp;
        }
        //Show the output
        System.out.println("---SelectionSort---");
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + ",");
        }
    }
}
