import java.util.Scanner;

public class Gcd {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // System.out.println(gcd1(a,b));
        System.out.println(gcd2(a,b));
    }

    public static int gcd1(int a, int b){
        if (b == 0) return a;
        int gcd = 1;
        for (int i = 1; i <= a && i <= b; i++){
            if (a % i == 0 && b % i == 0) gcd = i;
        }
        return gcd;
    }

    public static int gcd2(int a, int b){
        if (b == 0) return a;
        return gcd2(b, a%b);
    }
}