class WorldCup{
	static void registerTeam(String teamName,String captainName,int ranking,boolean isHost,int squadSize)
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


  static void saveMatch(int matchId,String team1,String team2,String city,long date,double time,int overs,boolean isDay,String umpire1,String umpire2)
  {
	  if(matchId==0)
	  {
		  System.out.println("Match id is invalid");
		  return;
	  }
	  System.out.println("match id is:"+matchId);
	  
	  if(team1==null)
	  {
		   System.out.println("team1 is invalid");
		   return;
	  }
	  System.out.println("team1 is valid:"+team1);
	  
	   if(team2==null)
	  {
		   System.out.println("team2 is invalid");
		   return;
	  }
	  System.out.println("team2 is valid:"+team2);
	  
	  
	  if(city==null)
	  {
		  System.out.println("city is invalid");
		  return;
	  }
	  System.out.println("city is valid:"+city);
	  
	  if(date==0)
	  {
		  System.out.println("date is invalid");
		  return;
	  }
	  System.out.println("date is valid:"+date);
	  
	  if(overs>51)
	  {
		  System.out.println("match is invalid");
		  return;
	  }
	  System.out.println("matach is valid:"+overs);
	  
	  if(umpire1==null)
	  {
		  System.out.println("umpire name is null");
		  return;
	  }
	  System.out.println("umpire1 name is:"+umpire1);
	  
	  if(umpire2==null)
	  {
		  System.out.println("umpire name is null");
		  return;
	  }
	  System.out.println("umpire2 name is:"+umpire2);
	  
	  System.out.println("All fields are valid");
  }

  
    static void savePlayer(String playerName,String teamName,int jersyNo,String role,boolean isCaptain,boolean isViceCaptain,int matchesPlayed,int runScored,int wicketsTaken,double battingAvg,double BowlingEconomy)
	{
		System.out.println("the player name is:"+playerName);
		System.out.println("the team name is:"+teamName);
		System.out.println("the jersy no is:"+jersyNo);
		System.out.println("the role is:"+role);
		
		if(matchesPlayed==0)
		{
			System.out.println("He is not a main player");
			return;
		}
		System.out.println("matches played are:"+matchesPlayed);
		
		System.out.println("Runs scored by him:"+runScored);
		
		if(wicketsTaken==0)
		{
			System.out.println("he is not a bowler");
			return;
		}
		System.out.println("he is bowler:"+wicketsTaken);
		
		System.out.println("batting avg is:"+battingAvg);
		
		System.out.println("bowling economy is:"+BowlingEconomy);
		
	}
	
	
	static void calculateRunRate(int totalRuns,int oversFaced,int wicketsLost)
	{
		if(totalRuns>100)
		{
			System.out.println("not a good player");
			return;
		}
		System.out.println("totalruns is:"+totalRuns);
		
		System.out.println("overs is:"+oversFaced);
		
		System.out.println("wickets lost is:"+wicketsLost);
	}
	
		
		
	
	static void checkQualification(int points,double netRunRate,int matchesLeft)
	{
		System.out.println("points is:"+points);
		
		System.out.println("netRunRate is:"+netRunRate);
		
		if(matchesLeft==0)
		{
			System.out.println("Invalid");
			return;
		}
		System.out.println("matchesLeft is:"+matchesLeft);
	}
	
	static void manOfTheMatches(String playerName,int runs,int wickets)
	
	{
		System.out.println("Player name is :"+playerName);
		
		System.out.println("runs are:"+runs);
		
		System.out.println("wickets taken:"+wickets);
	}
	
}




  
	  
	  
	  
	 
	  
	 
	  
