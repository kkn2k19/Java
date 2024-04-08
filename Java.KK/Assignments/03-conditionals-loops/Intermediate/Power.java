// 07.04.2024
// Power

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value and its power : ");
        int n = sc.nextInt();
        int p = sc.nextInt();
        double powerValue = Math.pow(n, p);
        System.out.println("Value to its Power : " + powerValue);
    }
}

/*
 * Output --
 * 
 * Enter value and its power : 5 3
 * Value to its Power : 125.0
 */