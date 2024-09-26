import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        // // Q. Print numbers from 1 to 5

        // System.out.println(1);
        // System.out.println(2);
        // System.out.println(3);
        // System.out.println(4);
        // System.out.println(5);
        /*
         * syntax of for loops:
         * 
         * for (initialisation; condition checking; updation){
         * // body
         * }
         */

        // Q. Print numbers from 1 to 5
        // for (int num = 1; num <= 5; num += 1) {
        // System.out.print(num + " ");
        // }

        Scanner sc = new Scanner(System.in);

        // print numbers from 1 to n
        // System.out.print("Enter n : ");
        // int n = sc.nextInt();
        // for (int i = 1; i <= n; i++) {
        //     // System.out.print(i + " ");
        //     System.out.println("Hello World!");
        // }

        // While Loop
        /*
            syntax:
                    while(condition){
                        //body
                    }
         */

        // int i = 1;
        // while(i <= 5){
        //     System.out.print(i + " ");
        //     i++;
        // }

        // do while loop
        /*
            do {
                // body
            } while(condition);
        */

        int i = 1;
        do{
            System.out.print(i + " ");
            i++;
        } while(i<=5);
    }
}