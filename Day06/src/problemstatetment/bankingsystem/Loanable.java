package problemstatetment.bankingsystem;

//Interface Loanable
interface Loanable {
    boolean applyForLoan(double loanAmount);

    double calculateLoanEligibility();
}
