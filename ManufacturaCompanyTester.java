class ManufacturaCompanyTester{


      public static void main(String a[]){
	  
	    TSM tsm = new TSM();
		 tsm.type = "Semiconductorer manufacture";
	     tsm.noOfEmployees = 420;
	     tsm.location= "Kengeri";
	     tsm.turnOver = "1000 Crores";
		 
		 System.out.println("The type of the company is "+tsm.type + " the no of employees are "+ tsm.noOfEmployees +" The location is "+tsm.location );
	     System.out.println("the annual turnover is "+ tsm.turnOver);
		 tsm.typeCompany();
	  
	  }





}