// 07.04.2024
// Calculate Commission Percentage

import java.util.Scanner;

public class Commission_Percentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Amount : ");
        float amount = sc.nextFloat();
        System.out.print("Enter commission Amount : ");
        float com = sc.nextFloat();
        double commission = (float) (com / amount) * 100;
        System.out.println("Commission Percentage = " + commission);
    }
}

/*
 * Output --
 * 
 * Enter Amount : 200
 * Enter commission Amount : 50
 * Commission Percentage = 25.0
 */