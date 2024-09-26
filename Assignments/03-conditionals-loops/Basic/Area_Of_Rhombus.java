// 03.04.2024
// Area Of Rhombus
// Area [using Diagonals] = 1/2 * diagonal1 * diagonal2 
// Area [using base and height] = base(i.e. length of any side) * height

import java.util.Scanner;

public class Area_Of_Rhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Provide length of both Diagonals of Rhombus : ");
        float diagonal1 = sc.nextFloat();
        float diagonal2 = sc.nextFloat();
        double area = diagonal1 * diagonal2;
        System.out.println("Area of Rhombus : " + area);
    }
}

/*
 * Output --
 * 
 * Provide length of both Diagonals of Rhombus : 6.8 8.6
 * Area of Rhombus : 58.480003356933594
 */