class FMRadio {

    static void turnOnOrOff(int radio) {
        if (radio == 0) {
            System.out.println("The radio is on");
            return;
        }
        System.out.println("The radio is off");
    }  
   
   static void setFrequency(double parameterFrequency)
{
    if (parameterFrequency >= 88.0 && parameterFrequency <= 108.0)
    {
        System.out.println("VALID");
        return;
    }
    System.out.println("NOT VALID");
}
   
    static void increaseVolume(int increment)
	{
		if(increment>=0)
		{
			System.out.println("Incrementing volume:"+increment);
		}
	}
	
	static void decrementVolume(int decrement)
	{
		if(decrement<=10)
		{
			System.out.println("decreasing the volume:"+decrement);
		}
	}
    
	
}



	





