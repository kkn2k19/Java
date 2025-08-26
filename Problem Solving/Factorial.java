import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // System.out.println(factorial1(n));
        System.out.println(factorial2(n));
    }

    public static int factorial1(int n ){
        int f = 1;
        for (int i = 1; i <= n; i++){
            f = f * i;
        }
        return f;
    }

    public static int factorial2(int n){
        if (n <= 1) return 1;
        return n * factorial2(n - 1);
    }
}
