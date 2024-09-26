public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { -18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89 };
        int index = binarySearch(arr, 22);
        if (index == -1) {
            System.out.println("Not Found\n");
        } else {
            System.out.println("Found at Index : " + index);
        }
    }

    // return the index
    // return -1 if it does not exist
    static int binarySearch(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            // find the middle element
            // int mid = (start+end)/2;
            // better way to find mid
            // previously we were doing like line 14 but it can exceed limit of int for some
            // larger size arrays so we need to use other formula.
            // int mid = start + (end - start)/2;

            int mid = start + (end - start) / 2;

            if (arr[mid] > key) {
                end = mid - 1;
            } else if (arr[mid] < key) {
                start = mid + 1;
            }
            if (arr[mid] == key) {
                // ans found
                return mid;
            }
        }
        return -1;
    }
}
