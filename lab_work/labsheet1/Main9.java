// Drawable interface
interface Drawable {
    void draw();
}

// Circle class implementing Drawable interface
class Circle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}

// Square class implementing Drawable interface
class Square implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a Square");
    }
}

public class Main9 {
    public static void main(String[] args) {
        // Create an array of Drawable objects
        Drawable[] drawables = new Drawable[2];
        drawables[0] = new Circle();
        drawables[1] = new Square();

        // Invoke draw() method for each object in the array
        for (Drawable drawable : drawables) {
            drawable.draw();
        }
    }
}
