// 03.04.2024
// Volume Of Pyramid
// Volume = 1/3 * baseArea * height

import java.util.Scanner;

public class Volume_Of_Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Provide baseArea and height of Pyramid : ");
        float baseArea = sc.nextFloat();
        float height = sc.nextFloat();
        double volume = (1.0 / 3.0) * baseArea * height;
        System.out.println("Volume Of Pyramid : " + volume);
    }
}

/*
 * Output --
 * 
 * Provide baseArea and height of Pyramid : 7.3 3.7
 * Volume Of Pyramid : 9.003333684603376
 */
