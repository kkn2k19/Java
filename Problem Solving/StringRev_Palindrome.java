import java.util.Scanner;

public class StringRev_Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        // System.out.println(rev(str));
        System.out.println(checkPalindrome(str));
    }

    public static boolean checkPalindrome(String str) {
        String rev = rev(str);
        return str.equals(rev);
    }

    public static String rev(String str) {
        char[] rev = str.toCharArray();
        int start = 0;
        int end = rev.length - 1;
        while (start < end) {
            char temp = rev[start];
            rev[start] = rev[end];
            rev[end] = temp;
            start += 1;
            end -= 1;
        }
        return new String(rev);
    }
}
