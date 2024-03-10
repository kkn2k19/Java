/*
Question 1 : Write a Java program to get a number from the user and print whether it is positive or negative.
*/

import java.util.*;

public class ch9_Q1 {
  public static void main (String args[]) {
    Scanner gc = new Scanner (System.in);
    System.out.print("Provide n : ");
    int n = gc.nextInt();
    if (n > 0) {
      System.out.println("Positive.\n");
    }
    else {
      System.out.print("Negative.\n");
    }
  } 
}
