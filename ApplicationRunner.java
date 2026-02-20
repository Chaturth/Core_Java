class Student {
    String name;
    int age;
    String course;
    double marks;
}

class Car {
    String brand;
    String model;
    int year;
    double price;
}

class Employee {
    String name;
    int id;
    String department;
    double salary;
}

class Book {
    String title;
    String author;
    int pages;
    double cost;
}

class Mobile {
    String brand;
    String model;
    int storage;
    double price;
}

public class ApplicationRunner {

    public static void main(String[] args) {

      

        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        Student s4 = new Student();
        Student s5 = new Student();

        Car c1 = new Car();
        Car c2 = new Car();
        Car c3 = new Car();
        Car c4 = new Car();
        Car c5 = new Car();

        Employee e1 = new Employee();
        Employee e2 = new Employee();
        Employee e3 = new Employee();
        Employee e4 = new Employee();
        Employee e5 = new Employee();

        Book b1 = new Book();
        Book b2 = new Book();
        Book b3 = new Book();
        Book b4 = new Book();
        Book b5 = new Book();

        Mobile m1 = new Mobile();
        Mobile m2 = new Mobile();
        Mobile m3 = new Mobile();
        Mobile m4 = new Mobile();
        Mobile m5 = new Mobile();

        s1.name="Arun"; s1.age=20; s1.course="BE"; s1.marks=85;
        s2.name="Riya"; s2.age=21; s2.course="BBA"; s2.marks=90;
        s3.name="Kiran"; s3.age=19; s3.course="BSc"; s3.marks=78;
        s4.name="Meena"; s4.age=22; s4.course="BA"; s4.marks=88;
        s5.name="Vijay"; s5.age=23; s5.course="BCom"; s5.marks=92;

        c1.brand="Toyota"; c1.model="Innova"; c1.year=2020; c1.price=2000000;
        c2.brand="Honda"; c2.model="City"; c2.year=2019; c2.price=1500000;
        c3.brand="BMW"; c3.model="X5"; c3.year=2021; c3.price=7500000;
        c4.brand="Audi"; c4.model="A4"; c4.year=2018; c4.price=4000000;
        c5.brand="Hyundai"; c5.model="i20"; c5.year=2022; c5.price=900000;

        e1.name="Rahul"; e1.id=101; e1.department="HR"; e1.salary=40000;
        e2.name="Sneha"; e2.id=102; e2.department="IT"; e2.salary=60000;
        e3.name="Amit"; e3.id=103; e3.department="Finance"; e3.salary=55000;
        e4.name="Pooja"; e4.id=104; e4.department="Marketing"; e4.salary=45000;
        e5.name="Rohan"; e5.id=105; e5.department="Admin"; e5.salary=38000;

        b1.title="Java Basics"; b1.author="James"; b1.pages=300; b1.cost=500;
        b2.title="Python Guide"; b2.author="Guido"; b2.pages=350; b2.cost=600;
        b3.title="C++ Master"; b3.author="Bjarne"; b3.pages=400; b3.cost=700;
        b4.title="HTML & CSS"; b4.author="John"; b4.pages=250; b4.cost=450;
        b5.title="Data Science"; b5.author="Andrew"; b5.pages=500; b5.cost=900;

        m1.brand="Samsung"; m1.model="S23"; m1.storage=128; m1.price=70000;
        m2.brand="Apple"; m2.model="iPhone 14"; m2.storage=256; m2.price=90000;
        m3.brand="OnePlus"; m3.model="11R"; m3.storage=128; m3.price=45000;
        m4.brand="Vivo"; m4.model="V27"; m4.storage=128; m4.price=30000;
        m5.brand="Realme"; m5.model="GT"; m5.storage=256; m5.price=35000;


      
System.out.println(s1.name+" "+s1.age+" "+s1.course+" "+s1.marks);
System.out.println(s2.name+" "+s2.age+" "+s2.course+" "+s2.marks);
System.out.println(s3.name+" "+s3.age+" "+s3.course+" "+s3.marks);
System.out.println(s4.name+" "+s4.age+" "+s4.course+" "+s4.marks);
System.out.println(s5.name+" "+s5.age+" "+s5.course+" "+s5.marks);
System.out.println();

System.out.println(c1.brand+" "+c1.model+" "+c1.year+" "+c1.price);
System.out.println(c2.brand+" "+c2.model+" "+c2.year+" "+c2.price);
System.out.println(c3.brand+" "+c3.model+" "+c3.year+" "+c3.price);
System.out.println(c4.brand+" "+c4.model+" "+c4.year+" "+c4.price);
System.out.println(c5.brand+" "+c5.model+" "+c5.year+" "+c5.price);
System.out.println();

System.out.println(e1.name+" "+e1.id+" "+e1.department+" "+e1.salary);
System.out.println(e2.name+" "+e2.id+" "+e2.department+" "+e2.salary);
System.out.println(e3.name+" "+e3.id+" "+e3.department+" "+e3.salary);
System.out.println(e4.name+" "+e4.id+" "+e4.department+" "+e4.salary);
System.out.println(e5.name+" "+e5.id+" "+e5.department+" "+e5.salary);
System.out.println();

System.out.println(b1.title+" "+b1.author+" "+b1.pages+" "+b1.cost);
System.out.println(b2.title+" "+b2.author+" "+b2.pages+" "+b2.cost);
System.out.println(b3.title+" "+b3.author+" "+b3.pages+" "+b3.cost);
System.out.println(b4.title+" "+b4.author+" "+b4.pages+" "+b4.cost);
System.out.println(b5.title+" "+b5.author+" "+b5.pages+" "+b5.cost);
System.out.println();

System.out.println(m1.brand+" "+m1.model+" "+m1.storage+" "+m1.price);
System.out.println(m2.brand+" "+m2.model+" "+m2.storage+" "+m2.price);
System.out.println(m3.brand+" "+m3.model+" "+m3.storage+" "+m3.price);
System.out.println(m4.brand+" "+m4.model+" "+m4.storage+" "+m4.price);
System.out.println(m5.brand+" "+m5.model+" "+m5.storage+" "+m5.price);

        s1.name=" Arun"; s1.age=25; s1.course="MCA"; s1.marks=95;
        c1.brand=" Toyota"; c1.model="Fortuner"; c1.year=2023; c1.price=3500000;
        e1.name=" Rahul"; e1.id=201; e1.department="Management"; e1.salary=80000;
        b1.title=" Java"; b1.author="Oracle"; b1.pages=600; b1.cost=1200;
        m1.brand=" Samsung"; m1.model="S24"; m1.storage=512; m1.price=120000;

       System.out.println(s1.name+" "+s1.age+" "+s1.course+" "+s1.marks);
        System.out.println(c1.brand+" "+c1.model+" "+c1.year+" "+c1.price);
        System.out.println(e1.name+" "+e1.id+" "+e1.department+" "+e1.salary);
        System.out.println(b1.title+" "+b1.author+" "+b1.pages+" "+b1.cost);
        System.out.println(m1.brand+" "+m1.model+" "+m1.storage+" "+m1.price);
    }
}