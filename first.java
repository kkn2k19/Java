import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Scanner input = new Scanner(System.in);
        System.out.print("STRING : ");
        System.out.println(input.next());
        input.close();
    }
}