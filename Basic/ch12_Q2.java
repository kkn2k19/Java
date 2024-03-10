/*
Question 2 : Write a method named isEven that accepts an int argument.
The method should return true if the argument is even, or false otherwise. Also write a program to test your method.
*/

import java.util.*;

public class ch12_Q2 {
  public static void main (){
    Scanner gc = new Scanner (System.in);
    System.out.println("Provide n : ");
    int n = gc.nextInt();
    System.out.println(n + " is " + isEven(n));
  }

  public static boolean isEven (int n) {
    if (n%2==0) {
      return true;
    }
    else {
      return false;
    }
  }
}
