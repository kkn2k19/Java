import java.util.Scanner;

public class Arrays1D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        // taking input
        System.out.print("Enter the value of Array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // printing the array
        System.out.print("Array : ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

// OUTPUT ---

// Enter the size of Array : 5
// Enter the value of Array : 1 2 3 4 5
// Array : 1 2 3 4 5