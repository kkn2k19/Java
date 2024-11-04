// You are given a number, find out if its power of 2 or not.

import java.util.Scanner;

public class PowerOf2orNotM2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        System.out.println(check(n)); // True or False // True if 2's power
    }

    static boolean check (int n){
        return (n & (n-1)) == 0;
    }
}


//OUTPUT ---
//
//Enter n : 16
//        true
//
//Enter n : 15
//        false