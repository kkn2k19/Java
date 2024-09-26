// 03.04.2024
// Fibonacci Series 
// 0 1 1 2 3 5 8 13 21 34

import java.util.Scanner;

public class Fibonacci_Series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of term : ");
        int n = sc.nextInt();

        int a = 0;
        int b = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int temp = a + b;
            a = b;
            b = temp;
        }
    }
}

/*
 * Output --
 * 
 * Enter no. of term : 10
 * 0 1 1 2 3 5 8 13 21 34
 */