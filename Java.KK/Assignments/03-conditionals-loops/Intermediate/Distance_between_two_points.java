// 07.04.2024
// Calculate Distance Between Two Points 

import java.util.Scanner;

public class Distance_between_two_points {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two coordinates in form (x1, y1, x2, y2) : ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        double diffInX = Math.pow(x2 - x1, 2);
        double diffInY = Math.pow(y2 - y1, 2);
        double distance = Math.sqrt(diffInX + diffInY);
        System.out.println("Distance : " + distance);
    }
}

/*
 * Output --
 * 
 * Enter two coordinates in form (x1, y1, x2, y2) : 0 0 4 3
 * Distance : 5.0
 */