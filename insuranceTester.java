class InsuranceTester{


      public static void main(String a[])
	  {
	  
	      LIC lic =  new LIC();
		  lic.noOfUsers = 50000;
	      lic.policyAmount = 298;
	      lic.returnYear   = 7;
           System.out.println(" The no of the users in the bangalore is "+ lic.noOfUsers+" The minimum policy of the Lic is "+lic.policyAmount+" The return year is "+ lic.returnYear);		  
	  
	  
	  }


}