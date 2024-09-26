// 10.04.2024
// https://leetcode.com/problems/search-in-rotated-sorted-array/description/
// Find the Rotation Count in Rotated Sorted Array.

public class RotationCount {
    public static void main(String[] args) {
        int[] arr = { 15, 18, 2, 3, 6, 12 };
        int pivotIndex = findPivot(arr);
        // no. of rotations = pivotIndex + 1
        // we can't use 'pivotIndex + 1' inside print statement as it Concatenates it instead of adding it
        System.out.println("no. of Rotations : " + ++pivotIndex);
    }

    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases over here
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}

/*
 * Output --
 * 
 * 
 */