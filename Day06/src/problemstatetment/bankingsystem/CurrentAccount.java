package problemstatetment.bankingsystem;

//CurrentAccount class
class CurrentAccount extends BankAccount {
    private double overdraftLimit;

    // Constructor
    public CurrentAccount(String accountNumber, String holderName, double balance, double overdraftLimit) {
        super(accountNumber, holderName, balance);
        this.overdraftLimit = overdraftLimit;
    }

    // Calculate interest
    @Override
    public double calculateInterest() {
        return 0;
    }

    public void useOverdraft(double amount) {
        if (amount <= overdraftLimit) {
            System.out.println("Overdraft of $" + amount + " used.");
        } else {
            System.out.println("Overdraft limit exceeded!");
        }
    }
}
