// Write a function to check if a given triplet is a Pythagorean triplet or not. (A Pythagorean triplet is when the sum of the square of two numbers is equal to the square of the third number).

// https://www.geeksforgeeks.org/find-pythagorean-triplet-in-an-unsorted-array/

import java.util.Scanner;

public class PythagoreanTripletArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Provide size of Array : ");
        int n = sc.nextInt();
        int[] arr = new int[10];
        System.out.print("Provide Array element : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        if (checkPythagoreanTriplet(arr, n)) {
            System.out.println("Yes found");
        } else {
            System.out.println("not found");
        }
    }

    static boolean checkPythagoreanTriplet(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    if ((arr[i] * arr[i] + arr[j] * arr[j] == arr[k] * arr[k])
                            || (arr[i] * arr[i] + arr[k] * arr[k] == arr[j] * arr[j])
                            || (arr[j] * arr[j] + arr[k] * arr[k] == arr[i] * arr[i])) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}

/*
 * Outputs --
 * 
 * Provide size of Array : 5
 * Provide Array element : 1 2 3 4 5
 * Yes found
 */