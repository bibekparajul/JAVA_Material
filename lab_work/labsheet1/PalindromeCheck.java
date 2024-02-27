import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome number.");
        } else {
            System.out.println(number + " is not a palindrome number.");
        }
    }

    // Function to check if a number is a palindrome
    public static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reverse = 0;

        // Reversing the number
        while (number != 0) {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number /= 10;
        }

        // Checking if the original number is equal to its reverse
        return originalNumber == reverse;
    }
}
