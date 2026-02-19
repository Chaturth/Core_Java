class Persons {

    static void contactInfo(String name, String[] emails, long[] mobileNumbers, String address) {

        if (name == null || name.length() < 3) {
            System.out.println("Invalid Name");
            return;
        }

        if (emails == null || emails.length == 0) {
            System.out.println("Invalid Emails");
            return;
        }

        for (int i = 0; i < emails.length; i++) {
            if (emails[i] == null) {
                System.out.println("Invalid Email: " + emails[i]);
                return;
            }
        }

        if (mobileNumbers == null || mobileNumbers.length == 0) {
            System.out.println("Invalid Mobile Numbers");
            return;
        }

        for (int i = 0; i < mobileNumbers.length; i++) {
            if (mobileNumbers[i] < 1000000000L || mobileNumbers[i] > 9999999999L) {
                System.out.println("Invalid Mobile Number: " + mobileNumbers[i]);
                return;
            }
        }

        if (address == null || address.length() < 5) {
            System.out.println("Invalid Address");
            return;
        }

        System.out.println("Contact Information is valid");
        System.out.println("Name: " + name);

        System.out.println("Emails:");
        for (int i = 0; i < emails.length; i++) {
            System.out.println(emails[i]);
        }

        System.out.println("Mobile Numbers:");
        for (int i = 0; i < mobileNumbers.length; i++) {
            System.out.println(mobileNumbers[i]);
        }

        System.out.println("Address: " + address);
    }


    static void foodDish(String name, String[] ingredients) {

        if (name != null && ingredients != null) {

            System.out.println("Dish Name: " + name);
            System.out.println("Ingredients:");
            for (int i = 0; i < ingredients.length; i++) {
                System.out.println(ingredients[i]);
            }
        } else {
            System.out.println("Invalid Food Dish Details");
        }
    }


    static void laptop(String brand, String model, String[] ports, String[] countriesOfWarranty) {

        if (brand != null) {

            System.out.println("Brand: " + brand);
            System.out.println("Model: " + model);

            System.out.println("Ports:");
            for (int i = 0; i < ports.length; i++) {
                System.out.println(ports[i]);
            }

            System.out.println("Warranty Countries:");
            for (int i = 0; i < countriesOfWarranty.length; i++) {
                System.out.println(countriesOfWarranty[i]);
            }

        } else {
            System.out.println("Invalid Laptop Details");
        }
    }
}
