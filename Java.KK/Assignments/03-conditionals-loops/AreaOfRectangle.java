import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Provide height and width of Rectangle : ");
        float height = sc.nextFloat();
        float width = sc.nextFloat();
        double Area = height * width;
        System.out.println("Area of Rectangle : " + Area);
    }
}

/*
 * OUTPUTs--
 * 
 * Provide height and width of Rectangle : 7.3 3.7
 * Area of Rectangle : 27.010000228881836
 */