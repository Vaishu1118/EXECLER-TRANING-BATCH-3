import java.util.Scanner;

public class demo045 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter the first number (a): ");
        int a = scanner.nextInt();

        System.out.print("Enter the second number (b): ");
        int b = scanner.nextInt();

        System.out.println("Before swapping: a = " + a + ", b = " + b);

        // Swap using arithmetic operations
        a = a + b; // a now becomes a + b
        b = a - b; // b becomes a - b (original value of a)
        a = a - b; // a becomes a - b (original value of b)

        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}
