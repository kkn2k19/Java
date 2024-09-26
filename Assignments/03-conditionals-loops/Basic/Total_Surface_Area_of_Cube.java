// 03.04.2024
// Total Surface Area of Cube
// tsa = 6 * side * side

import java.util.Scanner;

public class Total_Surface_Area_of_Cube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Provide side length of Cube : ");
        float side = sc.nextFloat();
        double tsa = 6 * side * side;
        System.out.println("Total Surface Area of Cube : " + tsa);
    }
}

/*
 * Output --
 * 
 * Provide side length of Cube : 7.3
 * Total Surface Area of Cube : 319.7400207519531
 */