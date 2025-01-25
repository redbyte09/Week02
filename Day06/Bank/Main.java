package Bank;

// Abstract class for BankAccount implementing Loanable interface
abstract class BankAccount implements Loanable {
    private int accountNumber;
    private String holderName;
    private double balance;
    private double amount; // amount used for deposit and withdrawal operations

    // Constructor to initialize BankAccount fields
    public BankAccount(int accountNumber, String holderName, double balance, double amount) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
        this.amount = amount;
    }

    // Getters and Setters for account details
    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    // Deposit method: Adds amount to the balance
    public void deposit() {
        System.out.println("Deposit amount is " + this.amount);
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Current balance after deposit: " + balance);
        } else {
            System.out.println("Amount must be positive.");
        }
    }

    // Withdraw method: Deducts amount from balance if enough balance is available
    public void withdraw() {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Current balance after withdrawal: " + balance);
        } else {
            System.out.println("Insufficient balance for withdrawal.");
        }
    }

    // Abstract method to calculate interest, to be implemented by subclasses
    abstract double calculateInterest();

    // Display account details
    public void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Balance: " + balance);
        System.out.println("Transaction Amount: " + amount);
    }
}

// Loanable interface with methods for loan application and eligibility check
interface Loanable {
    void applyForLoan(); // Method to apply for a loan
    String calculateLoanEligibility(); // Method to calculate loan eligibility
}

// SavingsAccount class extending BankAccount and implementing Loanable
class SavingsAccount extends BankAccount {
    private int interestRate; // Interest rate for savings account
    private int time; // Time period for calculating interest
    private double loanAmount; // Loan amount that can be applied for

    // Constructor to initialize SavingsAccount fields
    public SavingsAccount(int accountNumber, String holderName, double balance, double amount, int interestRate, int time, double loanAmount) {
        super(accountNumber, holderName, balance, amount);
        this.interestRate = interestRate;
        this.time = time;
        this.loanAmount = loanAmount;
    }

    // Implement the calculateInterest method specific to SavingsAccount
    @Override
    public double calculateInterest() {
        return (getBalance() * interestRate * time) / 100;
    }

    // Apply for a loan (implementation of Loanable interface)
    @Override
    public void applyForLoan() {
        System.out.println("Applying for loan with the following details:");
        System.out.println("Account Holder Name: " + getHolderName());
        System.out.println("Account Number: " + getAccountNumber());
        System.out.println("Requested Loan Amount: " + loanAmount);
    }

    // Calculate loan eligibility (implementation of Loanable interface)
    @Override
    public String calculateLoanEligibility() {
        // Example eligibility criteria based on balance, time, and loan amount
        if (getBalance() >= loanAmount * 2) {
            return "Loan eligibility is approved.";
        } else {
            return "Loan eligibility is denied.";
        }
    }

    // Display SavingsAccount details (extended from BankAccount)
    @Override
    public void displayDetails() {
        super.displayDetails(); // Call the superclass method to display common details
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("Time period for interest calculation: " + time + " years");
        System.out.println("Loan Amount: " + loanAmount);
    }
}

// CurrentAccount class extending BankAccount and implementing Loanable
class CurrentAccount extends BankAccount {
    private double overdraftLimit; // Overdraft limit for Current Account
    private double loanAmount; // Loan amount that can be applied for

    // Constructor to initialize CurrentAccount fields
    public CurrentAccount(int accountNumber, String holderName, double balance, double amount, double overdraftLimit, double loanAmount) {
        super(accountNumber, holderName, balance, amount);
        this.overdraftLimit = overdraftLimit;
        this.loanAmount = loanAmount;
    }

    // Implement the calculateInterest method specific to CurrentAccount
    @Override
    public double calculateInterest() {
        // Example interest calculation for current account: 3% on balance
        return (getBalance() * 3) / 100;
    }

    // Apply for a loan (implementation of Loanable interface)
    @Override
    public void applyForLoan() {
        System.out.println("Applying for loan with the following details:");
        System.out.println("Account Holder Name: " + getHolderName());
        System.out.println("Account Number: " + getAccountNumber());
        System.out.println("Requested Loan Amount: " + loanAmount);
    }

    // Calculate loan eligibility (implementation of Loanable interface)
    @Override
    public String calculateLoanEligibility() {
        // Example eligibility criteria based on balance and overdraft limit
        if (getBalance() + overdraftLimit >= loanAmount) {
            return "Loan eligibility is approved.";
        } else {
            return "Loan eligibility is denied.";
        }
    }

    // Display CurrentAccount details (extended from BankAccount)
    @Override
    public void displayDetails() {
        super.displayDetails(); // Call the superclass method to display common details
        System.out.println("Overdraft Limit: " + overdraftLimit);
        System.out.println("Loan Amount: " + loanAmount);
    }
}

// Main class to test the BankAccount system
public class Main {
    public static void main(String[] args) {
        // Create a SavingsAccount object
        BankAccount savingsAccount = new SavingsAccount(101, "Kamla", 5000, 2000, 5, 2, 3000);
        
        // Create a CurrentAccount object
        BankAccount currentAccount = new CurrentAccount(102, "Jerry", 3000, 1500, 1000, 2000);

        // Display SavingsAccount details
        System.out.println("\nSavings Account Details:");
        savingsAccount.displayDetails();

        // Deposit amount and display updated balance
        savingsAccount.deposit();

        // Withdraw amount and display updated balance
        savingsAccount.withdraw();

        // Calculate and display interest
        double interest = savingsAccount.calculateInterest();
        System.out.println("Interest earned on balance: " + interest);

        // Apply for a loan and check loan eligibility
        savingsAccount.applyForLoan();
        String eligibility = savingsAccount.calculateLoanEligibility();
        System.out.println(eligibility);

        // Display CurrentAccount details
        System.out.println("\nCurrent Account Details:");
        currentAccount.displayDetails();

        // Deposit amount and display updated balance for current account
        currentAccount.deposit();

        // Withdraw amount and display updated balance for current account
        currentAccount.withdraw();

        // Calculate and display interest for current account
        double currentInterest = currentAccount.calculateInterest();
        System.out.println("Interest earned on balance: " + currentInterest);

        // Apply for a loan and check loan eligibility for current account
        currentAccount.applyForLoan();
        String currentEligibility = currentAccount.calculateLoanEligibility();
        System.out.println(currentEligibility);
    }
}
