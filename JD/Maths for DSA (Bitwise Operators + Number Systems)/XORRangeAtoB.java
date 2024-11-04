// Find XOR of no. from 0 to a.

import java.util.Scanner;

public class XORRangeAtoB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a and b : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(xorRange(a, b));
    }

    static int xorRange (int a, int b){
        return xor(b)^xor(a-1);
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
//Enter a and b : 2 9
//        0
//
//Enter a and b : 0 9
//        1