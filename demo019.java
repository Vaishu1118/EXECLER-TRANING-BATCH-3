import java.util.Scanner;

public class demo019 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a number from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int sum = 0;

        // Calculate the sum of digits
        while (number != 0) {
            int digit = number % 10;  // Extract the last digit
            sum += digit;            // Add the digit to the sum
            number /= 10;            // Remove the last digit
        }

        // Display the result
        System.out.println("The sum of the digits is: " + sum);

        scanner.close();
    }
}
