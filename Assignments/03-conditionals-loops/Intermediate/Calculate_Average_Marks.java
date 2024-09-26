// 13.04.2024
// Calculate Average Marks 

import java.util.Scanner;

public class Calculate_Average_Marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of subjects : ");
        int n = sc.nextInt();
        int sum = 0;
        System.out.print("Enter all subjects marks : ");
        for (int i = 0; i < n; i++) {
            sum += sc.nextInt();
        }
        float avg = (float) sum / n;
        System.out.println("Average Marks : " + avg);
    }
}

/*
 * Output --
 * 
 * Enter no. of subjects : 5
 * Enter all subjects marks : 91 92 93 94 95
 * Average Marks : 93.0
 */