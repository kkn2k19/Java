// 03.04.2024
// Volume Of Cone
// Volume = 1/3 * 3.14 * radius * radius * height
// 1/3 = 0.33

import java.util.Scanner;

public class Volume_Of_Cone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Provide radius and height of Cone : ");
        float radius = sc.nextFloat();
        float height = sc.nextFloat();
        double volume = 0.33 * 3.14 * radius * radius * height;
        System.out.println("Volume Of Cone : " + volume);
    }
}

/*
 * Output --
 * 
 * Provide radius and height of Cone : 7.3 3.7
 * Volume Of Cone : 204.31067590953597
 */
