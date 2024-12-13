abstract class Shape {
    abstract void draw(); // abstract method (no body)
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a circle");
    }
}

public class Abstraction_abstractKeyword {
    public static void main(String[] args) {
        Shape shape = new Circle(); // create an object of circle
        shape.draw(); // call the abstract method of circle
    }
}

// OUTPUT ---

// Drawing a circle