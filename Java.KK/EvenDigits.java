// Given an array nums of integers, return how many of them contain an even number of digits.
// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

public class EvenDigits {
    public static void main(String[] args) {
        int[] nums = { 12, 345, 2, 6, 7896 };

        System.out.println(findNumbers(nums));

        // System.out.println(digits(56789));
        // System.out.println(digits(-12034));
    }

    static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }

    static boolean even(int num) {
        return (digits(num)%2==0);
    }

    // static int digits(int num) {
    //     if (num < 0) {
    //         num*=-1;
    //     }
    //     if (num == 0) {
    //         return 1;
    //     }
    //     int d = 0;
    //     while (num > 0) {
    //         d++;
    //         num /= 10;
    //     }
    //     return d;
    // }

    static int digits(int num) {
        if (num < 0) {
            num*=-1;
        }
        return (int)(Math.log10(num)) + 1;
    }

    // Time Complexity till now from line 13 to 36 = n^2

    // now we need to optimise it
}
