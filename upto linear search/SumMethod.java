import java.util.Scanner;

public class SumMethod {
    public static void main(String[] args) {
        // sum();

        // int ans = sum2();
        // System.out.println(ans);
        // System.out.println("Sum : " + sum2());

        int ans = sum3(7, 3);
        System.out.println(ans);
    }

    // pass the value of numbers when you are calling the method in main()
    static int sum3(int a, int b) {
        int sum = a + b;
        return sum;
    }

    // return the value
    // static int sum2() {
    // Scanner sc = new Scanner(System.in);
    // System.out.print("Enter num1 : ");
    // int num1 = sc.nextInt();
    // System.out.print("Enter num2 : ");
    // int num2 = sc.nextInt();
    // int sum = num1 + num2;
    // return sum; //after return execution function ends and all other left
    // statements will not be executed
    // }

    // static void sum() {
    // Scanner sc = new Scanner(System.in);
    // System.out.print("Enter num1 : ");
    // int num1 = sc.nextInt();
    // System.out.print("Enter num2 : ");
    // int num2 = sc.nextInt();
    // int sum = num1 + num2;
    // System.out.println("Sum : " + sum);
    // }

    /*
     * access modifier (we'll look in OOP) return_type name (arguments) {
     * // body
     * return statement;
     * }
     */

    // (14.00)
}