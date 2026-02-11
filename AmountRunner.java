class AmountRunner {
    public static void main(String[] args) {

        Amount.deposit(123456, 5000.0);              
        Amount.deposit(123456, -2000.0, "MG Road");  
        Amount.deposit("Rahul", 3000.0);            
    }
}
