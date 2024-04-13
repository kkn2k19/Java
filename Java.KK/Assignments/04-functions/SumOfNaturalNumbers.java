// package Assignment.04-functions;

// https://www.geeksforgeeks.org/program-find-sum-first-n-natural-numbers/

// 14. Write a function that returns the sum of first n natural numbers.

import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Provide n : ");
        int n = sc.nextInt();
        System.out.println("Sum : " + sumOfNaturalNumbers(n));
    }

    static int sumOfNaturalNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}

/*
 * Outputs --
 * 
 * Provide n : 10
 * Sum : 55
 */
