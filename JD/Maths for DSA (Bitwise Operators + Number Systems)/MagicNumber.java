// Find the nth Magic Number.

import java.util.Scanner;

public class MagicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        System.out.println(magicNumber(n));
    }

    static int magicNumber(int n) {
        int sum = 0;
        int i = 1;
        while (n>0){
            sum += (int)((n&1)*Math.pow(5,i));
            i++;
            n>>=1;
        }
        return sum;
    }
}


//OUTPUT ---
//
//Enter n : 5
//        130

//Enter n : 6
//        150
