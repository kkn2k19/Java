/*
In a program, input 3 numbers : A, B and C. You have to output the average of these 3 numbers. 
(Note - Average of N numbers is sum of those numbers divided by N).
*/

import java.util.*;

public class ch2_Q1{
  public static void main (String args[]) {
    System.out.println("Provide 3 numbers : ");
    Scanner gc = new Scanner(System.in);
    int a = gc.nextInt();
    int b = gc.nextInt();
    int c = gc.nextInt();
    float avg = (a + b + c)/3;
    System.out.println("Average of these numbers : " + avg);
  }
}
