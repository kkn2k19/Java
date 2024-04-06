// 03.04.2024
// Volume Of Cylinder
// Volume = 3.14 * radius * radius * height

import java.util.Scanner;

public class Volume_Of_Cylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Provide radius and height of Cylinder : ");
        float radius = sc.nextFloat();
        float height = sc.nextFloat();
        double volume = 3.14 * radius * radius * height;
        System.out.println("Volume Of Cylinder : " + volume);
    }
}

/*
 * Output --
 * 
 * Provide radius and height of Cylinder : 7.3 3.7
 * Volume Of Cylinder : 619.1232603319272
 */
