// 03.04.2024
// Perimeter Of Rectangle
// Perimeter = 2 * (length + breadth) 

import java.util.Scanner;

public class Perimeter_Of_Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Provide length and breadth of Rectangle : ");
        float length = sc.nextFloat();
        float breadth = sc.nextFloat();
        double perimeter = 2 * (length + breadth);
        System.out.println("Perimeter Of Rectangle : " + perimeter);
    }
}

/*
 * Output --
 * 
 * Provide length and breadth of Rectangle : 7.3 3.7
 * Perimeter Of Rectangle : 22.0
 */