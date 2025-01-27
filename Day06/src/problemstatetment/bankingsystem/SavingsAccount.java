package problemstatetment.bankingsystem;

//SavingsAccount class
class SavingsAccount extends BankAccount implements Loanable{
    private double interestRate;

    // Constructor
    public SavingsAccount(String accountNumber, String holderName, double balance, double interestRate) {
        super(accountNumber, holderName, balance);
        this.interestRate = interestRate;
    }

    @Override
    public double calculateInterest() {
        return getBalance() * interestRate / 100;
    }

    @Override
    public boolean applyForLoan(double loanAmount) {
        if (loanAmount <= calculateLoanEligibility()) {
            System.out.println("Loan approved for $" + loanAmount);
            return true;
        }
        System.out.println("Loan denied for $" + loanAmount);
        return false;
    }

    @Override
    public double calculateLoanEligibility() {
        return getBalance() * 2;
    }
}


