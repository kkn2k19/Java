// 03.04.2024
// Area Of Parallelogram
// Area = base * height

import java.util.Scanner;

public class Area_Of_Parallelogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Provide Base and Perpendicular Height of Parallelogram : ");
        float base = sc.nextFloat();
        float height = sc.nextFloat();
        double area = base * height;
        System.out.println("Area of Parallelogram : " + area);
    }
}

/*
 * Output --
 * 
 * Provide Base and Perpendicular Height of Parallelogram : 7.3 3.7
 * Area of Parallelogram : 27.010000228881836
 */