// 28.03.2024
// https://www.java67.com/2019/05/how-to-find-largest-and-smallest-of-three-numbers-in-java.html

import java.util.Scanner;

public class MaximumAndMinimumNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Provide Three Integer Numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println("Maximum : " + maximum(a, b, c));
        System.out.println("Minimum : " + minimum(a, b, c));
    }

    static int maximum(int a, int b, int c) {
        int max;
        if (a >= b && a >= c) {
            max = a;
        } else if (b >= c) {
            max = b;
        } else {
            max = c;
        }
        return max;
    }

    static int minimum(int a, int b, int c) {
        int min;
        if (a >= b && b >= c) {
            min = c;
        } else if (c >= a && a >= b) {
            min = b;
        } else {
            min = a;
        }
        return min;
    }
}

/*
 * Outputs --
 * 
 * Provide Three Integer Numbers : 5 9 8
 * Maximum : 9
 * Minimum : 5
 */