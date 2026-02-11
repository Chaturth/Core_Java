class Shopping {

  
    static void purchase(String productName, double price) {
        if (price > 0) {
            System.out.println("Product purchased: " + productName + " for price: " + price);
        } else {
            System.out.println("Invalid price. Purchase failed.");
        }
    }

   
    static void purchase(String productName, double price, int quantity) {
        if (price > 0 && quantity > 0) {
            double totalAmount = price * quantity;
            System.out.println("Product purchased: " + productName +
                    " | Quantity: " + quantity +
                    " | Total amount: " + totalAmount);
        } else {
            System.out.println("Invalid price or quantity. Purchase failed.");
        }
    }
}
