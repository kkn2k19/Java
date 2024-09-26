// 28.03.2024

import java.util.Scanner;

public class Area_Of_Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius of Circle : ");
        float radius = sc.nextFloat();
        double Area = 3.14 * radius * radius;
        System.out.println("Area of Circle : " + Area);
    }
}

/*
 * Output --
 * 
 * Enter Radius of Circle : 28.5
 * Area of Circle : 2550.465
 */