import java.util.Scanner;

class demo010 {
    private String name;
    private String accountNumber;
    private double balance;

    public Customer(String name, String accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    
    public void displayDetails() {
        System.out.println("Customer Name: " + name);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

public class demo010 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for customer details
        System.out.print("Enter customer name: ");
        String name = scanner.nextLine();

        System.out.print("Enter account number: ");
        String accountNumber = scanner.nextLine();

        System.out.print("Enter balance: ");
        double balance = scanner.nextDouble();

        // Creating a Customer object
        Customer customer = new Customer(name, accountNumber, balance);

        // Displaying customer details
        customer.displayDetails();

        scanner.close();
    }
}
