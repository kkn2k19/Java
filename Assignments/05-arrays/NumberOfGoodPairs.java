// https://leetcode.com/problems/number-of-good-pairs/description/

// 1512. Number of Good Pairs

import java.util.Scanner;

public class NumberOfGoodPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Provide Array Size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Provide Values : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("No. of Good pairs : " + numIdenticalPairs(arr));
    }

    static int numIdenticalPairs(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
        }
        return count;
    }
}

/*
 * Outputs --
 * 
 * Provide Array Size : 6
 * Provide Values : 1 2 3 1 1 3
 * No. of Good pairs : 4
 */