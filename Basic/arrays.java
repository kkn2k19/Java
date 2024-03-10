import java.util.*;

public class arrays{
  public static void main(String args[]){
    Scanner gc = new Scanner (System.in);
    //Array Declararion
    int marks[]=new int[100];
    //Initialization
    marks[0]=gc.nextInt();        //phy
    marks[1]=gc.nextInt();        //chem
    marks[2]=gc.nextInt();        //maths
    //print
    System.out.println("Phy : "+marks[0]);
    System.out.println("Chem : "+marks[1]);
    System.out.println("Maths : "+marks[2]);
    //updating maths again
    marks[2]=100;
    System.out.println("Maths : "+marks[2]);
    //updating chem now with arithmetic functions
    marks[1]=marks[1]+1;
    System.out.println("Chem : "+marks[1]);
  }
}
