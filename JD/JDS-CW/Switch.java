import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Choice : ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Chai.");
                break;
            case 2:
                System.out.println("Cold Coffee.");
                break;
            case 3:
                System.out.println("Hot Coffee.");
                break;
            case 4:
                System.out.println("Cold Chai.");
                break;
            default:
                System.out.println("Dal BHAAT.");
        }
    }
}

// OUTPUT ---

// Enter your Choice : 2
// Cold Coffee.

// Enter your Choice : 5
// Dal BHAAT.