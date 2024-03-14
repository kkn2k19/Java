import java.util.Arrays;

public class Q2MaxValue {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 23, 9, 18 };
        System.out.println("Max Value : " + max(arr));
        System.out.println("Max Value in the given Range : " + maxRange(arr, 1, 3));
    }

    // max in given range
    static int maxRange(int[] arr, int start, int end) {

        if (end > start) {
            return -1;
        }

        if (arr == null) {
            return -1;
        }

        int maxVal = arr[start];
        for (int i = start; i < end; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }

    // imagine that arr is not empty
    static int max(int[] arr) {

        if (arr.length == 0) {
            return -1;
        }
        int maxVal = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}
