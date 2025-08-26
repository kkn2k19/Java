import java.util.Scanner;

public class ReverseOfaNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // System.out.println(reverse(n));
        System.out.println(isPalindrome(n));
    }

    public static boolean isPalindrome(int n){
        int a = n;
        int r = 0;
        while (n > 0) {
            int d = n % 10;
            r = 10 * r + d;
            n /= 10;
        }
        return r == a ? true : false;
    }

    public static int reverse(int n) {
        int r = 0;
        while (n > 0) {
            int d = n % 10;
            r = 10 * r + d;
            n /= 10;
        }
        return r;
    }
}
