// 03.04.2024
// Area Of Equilateral Triangle
// Area [any general triangle] = 1/2 * base * height 
// Area [Equilateral Triangle] = √3/4 × (side)2

import java.util.Scanner;

public class Area_Of_Equilateral_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Provide side length of Equilateral Triangle : ");
        float side = sc.nextFloat();
        double area = (float) (Math.sqrt(3) / 4) * side * side;
        System.out.println("Area of Equilateral Triangle : " + area);
    }
}

/*
 * Output --
 * 
 * Provide side length of Equilateral Triangle : 7.3
 * Area of Equilateral Triangle : 23.07524871826172
 */
