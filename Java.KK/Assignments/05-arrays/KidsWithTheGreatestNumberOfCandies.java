// https://leetcode.com/problems/create-target-array-in-the-given-order/description/
// 1389. Create Target Array in the Given Order

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class KidsWithTheGreatestNumberOfCandies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("provide size of Candies array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Provide values of Candies array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Provide Extra Candies Value : ");
        int extra = sc.nextInt();
        
        ArrayList<Boolean> result = new ArrayList<>(arr.length);
        result = kidsWithCandies(arr, extra);
        System.out.println(result);
    }

    static ArrayList<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> result = new ArrayList<>(candies.length);
        int max = 0;
        for (int i = 0; i < candies.length; i++) {
            max = Math.max(candies[i], max);
        }
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies >= max) {
                result.add(true);
            } else {
                result.add(false);
            }
        }
        return result;
    }
}

/*
 * Outputs --
 * 
 * provide size of Candies array : 5
 * Provide values of Candies array : 2 3 5 1 3
 * Provide Extra Candies Value : 3
 * [true, true, true, false, true]
 */