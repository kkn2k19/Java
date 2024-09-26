// package Assignments.04-functions;
// 7. Define a method to find out if a number is prime or not.

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Provide Number : ");
        int n = sc.nextInt();
        checkPrime(n);
    }

    static void checkPrime(int n) {
        if (n == 1) {
            System.out.println("Neither Prime nor Composite Number.");
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    System.out.println("Not a prime Number.");
                    return;
                }
            }
            System.out.println("Prime Number.");
        }
    }
}

/*
 * Outputs --
 * 
 * Provide Number : 7
 * Prime Number.
 */