public class Scope {
    public static void main(String[] args) {
        // Scope ---
        // Function Scope/ Method scope --- swap.java
        // Block Scope

        int a = 10;
        int b = 20;
        String name = "Karan";
        {
            // int a = 78;  // already initialised outside the block in the same method, hence you cannot initialize again.
            a = 100; // reassign the original reference variable to some other value.
            System.out.println(a);

            int c = 99;
            name = "chandanOP";
            System.out.println(name);
            // values initialized in this block, will remain in block
        }
        int c = 900;
        System.out.println(a); // 100
        System.out.println(name);
        // System.out.println(c);  // cannot use outside the block

        // scoping in for loops
        for(int i=0; i<4; i++) {
            // System.out.println(i);
            int num = 90;
            a = 10000;
        }
        System.out.println(a);
    }
}


// anything that is initialized outside can be used inside but anything initialised inside can't be used outside