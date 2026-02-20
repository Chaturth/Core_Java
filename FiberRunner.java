class FiberRunner{
	public static void main(String[] args)
	{
		
        Fiber f1 = new Fiber();
        Fiber f2 = new Fiber();

        f1.name = "Arun";
        f1.length = 20;
        f1.vendors = "ABC Supply";

        f2.name = "Srujan";
        f2.length = 15;
        f2.vendors = "DDC Supply";

        System.out.println("----- Fiber 1 -----");
        System.out.println(f1.name + "\n " + f1.length + " \n" + f1.vendors);

        System.out.println("----- Fiber 2 -----");
        System.out.println(f2.name + " " + f2.length + " " + f2.vendors);


     
        Labour l1 = new Labour();
        Labour l2 = new Labour();

        l1.name = "Sharan";
        l1.salary = 1000;
        l1.idProofs = new String[]{"Aadhar", "PAN", "Voter ID"};

        l2.name = "Charan";
        l2.salary = 1500;
        l2.idProofs = new String[]{"Aadhar", "Driving License", "PAN"};

        System.out.println("\n----- Labour 1 -----");
        System.out.println("Name: " + l1.name);
        System.out.println("Salary: " + l1.salary);
        for (int i = 0; i < l1.idProofs.length; i++) {
            System.out.println("ID: " + l1.idProofs[i]);
        }

        System.out.println("\n----- Labour 2 -----");
        System.out.println("Name: " + l2.name);
        System.out.println("Salary: " + l2.salary);
        for (int i = 0; i < l2.idProofs.length; i++) {
            System.out.println("ID: " + l2.idProofs[i]);
        }

        AirConditioner a1 = new AirConditioner();
        AirConditioner a2 = new AirConditioner();

        a1.brand = "Whirlpool";
        a1.model = 2020;
        a1.price = 10000;
        a1.type = "Window";
        a1.weight = 8;
        a1.color = "White";
        a1.warranty = 2;

        a2.brand = "Bajaj";
        a2.model = 2015;
        a2.price = 15000;
        a2.type = "Split";
        a2.weight = 3;
        a2.color = "Black";
        a2.warranty = 1;

        System.out.println("\n AirConditioner 1 ");
        System.out.println(a1.brand + " " + a1.model + " " + a1.price + " "
                + a1.type + " " + a1.weight + " " + a1.color + " " + a1.warranty);

        System.out.println("\nAirConditioner 2 ");
        System.out.println(a2.brand + " " + a2.model + " " + a2.price + " "
                + a2.type + " " + a2.weight + " " + a2.color + " " + a2.warranty);

        Bread b1 = new Bread();
        Bread b2 = new Bread();

        b1.outletNames = new String[]{"SS Bakery", "Iyengar Bakery"};
        b1.ingredients = new String[]{"Maida", "Yeast"};
        b1.shapes = new String[]{"Rectangle", "Square"};

        b2.outletNames = new String[]{"RR Bakery", "Thomas Bakery"};
        b2.ingredients = new String[]{"Maida", "Yeast", "Water"};
        b2.shapes = new String[]{"Rectangle", "Square", "Cone"};

        System.out.println("\n----- Bread 1 -----");
        for (int i = 0; i < b1.outletNames.length; i++)
            System.out.println("Outlet: " + b1.outletNames[i]);

        for (int i = 0; i < b1.ingredients.length; i++)
            System.out.println("Ingredient: " + b1.ingredients[i]);

        for (int i = 0; i < b1.shapes.length; i++)
            System.out.println("Shape: " + b1.shapes[i]);

        System.out.println("\n----- Bread 2 -----");
        for (int i = 0; i < b2.outletNames.length; i++)
            System.out.println("Outlet: " + b2.outletNames[i]);

        for (int i = 0; i < b2.ingredients.length; i++)
            System.out.println("Ingredient: " + b2.ingredients[i]);

        for (int i = 0; i < b2.shapes.length; i++)
            System.out.println("Shape: " + b2.shapes[i]);

        Bun bun1 = new Bun();
        Bun bun2 = new Bun();

        bun1.brand = "Britannia";
        bun1.price = 30;
        bun1.type = "Sweet";
        bun1.quantity = 4;
        bun1.weight = 200;
        bun1.fresh = true;
        bun1.expiryDate = "25-02-2026";
        bun1.shape = "Round";
        bun1.manufacturer = "ABC Foods";
        bun1.taste = "Soft";
        bun1.ingredients = new String[]{"Flour", "Sugar"};
        bun1.outlets = new String[]{"ShopA", "ShopB"};

        bun2.brand = "Local";
        bun2.price = 20;
        bun2.type = "Milk";
        bun2.quantity = 6;
        bun2.weight = 250;
        bun2.fresh = true;
        bun2.expiryDate = "28-02-2026";
        bun2.shape = "Oval";
        bun2.manufacturer = "XYZ Bakery";
        bun2.taste = "Sweet";
        bun2.ingredients = new String[]{"Milk", "Flour"};
        bun2.outlets = new String[]{"ShopC"};

        System.out.println("\n----- Bun 1 -----");
        System.out.println(bun1.brand + " " + bun1.price + " " + bun1.type);
        for (int i = 0; i < bun1.ingredients.length; i++)
            System.out.println("Ingredient: " + bun1.ingredients[i]);
        for (int i = 0; i < bun1.outlets.length; i++)
            System.out.println("Outlet: " + bun1.outlets[i]);

        System.out.println("\n----- Bun 2 -----");
        System.out.println(bun2.brand + " " + bun2.price + " " + bun2.type);
        for (int i = 0; i < bun2.ingredients.length; i++)
            System.out.println("Ingredient: " + bun2.ingredients[i]);
        for (int i = 0; i < bun2.outlets.length; i++)
            System.out.println("Outlet: " + bun2.outlets[i]);
		
        Happydent h1 = new Happydent();
        Happydent h2 = new Happydent();

        h1.brand = "HappyDent White";
        h1.price = 10;
        h1.flavor = "Mint";
        h1.quantity = 5;
        h1.weight = 20;
        h1.color = "White";
        h1.sugarFree = true;
        h1.manufacturer = "Perfetti";
        h1.expiryDate = "12-2026";
        h1.ingredients = new String[]{"Mint", "Sweetener", "Gum Base"};
        h1.stores = new String[]{"Dmart", "Reliance"};

        h2.brand = "HappyDent Black";
        h2.price = 15;
        h2.flavor = "Strawberry";
        h2.quantity = 10;
        h2.weight = 30;
        h2.color = "Pink";
        h2.sugarFree = false;
        h2.manufacturer = "Perfetti";
        h2.expiryDate = "10-2026";
        h2.ingredients = new String[]{"Strawberry", "Sugar", "Gum Base"};
        h2.stores = new String[]{"More", "Big Bazaar"};

        System.out.println("\n----- HappyDent 1 -----");
        System.out.println(h1.brand + " " + h1.price + " " + h1.flavor);
        for (int i = 0; i < h1.ingredients.length; i++)
            System.out.println("Ingredient: " + h1.ingredients[i]);
        for (int i = 0; i < h1.stores.length; i++)
            System.out.println("Store: " + h1.stores[i]);

        System.out.println("\n----- HappyDent 2 -----");
        System.out.println(h2.brand + " " + h2.price + " " + h2.flavor);
        for (int i = 0; i < h2.ingredients.length; i++)
            System.out.println("Ingredient: " + h2.ingredients[i]);
        for (int i = 0; i < h2.stores.length; i++)
            System.out.println("Store: " + h2.stores[i]);
    }
}