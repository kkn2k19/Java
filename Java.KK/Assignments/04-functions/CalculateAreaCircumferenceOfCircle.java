// package Assignments.04-functions;
// Java Program to Calculate Area and Circumference of Circle

import java.util.Scanner;

public class CalculateAreaCircumferenceOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Provide radius : ");
        float rad = sc.nextFloat();
        System.out.println("Area of Circle : " + area(rad));
        System.out.println("Circumference of Circle : " + circumference(rad));
    }

    static double area(float rad) {
        return 3.14 * rad * rad;
    }

    static double circumference(float rad) {
        return 2 * 3.14 * rad;
    }
}

/*
 * Outputs --
 * 
 * Provide radius : 7.3
 * Area of Circle : 167.3306087440492
 * Circumference of Circle : 45.84400119781494
 */