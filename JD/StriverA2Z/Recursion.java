public class Recursion {
    public static void main(String[] args) {
        func();
    }

    static int count = 0; // global declaration

    public static void func() {
        // Base Case
        if (count == 4) {
            return;
        }
        System.out.println(count);
        count++;
        func(); // recursion
    }
}