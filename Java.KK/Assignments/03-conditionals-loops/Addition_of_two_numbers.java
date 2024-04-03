// 03.04.2024
// Addition of Two Numbers

import java.util.Scanner;

public class Addition_of_two_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("Sum : " + sum);
    }
}

/*
 * Output --
 * 
 * Enter two numbers : 7 3
 * Sum : 10
 */
