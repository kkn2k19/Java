// 26.04.2024
// Cyclic Sort

import java.util.Arrays;

public class Cyclic_Sort {

    public static void main(String[] args) {
        int[] arr = { 5, 3, 4, 1, 2 };
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cyclicSort(int[] arr) {
        int i = 0;
        while(i<arr.length) { 
            int correctPos = arr[i]-1;
            if (arr[i] != arr[correctPos]) {
                swap(arr, i, correctPos);
            } else {
                i++;
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