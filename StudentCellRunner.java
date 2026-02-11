class StudentCellRunner {
    public static void main(String[] args) {

        Student.register("Rahul");
        Student.register("Anu", 20);

        Cell.recharge(199);
        Cell.recharge(299, "Unlimited Plan");
    }
}
