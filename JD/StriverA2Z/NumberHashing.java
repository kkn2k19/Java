import java.util.Scanner;
import java.util.Arrays;

public class NumberHashing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of Array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter Array Element : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // precompute // declare hash with atmax+1
        int[] hash = new int[13]; // by default it stores 0 as value
        for (int i = 0; i < n; i++) {
            hash[arr[i]] += 1;
        }

        System.out.print("Enter no. of times to check occurences : ");
        int k = sc.nextInt();
        for (int i = 0; i < k; i++) {
            System.out.print("Enter element to check : ");
            int element = sc.nextInt();
            System.out.println("Occurrences : " + hash[element]);
        }
    }
}

// OUTPUT ---

// Enter length of Array : 5
// Enter Array Element : 1 3 2 1 3
// Enter no. of times to check occurences : 5
// Enter element to check : 1
// Occurrences : 2
// Enter element to check : 4
// Occurrences : 0
// Enter element to check : 2
// Occurrences : 1
// Enter element to check : 3
// Occurrences : 2 
// Enter element to check : 12
// Occurrences : 0