class AllRunner {
    public static void main(String[] args) {

       
        String suitcaseBrand = Suitcase.getBrand("Puma");
        int suitcasePrice = Suitcase.getPrice(2000);
        int suitcaseCapacity = Suitcase.getCapacity(25);
        String suitcaseColor = Suitcase.getColor("Black");
        boolean suitcaseLock = Suitcase.getLock(true);

       
        String bulletModel = Bullet.getModel("Classic 350");
        int bulletPrice = Bullet.getPrice(220000);
        int bulletEngine = Bullet.getEngineCC(350);
        String bulletColor = Bullet.getColor("Black");
        boolean bulletAbs = Bullet.hasABS(true);

      
        String fireType = Fire.getType("Forest Fire");
        int fireTemperature = Fire.getTemperature(800);
        String fireColor = Fire.getColor("Orange");
        boolean fireDangerous = Fire.isDangerous(true);
        int fireDuration = Fire.getDuration(60);

     
        String waterSource = Water.getSource("River");
        int waterQuantity = Water.getQuantity(100);
        String waterColor = Water.getColor("Clear");
        boolean waterDrinkable = Water.isDrinkable(true);
        int waterPh = Water.getPH(7);

       
        String crownMaterial = Crown.getMaterial("Gold");
        int crownWeight = Crown.getWeight(500);
        String crownColor = Crown.getColor("Golden");
        boolean crownGems = Crown.hasGems(true);
        int crownPrice = Crown.getPrice(1000000);

     
        String towelBrand = Towel.getBrand("Bombay Dyeing");
        int towelPrice = Towel.getPrice(499);
        String towelColor = Towel.getColor("Blue");
        boolean towelCotton = Towel.isCotton(true);
        int towelLength = Towel.getLength(150);

     
        String ladderMaterial = Ladder.getMaterial("Aluminium");
        int ladderHeight = Ladder.getHeight(12);
        String ladderColor = Ladder.getColor("Silver");
        boolean ladderFoldable = Ladder.isFoldable(true);
        int ladderSteps = Ladder.getSteps(10);

    
        String benchMaterial = Bench.getMaterial("Teak Wood");
        int benchLength = Bench.getLength(150);
        String benchColor = Bench.getColor("Brown");
        boolean benchWooden = Bench.isWooden(true);
        int benchPrice = Bench.getPrice(3500);

  
        String tabletName = Tablet.getName("Paracetamol");
        int tabletPrice = Tablet.getPrice(50);
        String tabletBrand = Tablet.getBrand("Cipla");

        String grenadeType = Grenade.getType("Smoke");
        int grenadeWeight = Grenade.getWeight(400);
        String grenadeColor = Grenade.getColor("Green");
        boolean grenadeActive = Grenade.isActive(false);
        int grenadeRange = Grenade.getRange(30);

        String stabilizerBrand = Stabilizer.getBrand("V-Guard");
        int stabilizerCapacity = Stabilizer.getCapacity(1000);
        String stabilizerColor = Stabilizer.getColor("White");
        boolean stabilizerAutomatic = Stabilizer.isAutomatic(true);
        int stabilizerPrice = Stabilizer.getPrice(3500);

    }
}


		
		