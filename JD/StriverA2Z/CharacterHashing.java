import java.util.Scanner;
import java.util.Arrays;

public class CharacterHashing {
    public static void main(String[] args) {
        // ONLY LOWERCASE LETTERS
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a string:");
        // String str = sc.nextLine().toLowerCase();

        // // Precompute: Declare hash array for 26 lowercase English letters
        // int[] hash = new int[26]; // by default it stores 0 as value
        // for (int i = 0; i < str.length(); i++) {
        // hash[str.charAt(i) - 'a'] += 1;
        // }

        // System.out.print("Enter no. of times to check occurences : ");
        // int k = sc.nextInt();
        // sc.nextLine(); // when u use nextLine() just after nextInt() you have to add
        // a new line break for scanner
        // for (int i = 0; i < k; i++) {
        // System.out.print("Enter character to check : ");
        // String c = sc.nextLine();
        // System.out.println("Occurrences : " + hash[c.charAt(0) - 'a']);
        // }

        // ONLY UPPERCASE LETTERS
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a string:");
        // String str = sc.nextLine().toUpperCase();

        // // Precompute: Declare hash array for 26 Uppercase English letters
        // int[] hash = new int[26]; // by default it stores 0 as value
        // for (int i = 0; i < str.length(); i++) {
        // hash[str.charAt(i) - 'A'] += 1;
        // }

        // System.out.print("Enter no. of times to check occurences : ");
        // int k = sc.nextInt();
        // sc.nextLine(); // when u use nextLine() just after nextInt() you have to add
        // a new line break
        // // for scanner
        // for (int i = 0; i < k; i++) {
        // System.out.print("Enter character to check : ");
        // String c = sc.nextLine();
        // System.out.println("Occurrences : " + hash[c.charAt(0) - 'A']);
        // }

        // MIXED CASE ANY CHARACTER -- then we simply take hash of 256 and no need to
        // subtract or add anything
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string:");
        String str = sc.nextLine();

        // Precompute: Declare hash array for 256 characters
        int[] hash = new int[256]; // by default it stores 0 as value
        for (int i = 0; i < str.length(); i++) {
            hash[str.charAt(i)] += 1;
        }

        System.out.print("Enter no. of times to check occurences : ");
        int k = sc.nextInt();
        sc.nextLine(); // when u use nextLine() just after nextInt() you have to add a new line break
                       // for scanner
        for (int i = 0; i < k; i++) {
            System.out.print("Enter character to check : ");
            String c = sc.nextLine();
            System.out.println("Occurrences : " + hash[c.charAt(0)]);
        }
    }
}

// LOWER CASE OUTPUT ---
// Enter a string:abcdabefc
// Enter no. of times to check occurences : 5
// Enter character to check : a
// Occurrences : 2
// Enter character to check : g
// Occurrences : 0
// Enter character to check : h
// Occurrences : 0
// Enter character to check : b
// Occurrences : 2
// Enter character to check : c
// Occurrences : 2

// UPPER CASE OUTPUT ---
// Enter a string:ABCDABEFC
// Enter no. of times to check occurences : 5
// Enter character to check : A
// Occurrences : 2
// Enter character to check : G
// Occurrences : 0
// Enter character to check : H
// Occurrences : 0
// Enter character to check : B
// Occurrences : 2
// Enter character to check : C
// Occurrences : 2

// MIXED CASE ANY CHARACTER OUTPUT ---
// Enter a string:AbCdABEfc
// Enter no. of times to check occurences : 7
// Enter character to check : a
// Occurrences : 0
// Enter character to check : A
// Occurrences : 2
// Enter character to check : b
// Occurrences : 1
// Enter character to check : B
// Occurrences : 1
// Enter character to check : c
// Occurrences : 1
// Enter character to check : D
// Occurrences : 0
// Enter character to check : C
// Occurrences : 1