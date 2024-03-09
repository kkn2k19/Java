import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character : ");
        char ch = sc.next().trim().charAt(0);
        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("UpperCase");
        } else if(ch >= 'a' && ch <= 'z') {
            System.out.println("LowerCase");
        } else {
            System.out.println("Other Character");
        }
    }
}
