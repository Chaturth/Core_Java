class StackOverflow {
    static void display() {
        System.out.println("Java");
        display();
    }

    public static void main(String[] args) {
        display();
    }
}