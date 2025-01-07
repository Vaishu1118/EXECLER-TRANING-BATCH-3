import java.util.Scanner;

public class demo017 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Remove spaces and convert to lowercase for uniform comparison
        String cleanedInput = input.replaceAll("\\s", "").toLowerCase();

        // Reverse the string
        String reversed = new StringBuilder(cleanedInput).reverse().toString();

        // Check if the input string is a palindrome
        if (cleanedInput.equals(reversed)) {
            System.out.println("The string \"" + input + "\" is a palindrome.");
        } else {
            System.out.println("The string \"" + input + "\" is not a palindrome.");
        }

        scanner.close();
    }
}

