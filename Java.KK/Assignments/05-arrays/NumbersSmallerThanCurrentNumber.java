// https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/

// 1365. How Many Numbers Are Smaller Than the Current Number 

import java.util.Scanner;
import java.util.Arrays;

public class NumbersSmallerThanCurrentNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Provide Array Size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Provide Values : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(smallerNumbersThanCurrent(arr)));
    }

    static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] count = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int countEach = 0;
            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[i] > nums[j]) {
                    countEach++;
                }
            }
            count[i] = countEach;
        }
        return count;
    }
}

/*
 * Outputs --
 * 
 * Provide Array Size : 5
 * Provide Values : 8 1 2 2 3
 * [4, 0, 1, 1, 3]
 */