class Calculator {
    // Method 1 : Adding two integers
    int add(int a, int b) {
        return a + b;
    }

    // Method 2 : Adding three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method 3 : Adding two doubles
    double add(double a, double b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(5, 10));
        System.out.println(calc.add(5, 10, 15));
        System.out.println(calc.add(7.3, 3.7));
    }
}

// OUTPUT ---

// 15
// 30
// 11.0