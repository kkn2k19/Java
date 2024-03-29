// package Assignments.04-functions;
// Java program to multiply two numbers using method

import java.util.Scanner;

public class ProductOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Provide two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(product(a, b));
    }

    static int product(int a, int b) {
        return a * b;
    }
}

/*
 * Outputs --
 * 
 * Provide two numbers : 7 3
 * 21
 */
