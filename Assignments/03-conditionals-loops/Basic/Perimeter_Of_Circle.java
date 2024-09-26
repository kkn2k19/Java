// 03.04.2024
// Perimeter Of Circle
// Perimeter = 2 * 3.14 * radius

import java.util.Scanner;

public class Perimeter_Of_Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Provide radius of Circle : ");
        float radius = sc.nextFloat();
        double perimeter = 2 * 3.14 * radius;
        System.out.println("Perimeter Of Circle : " + perimeter);
    }
}

/*
 * Output --
 * 
 * Provide radius of Circle : 7.3
 * Perimeter Of Circle : 45.84400119781494
 */