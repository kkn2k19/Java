import java.util.Scanner;

public class Contest1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (c>b && b>a) {
            System.out.println("STAIR");
        } else if (b > a && b > c) {
            System.out.println("PEAK");
        } else {
            System.out.println("NONE");
        }
    }
}