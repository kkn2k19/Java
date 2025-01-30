
import java.util.Scanner;
import java.util.HashMap;

public class HashMapCharacterHashing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string:");
        String str = sc.nextLine();

        // precompute // declare HashMap with Wrapper class DataType
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < str.length(); i++) {
            Integer c = map.get(str.charAt(i));
            if (c == null) {
                map.put(str.charAt(i), 1);
            } else {
                map.put(str.charAt(i), c + 1);
            }
        }

        System.out.print("Enter no. of times to check occurences : ");
        int k = sc.nextInt();
        for (int i = 0; i < k; i++) {
            System.out.print("Enter element to check : ");
            Character element = sc.next().charAt(0);
            System.out.println("Occurrences : " + map.getOrDefault(element, 0)); // either value fetch or zero for null
                                                                                 // value
        }
    }
}

// OUTPUT ---
// Enter a string:AbCdABEfc
// Enter no. of times to check occurences : 7
// Enter element to check : a
// Occurrences : 0
// Enter element to check : A
// Occurrences : 2
// Enter element to check : b
// Occurrences : 1
// Enter element to check : B
// Occurrences : 1
// Enter element to check : c
// Occurrences : 1
// Enter element to check : C
// Occurrences : 1
// Enter element to check : D
// Occurrences : 0