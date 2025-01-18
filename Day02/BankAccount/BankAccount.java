package BankAccount;

// Parent class
public class BankAccount {
    // Public member
    public String accountNumber;

    // Protected member
    protected String accountHolder;

    // Private member
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Public method to set the balance
    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Invalid balance amount.");
        }
    }

    // Public method to get the balance
    public double getBalance() {
        return balance;
    }

    // Method to display bank account details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: $" + balance);
    }
}

// Subclass
class SavingsAccount extends BankAccount {
    private double interestRate;

    // Constructor
    public SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    // Method to display savings account details
    public void displaySavingsDetails() {
        System.out.println("Account Number: " + accountNumber); // Access public member
        System.out.println("Account Holder: " + accountHolder); // Access protected member
        System.out.println("Interest Rate: " + interestRate + "%");
    }

    // Main method for testing
    public static void main(String[] args) {
        // Create a BankAccount object
        BankAccount bankAccount = new BankAccount("123456789", "John Doe", 5000);
        bankAccount.displayAccountDetails();

        // Modify and access the balance using public methods
        bankAccount.setBalance(6000);
        System.out.println("Updated Balance: $" + bankAccount.getBalance());

        // Create a SavingsAccount object
        SavingsAccount savingsAccount = new SavingsAccount("987654321", "Jane Doe", 7000, 2.5);
        savingsAccount.displaySavingsDetails();
    }
}
