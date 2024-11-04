// You are given a number, find out if its power of 2 or not.

import java.util.Scanner;

public class PowerOf2orNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        System.out.println(check(n)); // True or False // True if 2's power
    }

    static boolean check (int n){
        int count = 0;
        while (n > 0){
            if ((n&1)==1){
                count++;
            }
            n=n>>1;
        }
        if(count > 1) {
            return false;
        }
        return true;
    }
}



//OUTPUT ---
//
//Enter n : 16
//        true
//
//Enter n : 15
//        false