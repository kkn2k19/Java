import java.util.Scanner;
import java.util.Arrays;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // array of primitives --
        int[] arr = new int[5];
        arr[0] = 98;
        arr[1] = 99;
        arr[2] = 100;
        arr[3] = 101;
        arr[4] = 102;
        // [98, 99, 100, 101, 102]
        // System.out.println(arr[3]);

        // input using for loops
        // for (int i = 0; i < arr.length; i++) {
        // arr[i] = sc.nextInt();
        // }

        // printing
        // for (int i = 0; i < arr.length; i++) {
        // System.out.print(arr[i] + " ");
        // }

        // for-each loop
        // for(int num : arr){ // for every element in array, print the element
        // System.out.print(num + " "); // here num represents element of the array
        // }

        // System.out.println(arr[5]); // error - index out of bound

        // best way to print an array
        // System.out.println(Arrays.toString(arr));

        // array of objects --
        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = sc.next();
        }

        System.out.println(Arrays.toString(str));

        // modify
        str[1] = "Karan";

        System.out.println(Arrays.toString(str));
        /*
         * a b c d
         * [a, b, c, d]
         * [a, Karan, c, d]
         */
    }
}
