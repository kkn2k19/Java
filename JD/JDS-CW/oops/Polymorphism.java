class Calculator {
    // Method overloading (compile time polymorphism).
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}

// Method overriding (run time polymorphism).
class Animal {
    void sound() {
        System.out.println("Animal makes a sound.");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks.");
    }
}

class Polymorphism {
    public static void main(String[] args) {
        // Method overloading (compile time polymorphism).
        Calculator cal = new Calculator();
        System.out.println(cal.add(2, 3));
        System.out.println(cal.add(7.3, 3.7));

        // Method overriding (run time polymorphism).
        Animal an = new Animal();
        an.sound();
        Dog d = new Dog();
        d.sound(); // Calls overridden method.
    }
}


// OUTPUT ---

// 5
// 11.0
// Animal makes a sound.
// Dog barks.