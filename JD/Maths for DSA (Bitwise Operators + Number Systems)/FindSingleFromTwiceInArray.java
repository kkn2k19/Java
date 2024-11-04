// Suppose an array is given in which every element is repeated twice only one of them is one time, find it.

public class FindSingleFromTwiceInArray {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 1, 2, 1, 3, 6, 4 };
        System.out.println(single(arr));
    }

    static int single(int[] arr) {
        int ans = 0;

        for (int n : arr) {
            ans = ans ^ n;
        }

        return ans;
    }
}

// OUTPUT --

// 6