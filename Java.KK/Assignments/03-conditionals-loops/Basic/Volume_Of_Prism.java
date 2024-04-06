// 03.04.2024
// Volume Of Prism
// Volume = baseArea * height
// baseArea depends on the shape of base 

import java.util.Scanner;

public class Volume_Of_Prism {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Provide baseArea and height of Prism : ");
        float baseArea = sc.nextFloat();
        float height = sc.nextFloat();
        double volume = baseArea * height;
        System.out.println("Volume Of Prism : " + volume);
    }
}

/*
 * Output --
 * 
 * Provide baseArea and height of Prism : 7.3 3.7
 * Volume Of Prism : 27.010000228881836
 */
