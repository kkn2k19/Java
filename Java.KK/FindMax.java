// Find max element in the Array.

public class FindMax {
    public static void main(String[] args) {
        int[] arr = { 18, 12, -7, 3, 14, 28 };
        System.out.println(max(arr));
    }

    static int max(int[] arr) {
        int key = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
        if (key < arr[i]) {
        key = arr[i];
        }
        }
        return key;
    }
}