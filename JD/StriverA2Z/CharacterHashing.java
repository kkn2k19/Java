import java.util.Scanner;
import java.util.Arrays;

public class CharacterHashing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string:");
        String str = sc.nextLine().toLowerCase();

        // Precompute: Declare hash array for 26 lowercase English letters
        int[] hash = new int[26]; // by default it stores 0 as value
        for (int i = 0; i < str.length(); i++) {
            hash[str.charAt(i) - 'a'] += 1;
        }

        System.out.print("Enter no. of times to check occurences : ");
        int k = sc.nextInt();
        sc.nextLine(); // when u use nextLine() just after nextInt() you have to add a new line break for scanner
        for (int i = 0; i < k; i++) {
            System.out.print("Enter character to check : ");
            String c = sc.nextLine();
            System.out.println("Occurrences : " + hash[c.charAt(0) - 'a']);
        }
    }
}

// OUTPUT ---
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