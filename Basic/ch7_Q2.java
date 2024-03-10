/*
In a program, input the side of a square. You have to output the area of the square. (Hint : area of a square is (side x side). )
*/

import java.util.*;

public class ch2_Q2 {
  public static void main (String args []) {
    System.out.println("Provide side of Sqaure : ");
    Scanner gc = new Scanner (System.in);
    int s = gc.nextInt();
    int area = s*s;
    System.out.println("Area of Square : " + area);
  }
}
