//class Kingdom{ // invoke this 36 static void save(boolean king,String name,String kingdomName,String queenName,String princessName,int populationOfKingdom,String territory,int yearOfBirth,int yearOfDeath,int armySize,int yearsRuled) { //print all the argument's // validation System.out.println("Kingdom Data is valid "); } // invoke this 40 static void saveArmy(int noOfSoldiers,int noOfElephants,int noOfHorses,String type,int noOfWeapons,String commanderName,boolean commanderMarried,String commanderWifeName,boolean commanderIsFather,String commanderChildName,int commanderExperience) { }

class Kingdom{
	static void save(boolean king,String name,String kingdomName,String queenName,String princessName,int populationOfKingdom,String territory,int yearOfBirth,int yearOfDeath,int armySize,int yearsRuled)
	{
		
	if (king == true) {
            System.out.println("King is alive");
        }

        if (king == false) {
            System.out.println("King is not alive");
        }

        if (name != null) {
            System.out.println("King Name: " + name);
        }

        if (kingdomName != null) {
            System.out.println("Kingdom Name: " + kingdomName);
        }

        if (queenName != null) {
            System.out.println("Queen Name: " + queenName);
        }

        if (princessName != null) {
            System.out.println("Princess Name: " + princessName);
        }

        if (territory != null) {
            System.out.println("Territory: " + territory);
        }

        if (populationOfKingdom > 500) {
            System.out.println("Population: " + populationOfKingdom);
        }

        if (yearOfBirth > 0) {
            System.out.println("Year of Birth: " + yearOfBirth);
        }
 
        if (armySize > 100) {
            System.out.println("Army Size: " + armySize);
        }

        if (yearsRuled > 15) {
            System.out.println("Years Ruled: " + yearsRuled);
        }

        if (populationOfKingdom > 300) {
            System.out.println("Large population kingdom");
        }

        if (yearsRuled > 20) {
            System.out.println("Kingdom data is valid");
        }

        System.out.println("----------------------------------");
    }
}


	