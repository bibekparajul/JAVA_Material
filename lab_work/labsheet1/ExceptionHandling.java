import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = {1, 2, 3, 4, 5};

        try {
            System.out.print("Enter the index to access: ");
            int index = scanner.nextInt();
            System.out.println("Value at index " + index + " is: " + numbers[index]);

            System.out.print("Enter a number to divide: ");
            int divisor = scanner.nextInt();
            int result = numbers[3] / divisor; // Potential division by zero

            System.out.println("Result of division: " + result);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of bounds.");
        } catch (ArithmeticException e) {
            System.out.println("Attempted to divide by zero.");
        } finally {
            // Finally block always gets executed regardless of whether an exception occurs or not
            System.out.println("Finally block executed.");
        }
    }
}
