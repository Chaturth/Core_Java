//YourClass 5 classes with over-loaded method , invoke all the overload methods in Runner

class Appointment{
	

	static void book(String patientName)
	{
		if(patientName==null){
		System.out.println("patientName is null");
		return;
		}
		System.out.println("the patient name is:"+patientName);
		
	}
	static void book(String patientName,int bookingNo)
	{
		if(bookingNo<=0)
		{
			System.out.println("the appointment is invalid");
			return;
		}
		System.out.println("the appointment is valid:"+bookingNo);
	}
}

		
			