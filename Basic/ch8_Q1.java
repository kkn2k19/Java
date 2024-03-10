/*
Question :What will be the output of the followingprograms :

public class Test {
     public static void main(String[] args){
           int x = 2, y = 5;
           int exp1 = (x * y / x);
           int exp2 = (x * (y / x));
           System.out.print(exp1 + “ , ”);
           System.out.print(exp2);
     }
}
*/

exp1 = 5
exp2 = 4
since, both x and y are integers and also result containers exp1 and exp2 are also integers therefore exp1 = 5 and exp2 = 4.
precedence order of * and / are same and () have higher priority than * and / when same priority operators present then left to right operations performed.
