//Doctor --> treat(String name,String symptom); Nurse --> basicCheck(String patientName,String symptom,int bp,boolean sugar); Hospital--> bookAppointment(String patientName,String symptom); Reception--> book(String patientName,String symptom,String email,long mobile) Mobile --> register(String patientName,String symptom,String email,long mobile) Patient--> sick() PatientRunner Complete Feb 6 th Best Of HardWork

class Patient{
	static void sick()
	{
		String patientName="lokesh";
		String symptom="fever";
		String email="lokesh@gmil.com";
		long mobile=1236547890L;
		System.out.println(" yes this person have sickness");
		Mob.register(patientName, symptom, email, mobile);
	}
}


		