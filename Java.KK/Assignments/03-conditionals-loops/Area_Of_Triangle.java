
// package 03-conditionals-loops;
// 28.03.2024
import java.util.Scanner;

public class Area_Of_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Provide height and width of Triangle : ");
        float height = sc.nextFloat();
        float base = sc.nextFloat();
        double Area = height * base * 0.5;
        System.out.println("Area of Triangle  : " + Area);
    }
}

/*
 * OUTPUTS --
 * 
 * Provide height and width of Triangle : 7.3 3.7
 * Area of Triangle : 13.505000114440918
 */
