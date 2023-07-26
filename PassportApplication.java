class PassportApplication {
	
    private String applicantName;
    private String applicantDOB;
    private String applicantNationality;
    private String applicantGender;
    private String passportType;
    private String issuingCountry;
    private String occupation;
	private String marriageStatus;
    private String proofOfAddress;
    private String  noOfPages;
	private String applicationDate;

   
    public String getApplicantName() {
        return applicantName;
    }

    public void setApplicantName(String applicantName) {
        this.applicantName = applicantName;
    }

    public String getProofOfAddress() {
        return proofOfAddress;
    }

    public void setProofOfAddress(String proofOfAddress) {
        this.proofOfAddress = proofOfAddress;
    }

    public String getApplicantDOB() {
        return applicantDOB;
    }

    public void setApplicantDOB(String applicantDOB) {
        this.applicantDOB = applicantDOB;
    }

    public String getApplicantNationality() {
        return applicantNationality;
    }

    public void setApplicantNationality(String applicantNationality) {
        this.applicantNationality = applicantNationality;
    }

    public String getApplicantGender() {
        return applicantGender;
    }

    public void setApplicantGender(String applicantGender) {
        this.applicantGender = applicantGender;
    }

    public String getPassportType() {
        return passportType;
    }

    public void setPassportType(String passportType) {
        this.passportType = passportType;
    }

    public String getIssuingCountry() {
        return issuingCountry;
    }

    public void setIssuingCountry(String issuingCountry) {
        this.issuingCountry = issuingCountry;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getApplicationDate() {
        return applicationDate;
    }

    public void setApplicationDate(String applicationDate) {
        this.applicationDate = applicationDate;
    }

    public void setNoOfPages(String noOfPages) {
        this.noOfPages = noOfPages;
    }
	
	public String getNoOfPages(){
		return noOfPages;
	}
}
