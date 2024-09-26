// 13.04.2024
// Reverse A String In Java

import java.util.Scanner;

public class Reverse_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Provide a String : ");
        String str = sc.nextLine();
        System.out.println("Reverse of String : " + reverse(str));
    }

    static String reverse(String str) {
        String newStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            newStr = newStr + ch;
        }
        return newStr;
    }
}

/*
 * Output --
 * 
 * Provide a String : KKN THE GAMER
 * Reverse of String : REMAG EHT NKK
 */