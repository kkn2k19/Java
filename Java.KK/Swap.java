public class Swap {
    public static void main(String[] args) {
        // int a = 10;
        // int b = 20;

        // swap numbers code
        // int temp = a;
        // a = b;
        // b = temp;

        // swap(a, b);
        // System.out.println(a + " " + b);

        String name = "Karan Kumar Nonia";
        changeName(name);
        System.out.println("Original Name(inside main) : " + name);
    }

    static void changeName(String name) {
        name = "chandan0P";
        System.out.println("Changed Name(inside changeName) : " + name);
    }

    // static void swap(int a, int b) {
    //     int temp = a;
    //     a = b;
    //     b = temp;

    // this change will only be valid in this function scope only.
    
    //     System.out.println(a + " " + b);
    // }
}