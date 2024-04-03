// 28.03.2024
// Factorial

package Intermediate;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        System.out.println("Factorial of " + n + " = " + f);
    }
}


/*
OUTPUTs -- 

Enter n : 5
Factorial of 5 = 120
*/
