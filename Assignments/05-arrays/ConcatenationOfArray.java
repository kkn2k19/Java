// https://leetcode.com/problems/concatenation-of-array/description/
// 1929. Concatenation of Array

import java.util.Scanner;
import java.util.Arrays;

public class ConcatenationOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("provide size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Provide values : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(getConcatenation(arr)));
    }

    static int[] getConcatenation(int[] nums) {
        int[] ans = new int[2 * nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
            ans[nums.length + i] = nums[i];
        }
        return ans;
    }
}

/*
 * Outputs --
 * 
 * provide size of array : 3
 * Provide values : 1 2 1
 * [1, 2, 1, 1, 2, 1]
 */