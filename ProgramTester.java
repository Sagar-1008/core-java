class ProgramTester{
   
     public static void main(String a[])
	 {
	    Java java = new Java();
	     java.founder = "James Golsang";
		 java.yearOfOrigin  = 1995;
		 java.type = "Platform Dependent";
		 java.ownedBy = "Oracle";
		 java.programUse();
		 System.out.println(java.founder +"  "+ java.yearOfOrigin +"  "+ java.type+ "  "+ java.ownedBy);
	 
	 
	 }


}