public class MethodOverloading {
    public static void main(String[] args) {
        // fun(101);
        // fun("Karan");
        int ans1 = sum(3, 4);
        System.out.println(ans1);
        int ans2 = sum(3, 4, 78);
        System.out.println(ans2);
    }

    static int sum(int a, int b) {
        return a + b;
    }

    static int sum(int a, int b, int c) {
        return a + b + c;
    }

    static void fun(int a) {
        System.out.println(a);
    }

    static void fun(String name) {
        System.out.println(name);
    }
}
