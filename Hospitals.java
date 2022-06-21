class Hospitals{
  
     String name;
	 String address;
	 int noOfdoctors;
	 long contactNo;
	 String owner;
	
	 
	 public Hospitals(){
		 System.out.println("Hospital object is created");
	 }
	 
	 
	 public static void main(String a[])
	 {
		 Hospitals hospital = new Hospitals();
		 hospital.name = "Apollo";
		 hospital.address = "Shesadripuram";
		 hospital.owner = "Prathap C Reddy";
		 hospital.contactNo = 9079079025L;
		 hospital.noOfdoctors = 12;
		 System.out.println("The Name of Hospital is "+ hospital.name);
		 System.out.println("The address of the hospital is "+ hospital.address);
		 System.out.println("The contact number of the hospital  is "+ hospital.contactNo);
		 System.out.println("The owner of the hospital is "+ hospital.owner);
		 System.out.println("The number of doctors presents in the hospital is "+ hospital.noOfdoctors);
		 
		 Hospitals hospital1 = new Hospitals();
		 hospital1.name = "Manipal";
		 hospital1.address = "Malleswaram";
		 hospital1.owner = "Ranjan Pai";
		 hospital1.contactNo = 8745632591L;
		 hospital1.noOfdoctors = 25;
		 System.out.println("The Name of Hospital is "+ hospital1.name);
		 System.out.println("The address of the hospital is "+ hospital1.address);
		 System.out.println("The contact number of the hospital is "+ hospital1.contactNo);
		 System.out.println("The owner of the hospital is "+ hospital1.owner);
		 System.out.println("The number of doctors presents in the hospital is "+ hospital1.noOfdoctors);
		 
		 Hospitals hospital2 = new Hospitals();
		 hospital2.name = "Forties";
		 hospital2.address = "Rajajinagar";
		 hospital2.owner = "Shivinder Mohan singh";
		 hospital2.contactNo = 9874563214L;
		 hospital2.noOfdoctors = 15;
		 System.out.println("The Name of Hospital is "+ hospital2.name);
		 System.out.println("The address of the hospital is  "+ hospital2.address);
		 System.out.println("The contact number of the hospital  is "+ hospital2.contactNo);
		 System.out.println("The owner of the hospital is "+ hospital2.owner);
		 System.out.println("The number of doctors presents in the hospital is "+ hospital2.noOfdoctors);
		 
		 Hospitals hospital3 = new Hospitals();
		 hospital3.name = "Aster";
		 hospital3.address = "Yelahanka";
		 hospital3.owner = "Azad Moopen";
		 hospital3.contactNo = 784529658L;
		 hospital3.noOfdoctors = 18;
		 System.out.println("The Name of Hospital is "+ hospital3.name);
		 System.out.println("The Origin of the mobile "+ hospital3.address);
		 System.out.println("The contact number of the mobile showroom is "+ hospital3.contactNo);
		 System.out.println("The owner of the Mobile is "+ hospital3.owner);
		 System.out.println("The number of doctors presents in the hospital is "+ hospital3.noOfdoctors);
		 
		 
		 
		 
		 
		 
	 }
	 
 

}