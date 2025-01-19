public class BasicMathsDSA {
    public static void main(String[] args) {
        // System.out.println(digits(1448));
        // System.out.println(reverse(10400));
        // System.out.println(reverse(1448));
        // System.out.println(palindrome(12121));
        // System.out.println(palindrome(1234));
        // System.out.println(armstrong(153));
        // System.out.println(armstrong(123));
        // divisors(36);
        // System.out.println(prime(17));
        // System.out.println(prime(27));
        System.out.println(gcd(10, 15));
    }

    public static int gcd(int x, int y) {
        int gcd = 1;
        for (int i = Math.min(x, y); i >= 1; i--) {
            if (x % i == 0 && y % i == 0) {
                gcd = i;
                break;
            }
        }
        return gcd;
    }

    public static boolean prime(int n) {
        if (n <= 1) {
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    public static void divisors(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static boolean armstrong(int n) {
        int digits = digits(n);
        int sum = 0;
        int i = n;
        while (n > 0) {
            int ld = n % 10;
            sum += Math.pow(ld, digits);
            n = n / 10;
        }
        if (sum == i)
            return true;
        return false;
    }

    public static boolean palindrome(int n) {
        return n == reverse(n);
    }

    public static int reverse(int n) {
        int r = 0;
        while (n > 0) {
            int ld = n % 10;
            r = r * 10 + ld;
            n = n / 10;
        }
        return r;
    }

    public static int digits(int n) {
        // int count = 0;
        // while (n > 0) {
        // count++;
        // n = n / 10;
        // }
        // return count;

        return (int) (Math.log10(n) + 1); // Using logarithm to find the number of digits
    }
}
