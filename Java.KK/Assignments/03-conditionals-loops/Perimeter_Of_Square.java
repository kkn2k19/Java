// 03.04.2024
// Perimeter Of Square
// Perimeter = 4 * side 

import java.util.Scanner;

public class  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Provide side length of Square : ");
        float side = sc.nextFloat();
        double perimeter = 4 * side;
        System.out.println("Perimeter Of Square : " + perimeter);
    }
}

/*
 * Output --
 * 
 * Provide side length of Square : 7.3
 * Perimeter Of Square : 29.200000762939453
 */
