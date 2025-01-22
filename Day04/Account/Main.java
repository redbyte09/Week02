package Account;

import java.util.ArrayList;

// Class to represent a Bank Account
class Account {
    private int accountNumber;
    private double balance;
  //craete constructor here
    public Account(int accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
    // create method here to check for deposit
    public void deposit(double amount) {
        balance += amount;
    }
    //create method here for withdraw 
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance.");
        }
    }
}

// Class to represent a Customer
class Customer {
    private String name;
    private ArrayList<Account> accounts;

    public Customer(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void viewBalance() {
        for (Account account : accounts) {
            System.out.println("Account Number: " + account.getAccountNumber() + ", Balance: $" + account.getBalance());
        }
    }
}

// Class to represent a Bank
class Bank {
    private String bankName;
    private ArrayList<Customer> customers;

    public Bank(String bankName) {
        this.bankName = bankName;
        this.customers = new ArrayList<>();
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void openAccount(Customer customer, int accountNumber, double initialDeposit) {
        Account newAccount = new Account(accountNumber, initialDeposit);
        customer.addAccount(newAccount);
    }

    public void displayCustomers() {
        for (Customer customer : customers) {
            System.out.println("Customer Name: " + customer.getName());
            customer.viewBalance();
        }
    }
}

// Main class to demonstrate the relationship
public class Main {
    public static void main(String[] args) {
        // Create a Bank
        Bank bank = new Bank("MyBank");

        // Create Customers
        Customer customer1 = new Customer("Alice");
        Customer customer2 = new Customer("Bob");

        // Open accounts for customers
        bank.openAccount(customer1, 1001, 500.0);
        bank.openAccount(customer2, 1002, 1000.0);

        // Add customers to the bank
        bank.addCustomer(customer1);
        bank.addCustomer(customer2);

        // Display all customers and their account details
        bank.displayCustomers();

        // Customer views balance
        System.out.println("\n" + customer1.getName() + " views their account balance:");
        customer1.viewBalance();
    }
}

