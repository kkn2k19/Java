// package Assignments.04-functions;

// 2. Java Program to Check if a given integer is Odd or Even

import java.util.Scanner;

public class EvenOddNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        evenOdd(n);
    }
    
    static void evenOdd(int n) {
        if (n % 2 == 0) {
            System.out.println("Even Number.\n");
        } else {
            System.out.println("Odd Number.\n");
        }
    }
}

/*
 * Outputs --
 * 
 * 
 * Enter n : 17
 * Odd Number.
 * 
 */
