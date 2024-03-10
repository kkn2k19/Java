/*
Enter cost of 3 items from the user (Using float data type) - a pencil, a pen and an eraser. 
You have to output the total cost of the items back to the user as their bill.
(Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem.)
*/

import java.util.*;

public class ch2_Q3 {
  public static void main (String args []) {
    Scanner gc = new Scanner (System.in);
    System.out.println("Provide Prices of Pencil : ");
    float a = gc.nextFloat();
    System.out.println("Provide Prices of Pen : ");
    float b = gc.nextFloat();
    System.out.println("Provide Prices of Eraser : ");
    float c = gc.nextFloat();
    float total = (a + b + c);
    System.out.println("Total without Tax : " + total);
    System.out.println("Total with Tax : " + 0.18*total);
  }
}
