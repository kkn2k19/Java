import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        // func();
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter no. of times u want to print Name : ");
        // int n = sc.nextInt(); // no. of times u want to print name
        // System.out.print("Enter Name : ");
        // String name = sc.next(); // name to print
        // printName(name, n);

        // System.out.print("Enter start : ");
        // int a = sc.nextInt(); // from when to linearly print
        // System.out.print("Enter end : ");
        // int b = sc.nextInt(); // upto when to linearly print
        // linearlyPrint(a, b);

        // System.out.print("Enter start : ");
        // int a = sc.nextInt(); // from when to linearly print
        // System.out.print("Enter end : ");
        // int b = sc.nextInt(); // upto when to linearly print
        // printReverse(a, b);

        // System.out.print("Enter n : ");
        // int n = sc.nextInt();
        // printLinearlyBackTrack(n);

        System.out.print("Enter n : ");
        int n = sc.nextInt();
        printBackTrack(1, n);
    }

    public static void printBackTrack(int i, int n) {
        if (i > n) {
            return;
        }
        printBackTrack(i + 1, n);
        System.out.print(i + " ");
    }

    public static void printLinearlyBackTrack(int n) {
        if (n < 1) {
            return;
        }
        printLinearlyBackTrack(n - 1);
        System.out.print(n + " ");
    }

    public static void printReverse(int a, int b) {
        if (a > b) {
            return;
        }
        System.out.print(b + " ");
        b--;
        printReverse(a, b); // recursion
    }

    public static void printName(String name, int n) {
        // int i = 0;
        // while (i < n) {
        // System.out.println(name);
        // i++;
        // }
        if (n == 0) {
            return;
        }
        System.out.println(name);
        printName(name, n - 1); // recursion
    }

    static int count = 0; // global declaration

    public static void func() {
        // Base Case
        if (count == 4) {
            return;
        }
        System.out.println(count);
        count++;
        func(); // recursion
    }
}