// 13.04.2024
// Sum Of A Digits Of Number

import java.util.Scanner;

public class Sum_of_Digits_of_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Provide n : ");
        int n = sc.nextInt();
        int sum = 0;
        while (n > 0) {
            int d = n % 10;
            sum += d;
            n /= 10;
        }
        System.out.println("Sum of digits : " + sum);
    }
}

/*
 * Output --
 * 
 * Provide n : 1234
 * Sum of digits : 10
 */