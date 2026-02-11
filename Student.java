class Student {

    static void register(String studentName) {
        if (studentName != null) {
            System.out.println("Student registered: " + studentName);
        }
    }

    static void register(String studentName, int studentAge) {
        if (studentAge > 0) {
            System.out.println("Student registered: " + studentName + " Age: " + studentAge);
        }
    }
}

