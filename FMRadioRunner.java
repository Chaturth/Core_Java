
class FMRadioRunner{
	public static void main(String[] args)
	{
		
        int radio = 0;  
        FMRadio.turnOnOrOff(radio);
		
		double parameter=89.9;
		
		FMRadio.setFrequency(parameter);
		
		int increase=9;
		int decrease=2;
		
		FMRadio.increaseVolume(increase);
		
		FMRadio.decrementVolume(decrease);
		
	

        
    }
}

   
	