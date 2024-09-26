// 13.04.2024
// Armstrong Number 

import java.util.Scanner;

public class Armstrong_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        // count digits
        int digits = countDigits(n);
        // check armstrong (any digits)
        System.out.println(checkArmstrong(n, digits));
    }

    static int countDigits(int n) {
        if (n == 0) {
            return 1;
        }
        int count = 0;
        while (n > 0) {
            count++;
            n /= 10;
        }
        return count;
    }

    static boolean checkArmstrong(int n, int digits) {
        int i = n;
        int sum = 0;
        while (i > 0) {
            int d = i % 10;
            sum += (int) Math.pow(d, digits);
            i /= 10;
        }
        if (sum == n) {
            return true;
        }
        return false;
    }
}

/*
 * Output --
 * 
 * Enter n : 153
 * true
 */