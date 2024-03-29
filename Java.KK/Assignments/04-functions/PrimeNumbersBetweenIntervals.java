// https://www.geeksforgeeks.org/program-to-find-prime-numbers-between-given-interval/

// Program to find Prime Numbers Between given Interval

import java.util.Scanner;

public class PrimeNumbersBetweenIntervals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("provide two intervals : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        checkPrime(a, b);
    }

    static void checkPrime(int a, int b) {
        for (int i = a; i <= b; i++) {
            if (printPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    static boolean printPrime(int num) {
        if (num == 1) {
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}

/*
 * Outputs --
 * 
 * provide two intervals : 10 20
 * 11 13 17 19
 */