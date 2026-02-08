class ReverseString{
	public static void main(String[] args)
	{
		String location1="BALEHONNURU";
		String location2="";

		{
			for(int i=location1.length()-1;i>=0;i--)
				location2=location2+location1.charAt(i);
		}
	 System.out.println("location2:"+location2);
	}
}

		
