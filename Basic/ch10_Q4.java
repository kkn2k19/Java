/*
Question 4 : Write a program to print the multiplication table of a number N, entered by the user.
*/

import java.util.*;

public class ch10_Q4 {
  public static void main(String args[]) {
    Scanner gc = new Scanner (System.in);
    System.out.println("Provide n : ");
    int n = gc.nextInt();
    for (int i = 1; i <= 10; i++) {
      System.out.println(n + " X " + i + " = " + n*i);
    }
  }
}
