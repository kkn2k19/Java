// 03.04.2024
// Volume Of Sphere
// Volume = 4/3 * 3.14 * radius * radius * radius

import java.util.Scanner;

public class Volume_Of_Sphere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Provide radius of Sphere : ");
        float radius = sc.nextFloat();
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        System.out.println("Volume Of Sphere : " + volume);
    }
}

/*
 * Output --
 * 
 * Provide radius of Sphere : 7.3
 * Volume Of Sphere : 1629.5107268232596
 */