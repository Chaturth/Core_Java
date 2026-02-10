//Declare a class WaterFall , declare two static methods 1. info with 4 parameters and invoke it 5 times 2. stateOwningInfo with 5 parameters and invoke it 5 times 

class WaterFall{
	static void waterFallInfo(String name,String location,int depth,int height)
	{
		System.out.println("name of the waterfall:"+name);
		System.out.println("location of the waterfall:"+location);
		System.out.println("depth of the waterfall in meeters:"+depth);
		System.out.println("heigth of the waterfall in feet:"+height);
		System.out.println("--------------------------------------");
	}

	
	static void stateOwningInfo(String state, String district,boolean isTouristplace,boolean isBeautifull,int entryPrice)
	{
		System.out.println("name of the state:"+state);
		System.out.println("name of the district:"+district);
		System.out.println("this is tourist place:"+isTouristplace);
		System.out.println("is beautifull location:"+isTouristplace);
		System.out.println("entrt fee to visit place:"+entryPrice);
		System.out.println("--------------------------------------");
	}
}

		