/*
Question 3 : Write a Java program to check if a number is a palindrome in Java? 
(121 is a palindrome, 321 is not)
A number is called a palindrome if the number is equal to the reverse of a number e.g., 121 is a palindrome because the reverse of 121 is 121 itself.
On the other hand, 321 is not a palindrome because the reverse of 321 is 123, which is not equal to 321.
*/

import java.util.*;

public class ch12_Q3 {
  public static void main (String args[]) {
    Scanner gc = new Scanner (System.in);
    System.out.println("Provide n : ");
    int n = gc.nextInt();
    pal(n);
  }

  public static void pal (int n) {
    int r = 0;
    for (int i = n; i>0; i/=10) {
      int d = i%10;
      r = 10*r+d;
    }
    if (r == n) {
      System.out.println("Palindrome Number.\n");
    }
    else {
      System.out.println("Not a Palindrome Number.\n");
    }
  }
}
