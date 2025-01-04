public class demo009 {

    private String customerName;
    private String accountNumber;
    private double balance;


    public demo009(String customerName, String accountNumber, double initialBalance) {
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Create a new bank account
        demo009 account = new demo009("vaishnavi", "1234567890", 5000.00);

        // Display account details
        account.displayAccountDetails();
    }
}
