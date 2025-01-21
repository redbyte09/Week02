public class BankAccount {
    // Static variable shared across all accounts
    private static String bankName = "Bank Of Baroda";
    
    // Static variable to keep track of the total number of accounts
    private static int totalAccounts = 0;
    
    // Final variable for account number to ensure it cannot be changed once assigned
    private final int accountNumber;
    
    // Instance variable for account holder name
    private String accountHolderName;
    
    // Constructor using `this` to resolve ambiguity
    public BankAccount(String accountHolderName, int accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccounts++; // Increment total accounts when a new account is created
    }
    
    // Static method to display the total number of accounts
    public static int getTotalAccounts() {
        return totalAccounts;
    }
    
    // Getter methods
    public String getAccountHolderName() {
        return accountHolderName;
    }
    
    public int getAccountNumber() {
        return accountNumber;
    }
    
    // Static method to get the bank name
    public static String getBankName() {
        return bankName;
    }
    
    // Method to display account details if the object is an instance of BankAccount
    public void displayAccountDetails() {
        if (this instanceof BankAccount) {
            System.out.println("Bank Name: " + BankAccount.getBankName());
            System.out.println("Account Holder Name: " + this.getAccountHolderName());
            System.out.println("Account Number: " + this.getAccountNumber());
        } else {
            System.out.println("The object is not an instance of BankAccount.");
        }
    }
    
    public static void main(String[] args) {
        // Creating instances of BankAccount
        BankAccount account1 = new BankAccount("Alice", 1001);
        BankAccount account2 = new BankAccount("Bob", 1002);
        
        // Displaying details of each account
        account1.displayAccountDetails();
        account2.displayAccountDetails();
        
        // Displaying the total number of accounts
        System.out.println("Total Accounts: " + BankAccount.getTotalAccounts());
    }
}
