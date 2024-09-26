// 13.04.2024
// Kunal is allowed to go out with his friends only on the even days of a given month. Write a program to count the number of days he can go out in the month of August.

import java.util.Scanner;

public class Count_No_of_Even_days {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Provide no. of days in Month : ");
        int n = sc.nextInt();
        int countEven = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                countEven++;
            }
        }
        System.out.println("No. of Even days : " + countEven);
    }
}

/*
 * Output --
 * 
 * Provide no. of days in Month : 31
 * No. of Even days : 15
 */