/*
Question 5 : Write a Java method to compute the sum of the digits in an integer.
(Hint: Approach this question in the following way : 
a. Take a variable sum = 0
b. Find the last digit of the number
c. Add it to the sum
d. Repeat a & b until the number becomes 0 )
*/

import java.util.*;

public class ch12_Q5 {
  public static void main (String args[]) {
    Scanner gc = new Scanner (System.in);
    System.out.println("Provide n : ");
    int n = gc.nextInt();
    int k = sum_of_digits(n);
    System.out.println("Sum of Digits : " + k);
  }

  public static int sum_of_digits (int n) {
    int s = 0;
    for (int i = n; i > 0; i/=10) {
      int d = i%10;
      s = s+d;
    }
    return s;
  }
}
