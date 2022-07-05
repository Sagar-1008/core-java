class StadiumTester{


     public static void main(String a[]){
		 
		 Stadium std = new Stadium();
		 std.setName("Chinnaswamy Stadium");
		 std.setId("23Ag84795");
		 std.setNoOfCapacity(1000);
		 std.setLocation("Bengaluru");
		 std.setType("Cricket Stadium ");
		 System.out.println("The name of the stadium is "+std.getName()+"\n  the id is "+std.getId()+" \n the capacity of the stadium is "+std.getNoOfCapacity()+"  "+ std.getLocation() +"\n The type of the stadium is"+ std.getType());
		 std.usesOfStadium();
		 
	 }


}