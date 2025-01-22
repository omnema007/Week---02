class BankAccount {
    // Static variable
    private static String bankName = "SBI";
    private static int totalAccounts = 0;

    // Final variable
    private final int accountNumber;

    // Instance variables
    private String accountHolderName;
    private double balance;

    // Constructor
    public BankAccount(String accountHolderName, int accountNumber, double initialDeposit) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = initialDeposit;
        totalAccounts++;
    }

    // Static method to display total accounts
    public static int getTotalAccounts() {
        return totalAccounts;
    }

    // Method to display account details
    public void displayAccountDetails() {
        // Using instanceof to check the object type
        if (this instanceof BankAccount) {
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Holder Name: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Balance: $" + balance);
        } else {
            System.out.println("Invalid account object!");
        }
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount!");
        }
    }

    public static void main(String[] args) {

        BankAccount account1 = new BankAccount("Alice", 1001, 500.00);
        BankAccount account2 = new BankAccount("Smith", 1002, 1000.00);

        // Displaying account details
        account1.displayAccountDetails();
        System.out.println();

        account2.displayAccountDetails();
        System.out.println();

        account1.deposit(200.00);
        account1.withdraw(100.00);
        account1.displayAccountDetails();
        System.out.println();

        // Display total accounts
        System.out.println("Total Accounts: " + BankAccount.getTotalAccounts());
    }
}
