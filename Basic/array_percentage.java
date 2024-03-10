import java.util.*;

public class array_percentage{
  public static void main(String args[]){
    Scanner gc = new scanner (System.in);
    int marks[]=new int[100];
    marks[0]=gc.nextInt();
    marks[1]=gc.nextInt();
    marks[2]=gc.nextInt();
    int percentage=(marks[0]+marks[1]+marks[2])/3;
    System.out.println("Percentage : "+percentage);
  }
}
