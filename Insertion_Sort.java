// 25.04.2024
// Insertion Sort

import java.util.Arrays;

public class Insertion_Sort {

    public static void main(String[] args) {
        int[] arr = { 5, 3, 4, 1, 2 };
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) { // i -> 0 to <= n-2
            for (int j = i + 1; j > 0; j--) { // j -> i+1 to >0
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                } else {
                    break;
                }
            }
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

/*
 * OUTPUT --
 * 
 * [1, 2, 3, 4, 5]
 */