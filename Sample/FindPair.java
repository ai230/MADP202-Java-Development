package serchpractice;

public class FindPair {

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 7, 10};
        int x = 15;
        int difference;
        int n1;
        int n2;

        int lastDiff = 0;
        int result1 = 0;
        int result2 = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                n1 = arr[i];
                n2 = arr[j];

                difference = Math.abs(x - (n1 + n2));
                if (i == 0 && j == 1) {
                    lastDiff = difference;
                    result1 = n1;
                    result2 = n2;
                }
                if (difference < lastDiff) {

                    lastDiff = difference;
                    result1 = n1;
                    result2 = n2;
                    System.out.println(result1 + " and " + result2 + "difference is " + difference);
                }
            }
        }
        System.out.println("result: " + result1 + " and " + result2);
    }
}
