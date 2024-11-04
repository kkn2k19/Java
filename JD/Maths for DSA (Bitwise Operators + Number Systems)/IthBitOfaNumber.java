// Find the ith bit of a number.

import java.util.Scanner;

public class IthBitOfaNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        System.out.print("Enter ith position : ");
        int i = sc.nextInt();
        System.out.println(ithBit(n, i));
    }

    static int ithBit(int n, int i) {
        int ans = n & (1 << (i - 1));
        if (ans == 0) {
            return 0;
        }
        return 1;
    }
}


// OUTPUT --

// Enter a number : 15
// Enter ith position : 3
// 1

// Enter a number : 12
// Enter ith position : 2
// 0