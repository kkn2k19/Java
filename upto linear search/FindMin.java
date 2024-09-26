// Find min element in the Array.

public class FindMin {
    public static void main(String[] args) {
        int[] arr = {18, 12,-7, 3, 14, 28};
        System.out.println(min(arr));
    }
    static int min(int[] arr) {
        int key = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (key > arr[i]) {
                key = arr[i];
            }
        }
        return key;
    }
}
