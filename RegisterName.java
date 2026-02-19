class RegisterTeam{
	static void registerInfo(String teamName,String captainName,int ranking,boolean isHost,int squadSize)
	{  
		if(teamName==null)
		{
			System.out.println("The name is invalid");
			return;
		}
		System.out.println("teamname is:"+teamName);
		
		if(captainName==null)
		{
			System.out.println("The captain name is invalid");
			return;
		}
		System.out.println("captain is:"+captainName);
		
		if(ranking==0)
		{
			System.out.println("Ranking is invalid");
			return;
		}
		System.out.println("ranking is:"+ranking);
		
		if(squadSize==0)
		{
			System.out.println("Squadsize is invalid");
			return;
		}
		System.out.println("squadSize is:"+squadSize);
		
		System.out.println("All fields are valid");
	}
}
