// https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/

public class SmallestLetter {
    public static void main(String[] args) {
        // char[] arr = {'c','f','j'};
        // char key = 'a';
        // char[] arr = { 'c', 'f', 'j' };
        // char key = 'c';
        char[] arr = { 'x', 'x', 'y', 'y' };
        char key = 'z';
        System.out.println(nextGreatestLetter(arr, key));
    }

    static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (letters[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return letters[start % letters.length];
    }
}