// 13.04.2024
// Sum of N Numbers

import java.util.Scanner;

public class Sum_of_N_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of Numbers : ");
        int n = sc.nextInt();
        int sum = 0;
        System.out.print("Enter all Numbers : ");
        for (int i = 0; i < n; i++) {
            sum += sc.nextInt();
        }
        System.out.println("Sum of all Numbers : " + sum);
    }
}

/*
 * Output --
 * 
 * Enter no. of Numbers : 5
 * Enter all Numbers : 1 5 9 3 4
 * Sum of all Numbers : 22
 */