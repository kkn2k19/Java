public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        // int[] arr = { -18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89 };
        int[] arr = {99, 80, 75, 22, 11, 10, 5, 2, -3};

        int key = 11;
        int index = orderAgnosticBS(arr, key);
        if (index == -1) {
            System.out.println("Not Found\n");
        } else {
            System.out.println("Found at Index : " + index);
        }
    }

    static int orderAgnosticBS (int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = (arr[start] < arr[end]);

        while (start <= end) {
            int mid = start + (end - start)/2;

            if (arr[mid] == key) {
                return mid;
            }

            if (isAsc) {
                if (key < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                } 
            } else {
                if (key > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                } 
            }
        }
        return -1;
    }
}
