// 07.04.2024
// Calculate CGPA 

import java.util.Scanner;

public class CGPA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Provide all(5) subject marks : ");
        float marks1 = sc.nextFloat();
        float marks2 = sc.nextFloat();
        float marks3 = sc.nextFloat();
        float marks4 = sc.nextFloat();
        float marks5 = sc.nextFloat();
        double averagePercent = (marks1 + marks2 + marks3 + marks4 + marks5) / 5.0;
        double cgpa = averagePercent / 9.5;
        System.out.println("CGPA : " + cgpa);
    }
}

/*
 * Output --
 * 
 * Provide all(5) subject marks : 93 91 90 81 67
 * CGPA : 8.88421052631579
 */