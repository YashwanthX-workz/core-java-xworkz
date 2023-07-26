class PatientTester{
	
	public static void main(String pa[]){
		
		
		Patient patient = new Patient();
		
		patient.setPatientId(123);
		patient.setPatientName("Lenova");
		patient.setAge(30);
		patient.setBloodGroup("O+");
		patient.setDocTorName("YASHWANTH");
		patient.setDiseaseName("Corona");
		patient.setAddress("Banglore");
		patient.setGender("male");
		patient.setContactNo(9844978744l);
		patient.setWardNo(101);
		patient.setAttederName("Rachappa");
		patient.setConsultant("");
		patient.setFees(1000);
		
		
		System.out.println(patient.getPatientId());
		System.out.println(patient.getPatientName());
		System.out.println(patient.getAge());
		System.out.println(patient.getBloodGroup());
		System.out.println(patient.getDocTorName());
		System.out.println(patient.getDiseaseName());
		System.out.println(patient.getAddress());
		System.out.println(patient.getGender());
		System.out.println(patient.getContactNo());
		System.out.println(patient.getWardNo());
		System.out.println(patient.getAttederName());
		System.out.println(patient.getFees());
		
	}

}