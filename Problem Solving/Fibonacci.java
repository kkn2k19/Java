import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // no. of terms
        // fibonacci1(n);
        // fibonacci2(n); // we need to use a loop for recursive approach it will give a
        // int every time
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci2(i) + " ");
        }
    }

    public static void fibonacci1(int n) {
        int a = 0;
        int b = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int temp = a;
            a = b;
            b = a + temp;
        }
    }

    public static int fibonacci2(int n) {
        if (n == 0 || n == 1)
            return n;
        return fibonacci2(n - 1) + fibonacci2(n - 2);
    }
}
