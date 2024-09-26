// 1. Prime Number
// 2. Check Armstrong Number
// 3. Print All 3 Digit Armstrong Numbers

// import java.util.Scanner;

public class Questions1 {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter n : ");
        // int num = sc.nextInt();
        // checkPrime(num);

        // System.out.println(CheckArmstrong(153));

        // // 3. Print All 3 Digit Armstrong Numbers

        for (int i = 100; i < 1000; i++) {
            if (CheckArmstrong(i)) {
                System.out.print(i + " ");
            }
        }

    }

    // print all the 3 digits armstrong numbers
    static boolean CheckArmstrong(int n) { // void can be used in place of boolean
        int i = n;
        double sum = 0;

        while (i > 0) {
            int d = i % 10;
            sum = sum + Math.pow(d, 3);
            i = i / 10;
        }
        // if (n == sum) {
        // // System.out.println("Armstrong Number.");
        // return true;
        // // } else {
        // // System.out.println("not a Armstrong Number.");
        // }
        // return false;
        return sum == n;
    }

    static void checkPrime(int n) {
        if (n <= 1) {
            System.out.print("Not a Prime Number.");
            return;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.println("Not a Prime Number.");
                return;
            }
        }
        System.out.println("Prime number.");
    }
}
