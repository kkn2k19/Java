// 13.04.2024
// Perfect Number

import java.util.Scanner;

public class Perfect_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Provide n : ");
        int n = sc.nextInt();
        System.out.println(checkPerfect(n));
    }

    static boolean checkPerfect(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum = sum + i;
            }
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
 * Provide n : 28
 * true
 */