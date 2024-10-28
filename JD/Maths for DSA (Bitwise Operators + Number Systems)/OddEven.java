// Given a number N, find if it is Odd or Even.

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        // int n = 10;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println(check(n)); // it will return a string
    }

    static String check(int n) {
        if ((n & 1) == 1) {
            return "Odd";
        }
        return "Even";
    }
}

// OUTPUT --

// Enter a number: 14
// Even

// Enter a number: 15
// Odd