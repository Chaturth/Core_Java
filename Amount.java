class Amount{

    
    static void deposit(int accountNumber, double amount) {
        if (amount > 0) {
            System.out.println("Amount " + amount + " deposited to account number: " + accountNumber);
        } else {
            System.out.println("Invalid amount. Deposit failed.");
        }
    }

    
    static void deposit(int accountNumber, double amount, String branchName) {
        if (amount > 0) {
            System.out.println("Amount " + amount + " deposited to account number: "
                    + accountNumber + " at branch: " + branchName);
        } else {
            System.out.println("Invalid amount. Deposit failed.");
        }
    }

   
    static void deposit(String accountHolderName, double amount) {
        if (amount > 0) {
            System.out.println("Amount " + amount + " deposited to account holder: " + accountHolderName);
        } else {
            System.out.println("Invalid amount. Deposit failed.");
        }
    }
}
