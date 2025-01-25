package BankAccount;

public class BankAccount {
    // private feilds
    private String accountHolder;
    private int accountNumber;
    private double balance;

    // Constructor to initialize the BankAccount
    public BankAccount(String accountHolder, int accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Successfully withdrew: " + amount);
            } else {
                System.out.println("Insufficient balance. Withdrawal denied.");
            }
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    // Method to display the current balance
    public void displayBalance() {
        System.out.println("Current balance: " + balance);
    }

  
    public static void main(String[] args) {
        // Create a new bank account
        BankAccount account = new BankAccount("John Doe", 123456, 1000.0);

        // Display the initial balance
        account.displayBalance();

        // Deposit money
        account.deposit(500);
        account.displayBalance();

        // Attempt to withdraw money
        account.withdraw(300);
        account.displayBalance();

        // Attempt to withdraw more money than the balance
        account.withdraw(1500);
        account.displayBalance();
    }
}
