import java.util.Scanner;

public class Area_Of_Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Provide length and breadth of Rectangle : ");
        float length = sc.nextFloat();
        float breadth = sc.nextFloat();
        double Area = length * breadth;
        System.out.println("Area of Rectangle : " + Area);
    }
}

/*
 * OUTPUTs--
 * 
 * Provide length and breadth of Rectangle : 7.3 3.7
 * Area of Rectangle : 27.010000228881836
 */