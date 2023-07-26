public class Patient{
	
	/* 5 Rules of encapsulation
	
	1) public class
	2) default Contructor
	3) made as varibale/fields/members to "private";
    4) public getter and setter
	5) oops   
	
	*/
	
	private int patientId;
	private String patientName;
	private int age;
	private String bloodGroup;
	private String docTorName;
	private String diseaseName;
	private String address;
	private String gender;
	private long contactNo;
	private int wardNo;
	private String attederName;
	private String consultant;
	private double fees;
	
	
	public void setPatientId(int patientId){
		
		this.patientId =patientId;
		
	}
	
	
	public int getPatientId(){
		return patientId;
		
	}
	
	public void setPatientName(String patientName){
		this.patientName = patientName;
	}
	
	public String getPatientName(){
		
		return patientName;
	}
	
	public void setAge(int age){
		
		this.age = age;
	}
	
	public int getAge(){
		
		return age;
	}
	
	public void setBloodGroup(String bloodGroup){
		
		this.bloodGroup = bloodGroup;
		
	}
	
	public String getBloodGroup(){
		
		return bloodGroup;
	}
	
	public void setDocTorName(String docTorName){
		
		this.docTorName = docTorName;
	}
	
	public String getDocTorName(){
		
		return docTorName;
	}
	
	public void setDiseaseName(String diseaseName){
		
		this.diseaseName = diseaseName;
	
	}
	
	public String getDiseaseName(){
		
		return diseaseName;
	}
	
	public void setAddress(String address){
		
		this.address = address;
	}
	
	public String getAddress(){
		
		return address;
	}
	
	public void setGender(String gender){
		
		this.gender = gender;
	}
	
	public String getGender(){
		
		return gender;
		
	}
	
	public void setContactNo(long contactNo){
		
		this.contactNo = contactNo;
	}
	
	public long getContactNo(){
		
		return contactNo;
		
	}
	
	public void setWardNo(int wardNo){
		
		this.wardNo = wardNo;
	}
	
	public int getWardNo(){
		
		return wardNo;
		
	}
	
	
	public void setAttederName(String attederName){
		
		this.attederName = attederName;
	}
	
	public String getAttederName(){
		
		return attederName;
		
	}
	
	public void setConsultant(String consultant){
		
		this.consultant = consultant;
	}
	
	public String getConsultant(){
		
		return consultant;
		
	}
	
	public void setFees(double fees){
		
		this.fees = fees;
	}
	
	public double getFees(){
		
		return fees;
		
	}

  

}