import java.util.Scanner;
 // 0, 1, 1, 2, 3, 5, 8, 13, ......
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of terms : ");
        int n = sc.nextInt();
        
        // Q. Find the nth fibonacci number of the fibonacci series.
        // a = 0
        // b = 1
        // n = 7 --- (13)
        // nth term for n = 7 = 6th term = (8)
        /*
            n   |    a   |   b   |   sum     
            1   |    0   |   b   |   0(0th)     
            2   |    a   |   1   |   1(1st)     
            3   |    0   |   1   |   1(2nd)  // main series start from here as first two  terms are 0  and 1 .     
            4   |    1   |   1   |   2(3rd)  // b is copied to a and sum is copied to b after each term  
            5   |    1   |   2   |   3(4th)     
            6   |    2   |   3   |   5(5th) 
            7   |    3   |   5   |   8(6th) 
            8   |    5   |   8   |   13(7th)  
            9   |    8   |   13  |   21(8th)     
        */

        int a = 0;
        int b = 1;
        int sum=0;
        for(int i = 1; i<=n; i++) {
            // System.out.print(a + " "); we dont need to print the series 
            sum = a+b;
            a = b;
            b = sum;
        }
        // System.out.print(a);  //nth term
        System.out.print(sum-a);  //term at n

        // int a = 0;
        // int b = 1;
        // int count = 2;

        // while(count <= n) {
        //     int temp = b;
        //     b = b+a;
        //     a = temp;
        //     count++;
        // }
        // System.out.println(b);
    }    
}
