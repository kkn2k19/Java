public class Arrays {
    public static void main(String[] args) {
        // Q. store a roll number
        int a = 19;

        // Q. store a person's name
        String name = "Karan";

        // Q. store 5 roll numbers
        int rno1 = 100;
        int rno2 = 101;
        int rno3 = 102;

        // syntax
        // datatype[] variable_name = new datatype[size];
        // store 5 roll numbers:
        int[] rnos = new int[5];
        // or directly
        int[] rnos2 = { 98, 99, 100, 101, 102 };

        int[] ros; // declaration of array. ros is getting defined in the stack.
        ros = new int[5]; // initialisation : actually here object is being created in the memory (heap)

        // [0, 0, 0, 0, 0]
        // System.out.println(ros[1]); //0 // bydefault 0 are filled in arrays

        // String[] arr = new String[4];
        // System.out.println(arr[0]); // null

        
    }
}
