import java.util.Scanner;

public class demo0018 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to input minutes
        System.out.print("Enter the number of minutes: ");
        long minutes = scanner.nextLong();

        // Conversion constants
        long minutesInYear = 60 * 24 * 365; // 1 year = 365 days

        // Calculate years and remaining minutes
        long years = minutes / minutesInYear;
        long remainingMinutes = minutes % minutesInYear;

        // Display the result
        System.out.println(minutes + " minutes is approximately " + years + " years and " + remainingMinutes + " minutes.");
    }
}
