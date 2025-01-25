package hierarchicalinheritance.bankaccounttypes;

// Subclass FixedDepositAccount
class FixedDepositAccount extends BankAccount {
    int depositTerm;

    // Constructor
    public FixedDepositAccount(String accountNumber, double balance, int depositTerm) {
        super(accountNumber, balance);
        this.depositTerm = depositTerm;
    }

    public void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
        System.out.println("Deposit Term: " + depositTerm + " months");
    }
}
