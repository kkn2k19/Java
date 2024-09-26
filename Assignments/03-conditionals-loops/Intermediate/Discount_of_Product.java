// 07.04.2024
// Calculate Discount of Product

import java.util.Scanner;

public class Discount_of_Product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Orignal price : ");
        float or = sc.nextFloat();
        System.out.print("Enter discount percent : ");
        float per = sc.nextFloat();
        double netAmount = or - (or * per / 100.0);
        System.out.print("net Payable Price : " + netAmount);
    }
}

/*
 * Output --
 * 
 * Enter Orignal price : 20
 * Enter discount percent : 5
 * net Payable Price : 19.0
 */