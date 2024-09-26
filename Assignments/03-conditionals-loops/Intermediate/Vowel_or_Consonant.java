// 13.04.2024
// LCM of two Numbers 

import java.util.Scanner;

public class Vowel_or_Consonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Provide a Character : ");
        char ch = sc.next().charAt(0);
        if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O'
                || ch == 'u' || ch == 'U') {
            System.out.println("Character is Vowel");
        } else {
            System.out.println("Character is Consonant");
        }
    }
}

/*
 * Output --
 * 
 * Provide a Character : k
 * Character is Consonant
 */