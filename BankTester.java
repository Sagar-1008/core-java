class BankTester{


    public static void main(String a[]){
	
	  SBI sbi = new SBI();
	  sbi.type = "Public Sector Bank";
	  sbi.heasQuarter = "Mumbai";
	  sbi.noOfEmployees = 245000;
	  System.out.println(" the type of the sbi bank is "+ sbi.type+" and headquarte is located at "+sbi.heasQuarter+" and no of employeesd are "+sbi.noOfEmployees);
	  sbi.useOfBank();
	
	}


}