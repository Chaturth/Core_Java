class PersonsRunner {

    public static void main(String[]  args) {

        String[] emails = {"www@gmail.com", "yyy@gmail.com"};
        long[] numbers = {9876543210L, 9123456789L};

        Persons.contactInfo("Ravi", emails, numbers, "Mysore");

        String[] ingredients = {"Rice", "Dal", "Salt"};
        Persons.foodDish("Khichdi", ingredients);

        String[] ports = {"USB", "HDMI"};
        String[] countries = {"India", "USA"};

        Persons.laptop("HP", "Pavilion", ports, countries);
    }
}

