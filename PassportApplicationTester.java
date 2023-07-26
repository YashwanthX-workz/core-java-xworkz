public class PassportApplicationTester {
	
    public static void main(String proof[]) {
       
        PassportApplication application = new PassportApplication();

   
        application.setApplicantName("Yashwanth");
        application.setProofOfAddress("Addhar");
        application.setApplicantDOB("11-05-2000");
        application.setApplicantNationality("Indian");
        application.setApplicantGender("Male");
        application.setPassportType("Regular");
        application.setIssuingCountry("America");
        application.setOccupation("Engineer");
        application.setApplicationDate("2023-07-25");
        application.setNoOfPages("36");

        
        System.out.println("Applicant Name: " + application.getApplicantName());
        System.out.println("Applicant Address Proof : " + application.getProofOfAddress());
        System.out.println("Applicant Date of Birth: " + application.getApplicantDOB());
        System.out.println("Applicant Nationality: " + application.getApplicantNationality());
        System.out.println("Applicant Gender: " + application.getApplicantGender());
        System.out.println("Passport Type: " + application.getPassportType());
        System.out.println("Issuing Country: " + application.getIssuingCountry());
        System.out.println("Occupation: " + application.getOccupation());
        System.out.println("Application Date: " + application.getApplicationDate());
        System.out.println("Number of Pages: " + application.getNoOfPages());
		System.out.println("******************************");
		System.out.println("******************************");
		
		  PassportApplication application1 = new PassportApplication();
		
		application1.setApplicantName("Yash");
        application1.setProofOfAddress("PanCard");
        application1.setApplicantDOB("11-05-2000");
        application1.setApplicantNationality("Indian");
        application1.setApplicantGender("Male");
        application1.setPassportType("Fresh");
        application1.setIssuingCountry("America");
        application1.setOccupation("Engineer");
        application1.setApplicationDate("2023-07-25");
        application1.setNoOfPages("72");

        
        System.out.println("Applicant Name: " + application1.getApplicantName());
        System.out.println("Applicant Address Proof: " + application1.getProofOfAddress());
        System.out.println("Applicant Date of Birth: " + application1.getApplicantDOB());
        System.out.println("Applicant Nationality: " + application1.getApplicantNationality());
        System.out.println("Applicant Gender: " + application1.getApplicantGender());
        System.out.println("Passport Type: " + application1.getPassportType());
        System.out.println("Issuing Country: " + application1.getIssuingCountry());
        System.out.println("Occupation: " + application1.getOccupation());
        System.out.println("Application Date: " + application1.getApplicationDate());
        System.out.println("Number Of Pages: " + application1.getNoOfPages());
		
		System.out.println("******************************");
		System.out.println("******************************");
		
		
		 PassportApplication application2 = new PassportApplication();

   
        application2.setApplicantName("Rachappa");
        application2.setProofOfAddress("Birth Cirtificate");
        application2.setApplicantDOB("20-05-2000");
        application2.setApplicantNationality("Pakisthan");
        application2.setApplicantGender("Male");
        application2.setPassportType("Renewal");
        application2.setIssuingCountry("Canada");
        application2.setOccupation("Engineer");
        application2.setApplicationDate("2022-06-02");
        application2.setNoOfPages("36");

        
        System.out.println("Applicant Name: " + application2.getApplicantName());
        System.out.println("Applicant Address Proof : " + application2.getProofOfAddress());
        System.out.println("Applicant Date of Birth: " + application2.getApplicantDOB());
        System.out.println("Applicant Nationality: " + application2.getApplicantNationality());
        System.out.println("Applicant Gender: " + application2.getApplicantGender());
        System.out.println("Passport Type: " + application2.getPassportType());
        System.out.println("Issuing Country: " + application2.getIssuingCountry());
        System.out.println("Occupation: " + application2.getOccupation());
        System.out.println("Application Date: " + application2.getApplicationDate());
        System.out.println("Number of Pages: " + application2.getNoOfPages());
		
    }
}
