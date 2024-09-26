// https://leetcode.com/problems/create-target-array-in-the-given-order/description/
// 1389. Create Target Array in the Given Order

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CreateTargetArrayInGivenOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("provide size of nums array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Provide values of nums array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("provide size of index array : ");
        int m = sc.nextInt();
        int[] index = new int[m];
        System.out.print("Provide values of index array : ");
        for (int i = 0; i < m; i++) {
            index[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(CreateTargetArray(arr, index)));
    }

    static int[] CreateTargetArray(int[] nums, int[] index) {
        // int[] target = new int[nums.length];
        ArrayList<Integer> target = new ArrayList<>(nums.length);
        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            // target[index[i]] = nums[i];
            target.add(index[i], nums[i]);
        }
        for (int i = 0; i < nums.length; i++) {
            arr[i] = target.get(i);
        }
        // return target;
        return arr;
    }
}

/*
 * Outputs --
 * 
 * provide size of nums array : 5
 * Provide values of nums array : 0 1 2 3 4
 * provide size of index array : 5
 * Provide values of index array : 0 1 2 2 1
 * [0, 4, 1, 3, 2]
 */