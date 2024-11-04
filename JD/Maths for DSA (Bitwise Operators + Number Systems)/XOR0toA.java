// Find XOR of no. from 0 to a.

import java.util.Scanner;

public class XOR0toA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = sc.nextInt();
        System.out.println(xor(a));
    }

    static int xor(int a){
        if (a % 4 == 0) {
            return a;
        } else if (a % 4 == 1) {
            return 1;
        } else if (a % 4 == 2) {
            return a+1;
        } else {
            return 0;
        }
    }
}


//OUTPUT ---
//
//Enter a : 7
//        0
//
//Enter a : 16
//        16