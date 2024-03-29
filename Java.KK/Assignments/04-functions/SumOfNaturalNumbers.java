// https://www.geeksforgeeks.org/program-find-sum-first-n-natural-numbers/

// Program to find sum of first n natural numbers

import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Provide n : ");
        int n = sc.nextInt();
        System.out.println("Sum : " + SumOfNaturalNumbers(n));
    }

    static int SumOfNaturalNumbers(int n) {
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