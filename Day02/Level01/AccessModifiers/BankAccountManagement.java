class BankAccount {
    public String accountNumber; 
    protected String accountHolder; 
    private double balance; 

    // Constructor
    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double amount) {
        if (amount >= 0) {
            balance = amount;
        } 
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: $" + balance);
    }
}


class SavingsAccount extends BankAccount {
    private double interestRate; 

    // Constructor
    public SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance); 
        this.interestRate = interestRate;
    }

    // Method to display savings account details
    public void displaySavingsDetails() {
        System.out.println("Savings Account Details:");
        System.out.println("Account Number: " + accountNumber); 
        System.out.println("Account Holder: " + accountHolder); 
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("Balance: $" + getBalance()); 
    }
}


public class BankAccountManagement {
    public static void main(String[] args) {
     
        BankAccount account = new BankAccount("123456789", "Alice", 5000.0);
        System.out.println("Bank Account Details:");
        account.displayAccountDetails();

        // Modify the balance using the setter
        account.setBalance(5500.0);
        System.out.println("\nUpdated Bank Account Details:");
        account.displayAccountDetails();

        // Create a SavingsAccount object
        SavingsAccount savingsAccount = new SavingsAccount("987654321", "Bob", 7000.0, 3.5);
        System.out.println("\nSavings Account Details:");
        savingsAccount.displaySavingsDetails();
    }
}
