class TestingToolTester{
   
     public static void main(String a[])
	 {
	    Selenium selenium = new Selenium();
	     selenium.founder = "Jason Huggins";
		 selenium.yearOfOrigin  = 2004;
		 selenium.ownedBy = "Thought Works";
		 selenium.programUse();
		 System.out.println(selenium.founder +"  "+ selenium.yearOfOrigin + "  "+ selenium.ownedBy);
	 
	 
	 }


}