/*
Question 5 : What is wrong in the following program? 

public class Solution { 
    public static void main (String args[]) { 
        for(int i=0; i<=5; i++) {
            System.out.println("i = "+i);
        }
        System.out.println("i after the loop = "+ i );
    }
}
*/

Since i in defined inside for loop so it can not be used outside it.
