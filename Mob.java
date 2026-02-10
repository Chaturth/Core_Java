//Doctor --> treat(String name,String symptom); Nurse --> basicCheck(String patientName,String symptom,int bp,boolean sugar); Hospital--> bookAppointment(String patientName,String symptom); Reception--> book(String patientName,String symptom,String email,long mobile) Mobile --> register(String patientName,String symptom,String email,long mobile) Patient--> sick() PatientRunner Complete Feb 6 th Best Of HardWork

class Mob{
	static void register(String patientName,String symptom,String email,long mobile)
	{
		System.out.println("Register with the mobile number....");
		System.out.println("email:"+email);
		System.out.println("mobileno:"+mobile);
		Reception.book(patientName,symptom,email,mobile);
	}
}