// Given a number n, find no. of set bits in it.

import java.util.Scanner;

public class NoOfSetBitsM3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        System.out.println(setBits(n));
    }

    static int setBits(int n){
        int count = 0;
        while (n > 0){
            n = n & (n-1);
            count++;
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