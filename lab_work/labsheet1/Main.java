// Abstract class Animal
abstract class Animal {
    // Abstract methods
    public abstract void makeSound();
    public abstract void move();
}

// Subclass Dog extending Animal
class Dog extends Animal {
    // Implementing makeSound() method
    @Override
    public void makeSound() {
        System.out.println("Dog makes woof-woof sound.");
    }

    // Implementing move() method
    @Override
    public void move() {
        System.out.println("Dog moves by walking or running.");
    }
}

// Subclass Bird extending Animal
class Bird extends Animal {
    // Implementing makeSound() method
    @Override
    public void makeSound() {
        System.out.println("Bird chirps or sings.");
    }

    // Implementing move() method
    @Override
    public void move() {
        System.out.println("Bird moves by flying.");
    }
}

public class Main {
    public static void main(String[] args) {
        // Create instances of Dog and Bird
        Animal dog = new Dog();
        Animal bird = new Bird();

        // Demonstrate usage of Dog
        System.out.println("Dog:");
        dog.makeSound();
        dog.move();
        System.out.println();

        // Demonstrate usage of Bird
        System.out.println("Bird:");
        bird.makeSound();
        bird.move();
    }
}
