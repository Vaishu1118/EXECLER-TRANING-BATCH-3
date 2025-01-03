import java.util.Scanner;

public class demo008 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String correctUsername = "vaishnavi";
        String correctPassword = "vaishu18";
        String username, password;

        System.out.println("Hello, welcome to Malla Reddy University!");
        System.out.println("Please login here.");

        do {
            System.out.print("Enter Username: ");
            username = scanner.nextLine();

            System.out.print("Enter Password: ");
            password = scanner.nextLine();

            if (username.equals(correctUsername) && password.equals(correctPassword)) {
                System.out.println("Successfully logged in!");
                break;
            } else {
                System.out.println("Invalid username or password. Please try again.");
            }
        } while (true);

        scanner.close();
    }
}
