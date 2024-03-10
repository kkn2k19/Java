/*
Question 5 : Write a Java program that takes a year from the user and print whether that year is a leap year or not.
*/

import java.util.*;

public class ch9_Q5 {
  public static void main (String args[]) {
    Scanner gc = new Scanner (System.in);
    System.out.println("Provide Year : ");
    int year = gc.nextInt();
    if (year % 4 == 0) {
      if (year % 100 == 0) {
        if (year % 400 == 0) {
          System.out.println("Leap Year.");
        }
        else {
          System.out.println("Not a Leap Year.");
        }
      }
      else {
        System.out.println("Leap Year.");
      }
    }
    else {
          System.out.println("Not a Leap Year.");
    }
  }
}
