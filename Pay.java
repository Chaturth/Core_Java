class Pay{
	
	static void rupees(int cash,int noOfRupees)
	{
		if(cash>0){
			System.out.println("Cash is received: " + cash + " " + noOfRupees);
		}
	}
	
	
	static void rupees(boolean card,String cardName,int noOfRupees)
	{
		if(card==true)
		{
			System.out.println("amount paid by using card:"+cardName + " " + noOfRupees);
		}
	}
}

