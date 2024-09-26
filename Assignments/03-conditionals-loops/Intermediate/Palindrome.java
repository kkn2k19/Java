// 13.04.2024
// Find if a number is palindrome or not

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Provide n : ");
        int n = sc.nextInt();
        System.out.println(checkPalindrome(n));
    }

    static boolean checkPalindrome(int n) {
        int i = n;
        int r = 0;
        while (i > 0) {
            int d = i % 10;
            r = r * 10 + d;
            i /= 10;
        }
        if (r == n) {
            return true;
        }
        return false;
    }
}

/*
 * Output --
 * 
 * Provide n : 123
 * false
 */