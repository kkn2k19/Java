// 28.03.2024
// Find the area of an isosceles triangle whose length of the base and height is given ?

import java.util.Scanner;

public class Area_Of_Isoceles_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Provide Height and Base of Isoceles Triangle : ");
        float height = sc.nextFloat();
        float base = sc.nextFloat();
        double area = 0.5 * base * height;
        System.out.println("Area of Isoceles Triangle : " + area);
    }
}

/*
 * Outputs --
 * 
 * Provide Height and Base of Isoceles Triangle : 7.3 3.7
 * Area of Isoceles Triangle : 13.505000526905064
 */
