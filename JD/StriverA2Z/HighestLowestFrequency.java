// Find the highest/lowest frequency element
// Problem Statement: Given an array of size N. Find the highest and lowest frequency element.

// Example 1:
// Input: array[] = {10,5,10,15,10,5};
// Output: 10 15
// Explanation: The frequency of 10 is 3, i.e. the highest and the frequency of 15 is 1 i.e. the lowest.

// Example 2:
// Input: array[] = {2,2,3,4,4,2};
// Output: 2 3
// Explanation: The frequency of 2 is 3, i.e. the highest and the frequency of 3 is 1 i.e. the lowest.

import java.util.Scanner;
import java.util.HashMap;

public class HighestLowestFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter Array element : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        countFrequency(arr);
    }

    public static void countFrequency(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        // for(int i=0; i<arr.length; i++){
        // int c = arr[i];
        // if(map.containsKey(c)){
        // map.put(c, map.get(c)+1);
        // } else {
        // map.put(c, 1);
        // }
        // }

        for (int n : arr) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        // System.out.println(map); // showing whole HashMap

        int maxFreq = Integer.MIN_VALUE;
        int minFreq = Integer.MAX_VALUE;
        int maxEle = -1;
        int minEle = -1;

        for (int key : map.keySet()) {
            int freq = map.get(key);

            if (maxFreq < freq) {
                maxFreq = freq;
                maxEle = key;
            }

            if (minFreq > freq) {
                minFreq = freq;
                minEle = key;
            }
        }

        System.out.println("Highest Frequency Element: " + maxEle + " -> " + maxFreq);
        System.out.println("Lowest Frequency Element: " + minEle + " -> " + minFreq);
    }
}

// // OUTPUT ---
// Enter Array size : 6
// Enter Array element : 2 2 3 4 4 2
// Highest Frequency Element: 2 -> 3
// Lowest Frequency Element: 3 -> 1