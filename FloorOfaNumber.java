// Floor of a Number -- ( greatest element in array smaller or equal to target.)

public class FloorOfaNumber {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 9, 14, 16, 18 };
        int key = 15;
        System.out.println(floorOfaNumber(arr, key));
    }

    static int floorOfaNumber(int[] arr, int key) {
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
        return arr[end];
    }
}