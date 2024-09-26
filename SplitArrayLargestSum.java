// 12.04.2024
// https://leetcode.com/problems/split-array-largest-sum/description/
// Split Array Largest Sum. 

public class SplitArrayLargestSum {
    public static void main(String[] args) {
        int[] arr = { 7, 2, 5, 8, 10 };
        int m = 2;
        System.out.println(splitArray(arr, m));
    }

    static int splitArray(int[] nums, int m) {
        int start = 0;
        int end = 0;

        for (int i = 0; i < nums.length; i++) {
            start = Math.max(start, nums[i]); // in the end of the loop this will contain the max item from the
                                              // array.(just simple linear search).
            end += nums[i];
        }

        // binary search
        while (start < end) {
            // try for the middle as potential ans
            int mid = start + (end - start) / 2;

            // calculate how many pieces you can divide this in with this max sum
            int sum = 0;
            int pieces = 1;
            for (int i = 0; i < nums.length; i++) {
                if (sum + nums[i] > mid) {
                    // you cannot add this in this subarray, make new one
                    // say you add this num in new subarray, then sum = num
                    sum = nums[i];
                    pieces++;
                } else {
                    sum += nums[i];
                }
            }
            if (pieces <= m) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        return end; // here start == end
    }
}

/*
 * Output --
 * 
 * 18
 */