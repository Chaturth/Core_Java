class Army {

    static void saveArmy(int noOfSoldiers,int noOfElephants,int noOfHorses,String type,int noOfWeapons,String commanderName,boolean commanderMarried,String commanderWifeName,boolean commanderIsFather,String commanderChildName,int commanderExperience) {

        
        if (noOfSoldiers > 500) {
    System.out.println("No of Soldiers :+ noOfSoldiers " );
}

if (noOfElephants >= 0) {
    System.out.println("No of Elephants :+ noOfElephants ");
}

if (noOfHorses >= 20) {
    System.out.println("No of Horses:+noOfHorses " );
}

if (type != null) {
    System.out.println("Army Type: +type" );
}

if (noOfWeapons > 0) {
    System.out.println("No of Weapons :noOfWeapons " );
}

if (commanderName != null) {
    System.out.println("Commander Name: " + commanderName);
}

if (commanderMarried == true) {
    System.out.println("Commander Married: " + commanderMarried);
}

if (commanderMarried == false) {
    System.out.println("Commander Married: " + commanderMarried);
}

if (commanderWifeName != null) {
    System.out.println("Commander Wife Name : " + commanderWifeName);
}

if (commanderIsFather == true) {
    System.out.println("Commander is Father : " + commanderIsFather);
}

if (commanderIsFather == false) {
    System.out.println("Commander is Father : " + commanderIsFather);
}

if (commanderChildName != null) {
    System.out.println("Commander Child : " + commanderChildName);
}

if (commanderExperience > 0) {
    System.out.println("Commander Experience: " + commanderExperience + " years");
}

if (noOfSoldiers <= 400) {
    System.out.println("Army data is NOT valid");
    return;
}

if (commanderExperience >= 10) {
    System.out.println("Army data is valid");
}


        System.out.println("-------------------------------------");
	}
}
