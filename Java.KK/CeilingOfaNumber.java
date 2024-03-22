// Ceiling of a Number -- ( smallest element in array greater or equal to target.)

public class CeilingOfaNumber {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 9, 14, 16, 18 };
        int key = 17; // enter values lesser than or equal to 18.
        System.out.println(ceilingOfaNumber(arr, key));
    }

    static int ceilingOfaNumber(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (key == arr[mid]) {
                return key;
            }
            if (key < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return arr[start];
    }
}