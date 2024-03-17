import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,0};
        int key = 7;

        int ans = linearSearch(arr, key);

        if (ans == -1) {
            System.out.println("Not Found\n");
        } else {
            System.out.println("Found at index : " + ans);
        }
    }

    // search in the array: return the index if item found
    // otherwise if item not found return -1
    static int linearSearch(int[] arr, int key) {
        if (arr.length == 0) {
            return -1;
        }
        
        // run a for loop
        for (int i = 0; i < arr.length; i++) {
            // check for element at every index if it is = key 
            int element = arr[i];
            if (element == key) {
                return i;
            }
        }
        
        // this line will be executed if none of the return statements above have been executed
        // hence the target not found
        return -1;
        
    }

    static int linearSearch2(int[] arr, int key) {
        if (arr.length == 0) {
            return -1;
        }
        
        // run a for loop
        for (int element : arr) {
            if (element == key) {
                return element;
            }
        }
        return Integer.MIN_VALUE;  // for not found
    }

    static boolean linearSearch3(int[] arr, int key) {
        if (arr.length == 0) {
            return false;
        }
        
        // run a for loop
        for (int element : arr) {
            if (element == key) {
                return true;
            }
        }
        return false;  // for not found
    }
}
