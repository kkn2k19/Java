// https://leetcode.com/problems/shuffle-the-array/
// 1470. Shuffle the Array

import java.util.Arrays;
import java.util.Scanner;

public class ShuffleTheArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("provide size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Provide values : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(shuffle(arr, n / 2)));
    }

    static int[] shuffle(int[] nums, int n) {
        int[] arr = new int[nums.length];
        for (int i = 0; i < n; i++) {
            arr[2 * i] = nums[i];
            arr[2 * i + 1] = nums[n + i];
        }
        return arr;
    }
}

/*
 * Outputs --
 * 
 * provide size of array : 8
 * Provide values : 1 2 3 4 4 3 2 1
 * [1, 4, 2, 3, 3, 2, 4, 1]
 */