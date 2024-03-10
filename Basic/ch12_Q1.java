/*
Question 1 : Write a Java method to compute the average of three numbers.
*/

import java.util.*;

public class ch12_Q1 {
  public static void main(String args[]) {
    Scanner gc = new Scanner(System.in);
    System.out.println("Provide 3 numbers : ");
    int a = gc.nextInt();
    int b = gc.nextInt();
    int c = gc.nextInt();
    average(a, b, c);
  }

  public static void average(int a, int b, int c) {
    float avg = (a + b + c) / 3;
    System.out.println("Average : " + avg);
  }
}
