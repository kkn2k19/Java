// 03.04.2024
// Perimeter Of Rhombus
// Perimeter[using side] = 4 * side 
// Perimeter[using diagonals] = 2 * (√((side1)^2 + (side2)^2))

import java.util.Scanner;

public class Perimeter_Of_Rhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Provide side length of Rhombus : ");
        float side = sc.nextFloat();
        double perimeter = 4 * side;
        System.out.println("Perimeter Of Rhombus : " + perimeter);
    }
}

/*
 * Output --
 * 
 * Provide side length of Rhombus : 7.3
 * Perimeter Of Rhombus : 29.200000762939453
 */