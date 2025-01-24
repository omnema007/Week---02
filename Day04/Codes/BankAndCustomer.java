import java.util.ArrayList;

// BankAccount class
class BankAccount {
    String accountNumber;
    double balance;

    // Constructor
    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber + ", Balance: $" + balance);
    }
}

// Customer class
class Customer {
    String name;
    ArrayList<BankAccount> accounts;

    // Constructor
    public Customer(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    // Add account to customer
    public void addAccount(BankAccount account) {
        accounts.add(account);
    }

    // method to view balance
    public void viewBalances() {
        System.out.println("Customer: " + name);
        for (BankAccount account : accounts) {
            account.displayAccountDetails();
        }
    }
}

// Bank class
class Bank {
    String name;
    ArrayList<Customer> customers;

    // Constructor
    public Bank(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    // method to open account
    public void openAccount(Customer customer, String accountNumber, double initialBalance) {
        BankAccount account = new BankAccount(accountNumber, initialBalance);
        customer.addAccount(account);
        if (!customers.contains(customer)) {
            customers.add(customer);
        }
        System.out.println("Opened account " + accountNumber + " for " + customer.name + " at " + name);
    }

    // Display customers details
    public void displayCustomers() {
        System.out.println("Customers of " + name + ":");
        for (Customer customer : customers) {
            System.out.println("- " + customer.name);
        }
    }
}

public class BankAndCustomer {
    public static void main(String[] args) {
        Bank bank = new Bank("Simple Bank");

        Customer alice = new Customer("Alice");
        Customer bob = new Customer("Bob");

        bank.openAccount(alice, "A101", 500.0);
        bank.openAccount(alice, "A102", 800.0);
        bank.openAccount(bob, "B201", 1000.0);

        alice.viewBalances();
        bob.viewBalances();

        bank.displayCustomers();
    }
}
