// https://leetcode.com/problems/find-the-duplicate-number/description/

import java.util.Arrays;

public class DuplicateNumber {
    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 2, 2};
        System.out.println(findDuplicate(nums));
       // System.out.println(Arrays.toString(nums));
    }

    static int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i:nums){
            if (nums[i]==nums[i+1]) {
                return nums[i];
            }
        }
        return -1;
    }
}
