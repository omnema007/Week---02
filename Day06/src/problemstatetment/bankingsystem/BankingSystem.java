package problemstatetment.bankingsystem;

public class BankingSystem {
    public static void main(String[] args) {
        BankAccount savings = new SavingsAccount("SA123", "Ravi", 5000, 4);
        BankAccount current = new CurrentAccount("SB456", "Mohit", 2000, 1000);

        processAccount(savings);
        processAccount(current);
    }

    public static void processAccount(BankAccount account) {
        account.displayDetails();
        double interest = account.calculateInterest();
        System.out.println("Calculated Interest: $" + interest);

        if (account instanceof Loanable) {
            Loanable loanable = (Loanable) account;
            double loanEligibility = loanable.calculateLoanEligibility();
            System.out.println("Loan Eligibility: $" + loanEligibility);
            loanable.applyForLoan(5000); // Example loan application
        }

        System.out.println();
    }
}
