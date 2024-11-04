//calculate a^b.

import java.util.Scanner;

public class CalculateAtoPowerB {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Provide a and b : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(power(a,b));
    }

    static int power(int a, int b){
        int ans = 1;
        int base = a;
        while (b > 0){
            if ((b & 1)==1){
                ans = ans * base;
            }
            base = base * base;
            b = b>>1;
        }
        return ans;
    }
}


//OUTPUT ---
//
//Provide a and b : 5 3
//        125
//
//Provide a and b : 4 4
//        256