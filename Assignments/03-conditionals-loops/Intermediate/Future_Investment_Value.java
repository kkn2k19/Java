// 13.04.2024
// Future Investment Value

import java.util.Scanner;

public class Future_Investment_Value {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Provide Present Value, Interest Rate and Time Period in Years : ");
        float p = sc.nextFloat();
        float r = sc.nextFloat();
        float t = sc.nextFloat();
        double fiv = p * Math.pow((1 + r / 100), t);
        System.out.println("Future Investment Value is : " + fiv);
    }
}
