public class DoctorRnner {

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

        tr1.name = "Mrs. Sharma";
        tr1.subject = "Mathematics";

        po1.name = "Inspector Raj";
        po1.rank = "Inspector";

        fa1.name = "Ramesh";
        fa1.village = "Mandya";

        ac1.name = "Yash";
        ac1.movie = "KGF";

        
        System.out.println(dr1.name + " " + dr1.specialization);
        System.out.println(tr1.name + " " + tr1.subject);
        System.out.println(po1.name + " " + po1.rank);
        System.out.println(fa1.name + " " + fa1.village);
        System.out.println(ac1.name + " " + ac1.movie);

      
        dr1.specialization = "Neurologist";
        ac1.movie = "KGF 2";

        System.out.println("Updated Specialization: " + dr1.specialization);
        System.out.println("Updated Movie: " + ac1.movie);
    }
}