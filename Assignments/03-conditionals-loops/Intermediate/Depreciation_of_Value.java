// 07.04.2024
// Calculate Depreciation of Value 

import java.util.Scanner;

public class Depreciation_of_Value {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Provide Initial value : ");
        float ini = sc.nextFloat();
        System.out.print("Enter rate and time (in yrs.) : ");
        float rate = sc.nextFloat();
        float yrs = sc.nextFloat();
        double depreValue = ini * Math.pow((1 - rate / 100.0), yrs);
        System.out.println("Current Value : " + depreValue);
    }
}

/*
 * Output --
 * 
 * Provide Initial value : 500
 * Enter rate and time (in yrs.) : 10 3
 * Current Value : 364.50000000000006
 */