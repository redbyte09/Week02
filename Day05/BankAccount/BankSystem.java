package BankAccount;

// Base class: BankAccount
class BankAccount {
    private String accountNumber;
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to display account details
    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }

    // Method to display account type (to be overridden by subclasses)
    public void displayAccountType() {
        System.out.println("Generic Bank Account");
    }
}

// Subclass: SavingsAccount
class SavingsAccount extends BankAccount {
    private double interestRate;

    // Constructor
    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    // Method to display account type
    @Override
    public void displayAccountType() {
        System.out.println("Account Type: Savings Account");
    }

    // Method to display additional details
    @Override
    public void displayAccountInfo() {
        super.displayAccountInfo();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

// Subclass: CheckingAccount
class CheckingAccount extends BankAccount {
    private double withdrawalLimit;

    // Constructor
    public CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    // Method to display account type
    @Override
    public void displayAccountType() {
        System.out.println("Account Type: Checking Account");
    }

    // Method to display additional details
    @Override
    public void displayAccountInfo() {
        super.displayAccountInfo();
        System.out.println("Withdrawal Limit: " + withdrawalLimit);
    }
}

// Subclass: FixedDepositAccount
class FixedDepositAccount extends BankAccount {
    private int depositTerm; // in months

    // Constructor
    public FixedDepositAccount(String accountNumber, double balance, int depositTerm) {
        super(accountNumber, balance);
        this.depositTerm = depositTerm;
    }

    // Method to display account type
    @Override
    public void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
    }

    // Method to display additional details
    @Override
    public void displayAccountInfo() {
        super.displayAccountInfo();
        System.out.println("Deposit Term: " + depositTerm + " months");
    }
}

// Main class to test the hierarchy
public class BankSystem {
    public static void main(String[] args) {
        // Create accounts of different types
        SavingsAccount savings = new SavingsAccount("S12345", 2000.0, 3.5);
        CheckingAccount checking = new CheckingAccount("C67890", 1500.0, 500.0);
        FixedDepositAccount fixedDeposit = new FixedDepositAccount("1223", 10000.0, 12);

        // Display information for each account type
        savings.displayAccountType();
        savings.displayAccountInfo();

        System.out.println();

        checking.displayAccountType();
        checking.displayAccountInfo();

        System.out.println();

        fixedDeposit.displayAccountType();
        fixedDeposit.displayAccountInfo();
    }
}

