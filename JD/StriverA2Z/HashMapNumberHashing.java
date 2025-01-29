import java.util.Scanner;
import java.util.*;

public class HashMapNumberHashing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of Array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter Array Element : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // precompute // declare HashMap with Wrapper class DataType
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            Integer c = map.get(arr[i]);
            if (c == null) {
                map.put(arr[i], 1);
            } else {
                map.put(arr[i], c + 1);
            }
        }

        System.out.print("Enter no. of times to check occurences : ");
        int k = sc.nextInt();
        for (int i = 0; i < k; i++) {
            System.out.print("Enter element to check : ");
            int element = sc.nextInt();
            System.out.println("Occurrences : " + map.getOrDefault(element, 0));  // either value fetch  or zero for null value
        }
    }
}

// OUTPUT ---
// Enter length of Array : 7
// Enter Array Element : 1 2 3 1 3 2 12
// Enter no. of times to check occurences : 4
// Enter element to check : 3
// Occurrences : 2
// Enter element to check : 5
// Occurrences : 0
// Enter element to check : 1
// Occurrences : 2
// Enter element to check : 6
// Occurrences : 0