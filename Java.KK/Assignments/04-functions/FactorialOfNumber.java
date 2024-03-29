// Write a program to print the factorial of a number by defining a method named
// 'Factorial'. Factorial of any number n is represented by n! and is equal to 1
// * 2 * 3 * .... * (n-1) *n. E.g.-
/*
 * 4! = 1 * 2 * 3 * 4 = 24
 * 3! = 3 * 2 * 1 = 6
 * 2! = 2 * 1 = 2
 * Also,
 * 1! = 1
 * 0! = 1
 */

import java.util.Scanner;

public class FactorialOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        System.out.println("factorial of " + n + " : " + factorial(n));
    }

    static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }
}

/*
 * Outputs --
 * 
 * Enter n : 5
 * factorial of 5 : 120
 */