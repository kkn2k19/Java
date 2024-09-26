// 03.04.2024
// Take integer inputs till the user enters 0 and print the largest of all numbers (HINT: While loop).

import java.util.Scanner;

public class Largest_from_Numbers_until_0_found {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Numbers. : ");
        int max = Integer.MIN_VALUE;
        int n = sc.nextInt();
        while (n != 0) {
            if (max < n) {
                max = n;
            }
            n = sc.nextInt();
        }
        System.out.println("Largest : " + max);
    }
}

/*
 * Output --
 * 
 * Enter Numbers. : 1 2 3 4 56 7 89 32 3 0
 * Largest : 89
 */