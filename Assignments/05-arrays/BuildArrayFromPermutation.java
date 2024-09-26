// https://leetcode.com/problems/build-array-from-permutation/description/
// 1920. Build Array from Permutation

import java.util.Scanner;
import java.util.Arrays;

public class BuildArrayFromPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("provide size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Provide values : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(buildArray(arr)));
    }

    static int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}

/*
 * Outputs --
 * 
 * provide size of array : 6
 * Provide values : 0 2 1 5 3 4
 * [0, 1, 2, 4, 5, 3]
 */