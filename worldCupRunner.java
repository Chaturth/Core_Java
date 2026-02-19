class WorldCupRunner{
	public static void main(String[] args)
	{
		WorldCup.registerTeam("India","Virat",1,true,11);
		WorldCup.saveMatch(18,"India","Australia","Bengaluru",14/02/2026,10.5,50,true,"usufff","rajendra singh");
		WorldCup.savePlayer("Smith","Australia",15,"batter",false,false,255,5000,0,58.57,0);
		WorldCup.calculateRunRate(10000,1000,100);
		WorldCup.checkQualification(10,68.88,55);
		WorldCup.manOfTheMatches("Virat",1000,12);
	}
}
