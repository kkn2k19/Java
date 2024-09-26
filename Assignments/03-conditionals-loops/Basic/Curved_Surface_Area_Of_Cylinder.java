// 03.04.2024
// Curved Surface Area of Cylinder
// csa = 2*radius*(height + 3.14*radius)
// csa = area of top circle + area of bottom circle + area of walls

import java.util.Scanner;

public class Curved_Surface_Area_Of_Cylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Provide radius and height of Cylinder : ");
        float radius = sc.nextFloat();
        float height = sc.nextFloat();
        double csa = 2 * radius * (height + 3.14 * radius);
        System.out.println("Curved Surface Area of Cylinder : " + csa);
    }
}

/*
 * Output --
 * 
 * Provide radius and height of Cylinder : 7.3 3.7
 * Curved Surface Area of Cylinder : 388.68121959571863
 */