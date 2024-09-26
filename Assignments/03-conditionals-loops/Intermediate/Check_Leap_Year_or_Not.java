// 13.04.2024
// Check Leap Year or Not

import java.util.Scanner;

public class Check_Leap_Year_or_Not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Provide a year : ");
        int year = sc.nextInt();

        if (isLeapYear(year)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }

    public static boolean isLeapYear(int year) {
        // Leap year if divisible by 4 but not divisible by 100
        // Or, divisible by 400
        return ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
    }
}

/*
 * Output --
 * 
 * Provide a year : 2024
 * 2024 is a leap year.
 */