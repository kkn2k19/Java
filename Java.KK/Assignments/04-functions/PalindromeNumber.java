// https://www.geeksforgeeks.org/check-if-a-number-is-palindrome/

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        if (checkPalindrome(n)) {
            System.out.println("Palindrome Number.\n");
        } else {
            System.out.println("not a palindrome number.\n");
        }
    }

    static boolean checkPalindrome(int n) {
        int i = n;
        int r = 0;
        while (i > 0) {
            int d = i % 10;
            r = r * 10 + d;
            i /= 10;
        }
        return (r == n);
    }
}

/*
 * Outputs --
 * 
 * Enter n : 12121
 * Palindrome Number.
 */