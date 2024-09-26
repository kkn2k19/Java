// 13.04.2024
// Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user. The list terminates when the user enters a zero.

import java.util.Scanner;

public class Different_Sums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Provide numbers : ");
        int n = -1;
        int nSum = 0;
        int eSum = 0;
        int oSum = 0;
        while (n != 0) {
            n = sc.nextInt();
            if (n < 0) {
                nSum += n;
            } else {
                if (n % 2 == 0) {
                    eSum += n;
                } else {
                    oSum += n;
                }
            }
        }
        System.out.println("Sum of Negative Numbers : " + nSum + "\nSum of Even Positive Numbers : " + eSum
                + "\nSum of Odd Positive Numbers : " + oSum);
    }
}

/*
 * Output --
 * 
 * Provide numbers : 1 2 3 4 5 6 7 8 9 -1 -2 -3 -4 -5 -6 -7 -8 -9 0
 * Sum of Negative Numbers : -45
 * Sum of Even Positive Numbers : 20
 * Sum of Odd Positive Numbers : 25
 */