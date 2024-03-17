// search for 3 in the range of index [1, 4]
// arr = [18, 12, -7, 3, 14, 28]

public class SearchinRangeLS {
    public static void main(String[] args) {
        int[] arr = {18, 12, -7, 3, 14, 28};
        int ans = search(arr, 3, 1, 4);
        if (ans == -1) {
            System.out.println("Not Found");
        } else {
            System.out.println("Found at index : " + ans);
        }
    }

    static int search(int[] arr, int key, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }

        // for (int i = 0; i < str.length(); i++) {
        //     if (key == str.charAt(i)) {
        //         return true;
        //     }
        // }

        for (int i = start; i <= end; i++) {
            if (key == arr[i]) {
                return i;
            }
        }

        return -1;
    }
}
