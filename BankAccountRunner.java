class BankAccountRunner {
    public static void main(String[] args) {

        
        BankAccount.accountInfo("Rahul", 1234567890L, "SBI");
        BankAccount.accountInfo("Anita", 9876543210L, "HDFC");

       
        BankAccount.transactionInfo("Deposit", 5000, true);
        BankAccount.transactionInfo("Withdrawal", 2000, false);
    }
}