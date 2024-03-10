/*
Question 3 : Write a program to find the factorial of any number entered by the user.
*/

import java.util.*;

public class ch10_Q3 {
  public static void main (String args []) {
    Scanner gc = new Scanner (System.in);
    System.out.println("Provide n : ");
    int n = gc.nextInt();
    int f = 1;
    for (int i = 1; i <= n; i++) {
      f = f*i;
    }
    System.out.println("Factorial of " + n + " = " + f);
  }
}
