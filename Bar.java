class Bar{
  
     String name;
	 String address;
	 long contactNo;
	 String owner;
	 String gstNo;
	 
	 
	 public Bar(){
		 System.out.println("bar object is created");
	 }
	 
	 
	 public static void main(String a[])
	 {
		 Bar bar = new Bar();
		 bar.name = "Classic Bar and Restorant";
		 bar.address = "Vijayanagar";
		 bar.owner = "Harish";
		 bar.contactNo = 8974512365L;
		 bar.gstNo ="9854jh54125ki";
		 System.out.println("The Name of bar is "+ bar.name);l
		 System.out.println("The address of the bar is "+ bar.address);
		 System.out.println("The contact number of the bar  is "+ bar.contactNo);
		 System.out.println("The owner of the bar is "+ bar.owner);
		 System.out.println("The gst no of the bar is "+ bar.gstNo);
		 
		 Bar bar1 = new Bar();
		 bar1.name = "JetLag";
		 bar1.address = "Rajajinagar";
		 bar1.owner = "Anil";
		 bar1.contactNo = 689845120L;
		 bar1.gstNo ="Ag8457ji4565";
		 System.out.println("The Name of bar is "+ bar1.name);
		 System.out.println("The address of the bar is "+ bar1.address);
		 System.out.println("The contact number of the bar  is "+ bar1.contactNo);
		 System.out.println("The owner of the bar is "+ bar1.owner);
		 System.out.println("The gst no of the bar is "+ bar1.gstNo); 
		 
		 Bar bar2 = new Bar();
		 bar2.name = "Sherlock";
		 bar2.address = "Koramangal";
		 bar2.owner = "Manohar";
		 bar2.contactNo = 9452367845L;
		 bar2.gstNo ="fgty79896jhj";
		 System.out.println("The Name of bar is "+ bar2.name);
		 System.out.println("The address of the bar is "+ bar2.address);
		 System.out.println("The contact number of the bar  is "+ bar2.contactNo);
		 System.out.println("The owner of the bar is "+ bar2.owner);
		 System.out.println("The gst no of the bar is "+ bar2.gstNo);

		 
		 Bar bar3 = new Bar();
		 bar3.name = "Sky Deck";
		 bar3.address = "MG Road";
		 bar3.owner = "Raju";
		 bar3.contactNo = 871245693L;
		 bar3.gstNo ="4589hgju98ji";
		 System.out.println("The Name of bar is "+ bar3.name);
		 System.out.println("The address of the bar is "+ bar3.address);
		 System.out.println("The contact number of the bar  is "+ bar3.contactNo);
		 System.out.println("The owner of the bar is "+ bar3.owner);
		 System.out.println("The gst no of the bar is "+ bar3.gstNo);
		 
		 
		 
		 
	 }
	 
     

}