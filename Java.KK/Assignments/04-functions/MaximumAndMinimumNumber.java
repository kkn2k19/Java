// 28.03.2024
// https://www.java67.com/2019/05/how-to-find-largest-and-smallest-of-three-numbers-in-java.html

import java.util.Scanner;

public class MaximumAndMinimumNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Provide Three Integer Numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println("Maximum : " + maximum(a, b, c));
        System.out.println("Minimum : " + minimum(a, b, c));
    }

    static void maximum(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= c) {
            return b;
        } else {
            return c;
        }
        return -1;
    }
}
