// Given a number n, find no. of set bits in it.

import java.util.Scanner;

public class NoOfSetBitsM1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        System.out.println(setBits(n));
    }

    static int setBits(int n){
        int count = 0;
        while (n > 0){
            if ((n&1)== 1) {
                count++;
            }
            n = n>>1;
        }
        return count;
    }
}


//OUTPUT ---
//
//Enter n : 8
//        1
//
//Enter n : 9
//        2