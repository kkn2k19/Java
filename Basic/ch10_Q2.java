/*
Question 2 : Write a program that reads a set of integers, and then prints the sum of the even and odd integers.
*/

import java.util.*;

public class ch10_Q2 {
  public static void main (String args[]) {
    Scanner gc = new Scanner (System.in);
    System.out.println("Enter no of integers : ");
    int n = gc.nextInt();
    int a;
    int e = 0;
    int o = 0;
    for (int i = 1; i <= n; i++) {
      a = gc.nextInt();
      if (a%2 == 0) {
        e = e+a;
      }
      else {
        o = o+a;
      }
    }
    System.out.println("Sum of Even terms : " + e);
    System.out.println("Sum of odd terms : " + o);
  }
}
