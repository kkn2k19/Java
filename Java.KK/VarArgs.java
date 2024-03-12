import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        // fun(1,2,3,4,5,6,7,8,9,10); // for passing n numbers of arguments we use VarArgs Concept.
        multiple(2, 3, "Karan", "chandanOP", "Kunal", "Manish", "Rahul", "Om", "Shadaf", "Ritesh", "Mazhar", "Ankit", "Saad", "Aamir", "Priyanshu");
    }

    static void multiple (int a, int b, String ...v) {
        System.out.print(Arrays.toString(v));
    }

    static void fun(int ...v) {
        System.out.println(Arrays.toString(v));
    }
}
