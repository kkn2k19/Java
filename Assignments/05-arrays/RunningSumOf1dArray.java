// https://leetcode.com/problems/running-sum-of-1d-array/description/

// 1480. Running Sum of 1d Array

import java.util.Arrays;
import java.util.Scanner;

public class RunningSumOf1dArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("provide size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Provide values : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(runningSum(arr)));
    }

    static int[] runningSum(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (i > 0) {
                nums[i] = nums[i - 1] + nums[i];
            }
        }
        return nums;
    }
}

/*
 * Outputs --
 * 
 * provide size of array : 4
 * Provide values : 1 2 3 4
 * [1, 3, 6, 10]
 */