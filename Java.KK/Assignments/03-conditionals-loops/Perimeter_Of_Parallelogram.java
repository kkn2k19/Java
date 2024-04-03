// 03.04.2024
// Perimeter Of Parallelogram
// Perimeter = 2 * sum of length of adjacent sides 

import java.util.Scanner;

public class Perimeter_Of_Parallelogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Provide adjacent side lengths  of Parallelogram : ");
        float side1 = sc.nextFloat();
        float side2 = sc.nextFloat();
        double perimeter = 2 * (side1 + side2);
        System.out.println("Perimeter Of Parallelogram : " + perimeter);
    }
}

/*
 * Output --
 * 
 * Provide adjacent side lengths of Parallelogram : 7.3 3.7
 * Perimeter Of Parallelogram : 22.0
 */
