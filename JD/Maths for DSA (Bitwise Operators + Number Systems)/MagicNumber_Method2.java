// Find the nth Magic Number.

import java.util.Scanner;

public class MagicNumber_Method2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        System.out.println(magicNumber(n));
    }

    static int magicNumber(int n){
        int ans = 0;
        int base = 5;
        while (n > 0){
            ans += (n & 1)*base;
            base*=5;
            n=n>>1;
        }
        return ans;
    }
}


//OUTPUT ---
//
//Enter n : 5
//        130

//Enter n : 6
//        150
