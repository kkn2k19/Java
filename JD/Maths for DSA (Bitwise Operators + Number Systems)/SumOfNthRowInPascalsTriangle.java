// Find the sum of nth row of the Pascal's Triangle.

import java.util.Scanner;

public class SumOfNthRowInPascalsTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row no. : ");
        int n = sc.nextInt();
        System.out.println(sum(n));
    }

    static int sum (int n){
        return (1<<(n-1));   // 2^(n-1)   // 1000 == 2^(4-1) == 8  // for n = 4 -- sum = 1+3+3+1 = 8
    }
}


//OUTPUT ---
//
//Enter row no. : 5
//        16
//
//Enter row no. : 4
//        8