// 03.04.2024
// Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: While loop).

import java.util.Scanner;

public class Sum_of_Numbers_till_input_0_found {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Numbers. : ");
        int sum = 0;
        int n = sc.nextInt();
        while (n != 0) {
            sum += n;
            n = sc.nextInt();
        }
        System.out.println("Sum : " + sum);
    }
}

/*
 * Output --
 * 
 * Enter Numbers. : 1 2 3 4 5 6 7 8 9 10 0
 * Sum : 55
 */
