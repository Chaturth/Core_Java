//Doctor --> treat(String name,String symptom); Nurse --> basicCheck(String patientName,String symptom,int bp,boolean sugar); Hospital--> bookAppointment(String patientName,String symptom); Reception--> book(String patientName,String symptom,String email,long mobile) Mobile --> register(String patientName,String symptom,String email,long mobile) Patient--> sick() PatientRunner Complete Feb 6 th Best Of HardWork

class Reception{
	static void book(String patientName,String symptom,String email,long mobile)
	{
		System.out.println("check appointment in the reception");
		System.out.println("email:"+email);
		System.out.println("mobileno:"+mobile);
		Hospital.bookAppointment(patientName,symptom);
	}
}