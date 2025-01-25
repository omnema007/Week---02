package hierarchicalinheritance.bankaccounttypes;

public class BankAccountTypes {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount("SAV12345", 5000.00, 2.5);
        savingsAccount.displayAccountDetails();
        savingsAccount.displayAccountType();
        System.out.println();

        CheckingAccount checkingAccount = new CheckingAccount("CHK67890", 3000.00, 1000.00);
        checkingAccount.displayAccountDetails();
        checkingAccount.displayAccountType();
        System.out.println();

        FixedDepositAccount fixedDepositAccount = new FixedDepositAccount("FD45678", 10000.00, 12);
        fixedDepositAccount.displayAccountDetails();
        fixedDepositAccount.displayAccountType();
    }
}