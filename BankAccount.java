//declare two methods with 3 parameters and invoke it two times 

class BankAccount {

    static void accountInfo(String holderName, long accountNumber, String bankName) {
        System.out.println("Account Holder Name: " + holderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Bank Name : " + bankName);
        System.out.println("----------------------------------");
    }

    static void transactionInfo(String type, int amount, boolean isSuccess) {
        System.out.println("Transaction Type : " + type);
        System.out.println("Amount: " + amount);
        System.out.println("Transaction Success : " + isSuccess);
        System.out.println("----------------------------------");
    }
}


