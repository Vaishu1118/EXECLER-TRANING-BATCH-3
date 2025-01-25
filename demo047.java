import java.util.Scanner;
public class Demo047 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        number = Math.abs(number);

        int count = 0;

        do {
            count++;
            number /= 10;
        } while (number > 0);

        System.out.println("The number of digits is: " + count);
    }
}
