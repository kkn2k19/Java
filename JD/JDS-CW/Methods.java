public class Methods {
    // Non return type without parameter
    static void voidMethod() {
        System.out.println("void method is calling");
    }

    // Non return type with parameter
    static void voidMethodNew(int n) {
        System.out.println("void method with parameter is calling");
    }

    // Return type without parameter
    static String mtlbiFriend() {
        return "Lath, Rod .....";
    }

    // return type with parameter
    static String mtlbiFriendWithMoney(int money) {
        return "Paise me Lath, Rod manga li ....";
    }

    public static void main(String[] args) {
        System.out.println("Hellow");
        // calling ....
        Methods.voidMethod();
        voidMethod();
        voidMethodNew(50);

        String str = mtlbiFriend();
        System.out.println(str);

        String str1 = mtlbiFriendWithMoney(2000);
        System.out.println(str1);
    }
}

// OUTPUT

// Hellow
// void method is calling
// void method is calling
// void method with parameter is calling
// Lath, Rod .....
// Paise me Lath, Rod manga li ....