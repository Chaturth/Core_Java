class Doctor {
    String name;
    String specialization;
}

class Teacher {
    String name;
    String subject;
}

class PoliceOfficer {
    String name;
    String rank;
}

class Farmer {
    String name;
    String village;
}

class Actor {
    String name;
    String movie;
}

public class DoctorRunner {

    public static void main(String[] args) {

        Doctor dr1 = new Doctor();
        Doctor dr2 = new Doctor();
        Doctor dr3 = new Doctor();
        Doctor dr4 = new Doctor();
        Doctor dr5 = new Doctor();

        Teacher tr1 = new Teacher();
        Teacher tr2 = new Teacher();
        Teacher tr3 = new Teacher();
        Teacher tr4 = new Teacher();

        PoliceOfficer po1 = new PoliceOfficer();
        PoliceOfficer po2 = new PoliceOfficer();
        PoliceOfficer po3 = new PoliceOfficer();
        PoliceOfficer po4 = new PoliceOfficer();

        Farmer fa1 = new Farmer();
        Farmer fa2 = new Farmer();
        Farmer fa3 = new Farmer();
        Farmer fa4 = new Farmer();

        Actor ac1 = new Actor();
        Actor ac2 = new Actor();
        Actor ac3 = new Actor();
        Actor ac4 = new Actor();
        Actor ac5 = new Actor();

       
dr1.name = "Dr. Mehta";
 dr1.specialization = "Cardiologist";
dr2.name = "Dr. Rao";
 dr2.specialization = "Dermatologist";
dr3.name = "Dr. Singh"; 
dr3.specialization = "Orthopedic";
dr4.name = "Dr. Khan"; 

dr4.specialization = "Pediatrician";
dr5.name = "Dr. Patel"; 
dr5.specialization = "ENT";


tr1.name = "Mrs. Sharma";
 tr1.subject = "Math";
tr2.name = "Mr. Verma";
 tr2.subject = "Science";
tr3.name = "Ms. Ritu";
 tr3.subject = "English";
tr4.name = "Mr. Das";
 tr4.subject = "History";

po1.name = "Raj";
 po1.rank = "Inspector";
po2.name = "Amit"; 
po2.rank = "SI";
po3.name = "Kiran";
 po3.rank = "Constable";
po4.name = "Vikram";
 po4.rank = "DSP";

fa1.name = "Ramesh";
 fa1.village = "Mandya";
fa2.name = "Suresh";
 fa2.village = "Hassan";
fa3.name = "Mahesh"; 
fa3.village = "Mysore";
fa4.name = "Lokesh";
 fa4.village = "Tumkur";


ac1.name = "Yash";
 ac1.movie = "KGF";
ac2.name = "Darshan";
 ac2.movie = "Krantiveera";
ac3.name = "Puneeth";
 ac3.movie = "Power";
ac4.name = "Sudeep";
 ac4.movie = "Vikrant Rona";
ac5.name = "Shiva";
 ac5.movie = "Tagaru";

System.out.println(dr1.name); 
System.out.println(dr1.specialization);
 System.out.println();
System.out.println(dr2.name); 
System.out.println(dr2.specialization);
 System.out.println();
System.out.println(dr3.name);
 System.out.println(dr3.specialization); 
 System.out.println();
System.out.println(dr4.name); 
System.out.println(dr4.specialization);
 System.out.println();
System.out.println(dr5.name);
 System.out.println(dr5.specialization);
 System.out.println();


System.out.println(tr1.name);
System.out.println(tr1.subject);
 System.out.println();
System.out.println(tr2.name);
 System.out.println(tr2.subject); 
 System.out.println();
System.out.println(tr3.name); 
System.out.println(tr3.subject); 
System.out.println();
System.out.println(tr4.name);
 System.out.println(tr4.subject);
 System.out.println();


System.out.println(po1.name);
 System.out.println(po1.rank); 
 System.out.println();
System.out.println(po2.name);
 System.out.println(po2.rank);
 System.out.println();
System.out.println(po3.name);
 System.out.println(po3.rank); 
 System.out.println();
System.out.println(po4.name); 
System.out.println(po4.rank);
 System.out.println();


 
System.out.println(fa1.name);
 System.out.println(fa1.village);
 System.out.println();
System.out.println(fa2.name);
 System.out.println(fa2.village);
 System.out.println();
System.out.println(fa3.name);
 System.out.println(fa3.village);
 System.out.println();
System.out.println(fa4.name);
 System.out.println(fa4.village);
 System.out.println();


System.out.println(ac1.name);
 System.out.println(ac1.movie); 
 System.out.println();
System.out.println(ac2.name);
 System.out.println(ac2.movie);
 System.out.println();
System.out.println(ac3.name);
 System.out.println(ac3.movie);
 System.out.println();
System.out.println(ac4.name);
 System.out.println(ac4.movie); 
 System.out.println();
System.out.println(ac5.name);
 System.out.println(ac5.movie);
 System.out.println();
        
System.out.println("Updated values");	
dr1.specialization = "Neurologist";
dr2.specialization = "Surgeon";
dr3.specialization = "Physician";
dr4.specialization = "Radiologist";
dr5.specialization = "Oncologist";

tr1.subject = "Physics";
tr2.subject = "Chemistry";
tr3.subject = "Biology";
tr4.subject = "Geography";

po1.rank = "DSP";
po2.rank = "Inspector";
po3.rank = "SI";
po4.rank = "Commissioner";

fa1.village = "Hubli";
fa2.village = "Belgaum";
fa3.village = "Davangere";
fa4.village = "Shimoga";

ac1.movie = "KGF 2";
ac2.movie = "Robert";
ac3.movie = "Yuvarathnaa";
ac4.movie = "Eega";
ac5.movie = "Om";		

System.out.println(dr1.name);
System.out.println(dr1.specialization); 
System.out.println();
System.out.println(dr2.name); 
System.out.println(dr2.specialization); 
System.out.println();
System.out.println(dr3.name);
System.out.println(dr3.specialization);
System.out.println();
System.out.println(dr4.name);
System.out.println(dr4.specialization);
System.out.println();
System.out.println(dr5.name);
System.out.println(dr5.specialization);
System.out.println();

    }
}