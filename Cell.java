class Cell {

    static void recharge(double amount) {
        if (amount > 0) {
            System.out.println("Recharge successful: " + amount);
        }
    }

    static void recharge(double amount, String planName) {
        if (amount > 0) {
            System.out.println("Recharge successful: " + amount + " Plan: " + planName);
        }
    }
}
