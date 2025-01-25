package hierarchicalinheritance.bankaccounttypes;

// Superclass BankAccount
class BankAccount {
    String accountNumber;
    double balance;

    // Constructor
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }

    public void displayAccountType() {
        System.out.println("General Bank Account");
    }
}
