// 03.04.2024
// Perimeter Of Equilateral Triangle
// Perimeter = 3 * side

import java.util.Scanner;

public class Perimeter_Of_Equilateral_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Provide side length of Equilateral Triangle : ");
        float side = sc.nextFloat();
        double perimeter = 3 * side;
        System.out.println("Perimeter Of Equilateral Triangle : " + perimeter);
    }
}

/*
 * Output --
 * 
 * Provide side length of Equilateral Triangle : 7.3
 * Perimeter Of Equilateral Triangle : 21.900001525878906
 */