// Base class Shape
class Shape {
    // Methods to be overridden by derived classes
    public double calculateArea() {
        return 0.0; // Default implementation, to be overridden
    }

    public double calculatePerimeter() {
        return 0.0; // Default implementation, to be overridden
    }
}

// Derived class Circle from Shape
class Circle extends Shape {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Overriding methods from Shape
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

// Derived class Rectangle from Shape
class Rectangle extends Shape {
    private double length;
    private double width;

    // Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Overriding methods from Shape
    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        // Creating instances of Circle and Rectangle
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);

        // Calculating and displaying area and perimeter for Circle
        System.out.println("Circle - Area: " + circle.calculateArea());
        System.out.println("Circle - Perimeter: " + circle.calculatePerimeter());

        // Calculating and displaying area and perimeter for Rectangle
        System.out.println("Rectangle - Area: " + rectangle.calculateArea());
        System.out.println("Rectangle - Perimeter: " + rectangle.calculatePerimeter());
    }
}
