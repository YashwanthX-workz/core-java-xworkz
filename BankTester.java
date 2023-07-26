class BankTester {

    public static void main(String[] args) {
       
        Bank bank = new Bank();

       
        bank.setBankId(678);
        bank.setBankName("Canara Bank");
        bank.setBranch("Nayanahalli ");
        bank.setBranchName("Ajjawraa Branch");
        bank.setAddress("Ajjawara gate chikkaballapur");
        bank.setBranchManager("Yaahwanth");
        bank.setIfscCode("CNRB000447");
        bank.setMicrCode("123CNRB");
        bank.setNoOfLockers(100);
        bank.setNoOfEmployees(10);
        bank.setTiming("10:00 AM to 5:00 PM");
        bank.setWebsiteDetails("www.canarabank.com");
        bank.setHelplineNo("800-123-4567");
		
		
        
        System.out.println("Bank ID: " + bank.getBankId());
        System.out.println("Bank Name: " + bank.getBankName());
        System.out.println("Branch: " + bank.getBranch());
        System.out.println("Branch Name: " + bank.getBranchName());
        System.out.println("Address: " + bank.getAddress());
        System.out.println("Branch Manager: " + bank.getBranchManager());
        System.out.println("IFSC Code: " + bank.getIfscCode());
        System.out.println("MICR Code: " + bank.getMicrCode());
        System.out.println("Number of Lockers: " + bank.getNoOfLockers());
        System.out.println("Number of Employees: " + bank.getNoOfEmployees());
        System.out.println("Timing: " + bank.getTiming());
        System.out.println("Website: " + bank.getWebsiteDetails());
        System.out.println("Helpline Number: " + bank.getHelplineNo());
		
		System.out.println("***************************************");
		System.out.println("***************************************");
		
		
        Bank bank1 = new Bank();
		
		bank1.setBankId(546);
        bank1.setBankName("Dena Bank");
        bank1.setBranch("Ajjawara ");
        bank1.setBranchName("Patrenahalli Branch");
        bank1.setAddress("chikkaballapur");
        bank1.setBranchManager("Yaahwanth");
        bank1.setIfscCode("DENA07987");
        bank1.setMicrCode("16CDNB");
        bank1.setNoOfLockers(150);
        bank1.setNoOfEmployees(20);
        bank1.setTiming("10:00 AM to 5:00 PM");
        bank1.setWebsiteDetails("www.denabank.com");
        bank1.setHelplineNo("900-193-3867");
		
		
        
        System.out.println("Bank ID: " + bank1.getBankId());
        System.out.println("Bank Name: " + bank1.getBankName());
        System.out.println("Branch: " + bank1.getBranch());
        System.out.println("Branch Name: " + bank1.getBranchName());
        System.out.println("Address: " + bank1.getAddress());
        System.out.println("Branch Manager: " + bank1.getBranchManager());
        System.out.println("IFSC Code: " + bank1.getIfscCode());
        System.out.println("MICR Code: " + bank1.getMicrCode());
        System.out.println("Number of Lockers: " + bank1.getNoOfLockers());
        System.out.println("Number of Employees: " + bank1.getNoOfEmployees());
        System.out.println("Timing: " + bank1.getTiming());
        System.out.println("Website: " + bank1.getWebsiteDetails());
        System.out.println("Helpline Number: " + bank1.getHelplineNo());
		
		System.out.println("***************************************");
		System.out.println("***************************************");
    }
}
