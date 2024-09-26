// 13.04.2024
// Compound Interest
// A = P(1 + r/100)^t 
// CI = A - p = P(1 + r/100)^t - P

import java.util.Scanner;

public class Compound_Interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Provide Principal Amount, Annual Interest Rate and Time in years. : ");
        float p = sc.nextFloat();
        float r = sc.nextFloat();
        int t = sc.nextInt();
        double ci = p * Math.pow((1 + r / 100), t) - p;
        System.out.println("Compound Interest : " + ci);
    }
}

/*
 * Output --
 * 
 * Provide Principal Amount, Annual Interest Rate and Time in years. : 6000 10 2
 * Compound Interest : 1260.000314712528
 */