//Assignment Description:
//Write 5 methods in each class with a value returned . Invoke each method in a runner Suitcase Bullet Fire Water Crown Towel Ladder Bench Tablet Grenade Stabilizer ...Write below methods in Person class, validate all the parameters 1. contactInfo method ,with name,emails,mobileNumbers,address 2. foodDish method with name, ingredents 3. laptop method with brand,model,ports,countriesOfWarranty Read about inference, System class


class Suitcase{
	 static String getBrand(String brand)
	 {
		 System.out.println("Brand is:"+brand);
		 return brand;
	 }
	 
	 static int getPrice(int price)
	 {
		 System.out.println("price is:"+price);
		 return price;
	 }
	 
	 static int getCapacity(int capacity)
	 {
		 System.out.println("capacity is:"+capacity);
		 return capacity;
	 }
	  static String getColor(String color)
	 {
		 System.out.println("capacity is:"+color);
		 return color;
	 }
	static boolean getLock(boolean lock) {
    System.out.println("Lock available: " + lock);
    return lock;
}

	 
}
