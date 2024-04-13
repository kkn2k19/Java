// package Assignments.04-functions;

// Write a function to check if a given triplet is a Pythagorean triplet or not. (A Pythagorean triplet is when the sum of the square of two numbers is equal to the square of the third number).

// 12. https://www.geeksforgeeks.org/find-pythagorean-triplet-in-an-unsorted-array/

import java.util.Scanner;

public class PythagoreanTriplet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Provide Three Numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (checkPythagoreanTriplet(a, b, c)) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }

    static boolean checkPythagoreanTriplet(int a, int b, int c) {
        if ((a * a + b * b == c * c) || (a * a + c * c == b * b) || (b * b + c * c == a * a)) {
            return true;
        }
        return false;
    }
}

/*
 * Outputs --
 * 
 * Provide Three Numbers : 4 5 3
 * Yes
 */
