import java.util.*;

public class Linear_search{
  public static int linearsearch(int marks[], int se){
    for (int i=0; i<marks.length; i++){
      if (marks[i]==se){
        return i;
      }
    }
    return -1;
  }
  public static void main(String args[]){
    int marks[]={2,4,6,8,10,12,14,16};
    int se = 10;
    int index=linearsearch(marks, se);
    if (index==-1){
      System.out.println("Not Found\n");
    }
    else {
      System.out.println("Found at index : "+index);
    }
  }
}
