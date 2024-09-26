// package Assignments.04-functions;

//4. Addition of two numbers in Java using method

import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Provide two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Sum : " + add(a, b));
    }

    static int add(int a, int b) {
        return a + b;
    }
}

/*
 * Outputs --
 * 
 * Provide two numbers : 7 3
 * Sum : 10
 */