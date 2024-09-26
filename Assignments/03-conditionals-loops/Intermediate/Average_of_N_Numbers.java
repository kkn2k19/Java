// 06.04.2024
// Average of N Numbers

import java.util.Scanner;

public class Average_of_N_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        System.out.print("Enter values : ");
        int count = 1;
        int sum = 0;
        while (count <= n) {
            int value = sc.nextInt();
            sum += value;
            count++;
        }
        double average = (double) sum / n;
        System.out.println("Average : " + average);
    }
}

/*
 * Output --
 * 
 * Enter n : 5
 * Enter values : 1 5 9 3 5
 * Average : 4.6
 */