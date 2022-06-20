class ShowRoom1{

    int showRoomId;
	static String name ;
	long contactNo;
	static int noOfBranches = 56;
	String location;
	
	//Parameterised Constructor
	public ShowRoom1(int id, long cNo, String loc, String nm){
		
		System.out.println("ShowRoom object created");
		showRoomId = id;
		contactNo = cNo;
		location = loc;
		name = nm;
		
	}
	
	
	
    //main method ---------- Starting point
    public static void main(String[] a)
	{
		//Constructor are used to initilize the instance variable of the class
	     ShowRoom1 show = new ShowRoom1(1, 4589612358L, "Vijayanagara","Puma");
		 /*show.showRoomId = 1;
		 show.contactNo = 4589612358L;
		 show.location = "Vijayanagara";*/
		 System.out.println("The show room id is "+show.showRoomId );
		 System.out.println("The name of the showroom is "+ show.name);
		 System.out.println("the contact number of "+ name + show.contactNo);
		 System.out.println("The no of branches of the showroom "+ ShowRoom1.noOfBranches);
		 System.out.println("The location of the puma showroom is "+ show.location);
		 
		 
		 ShowRoom1 show1 = new ShowRoom1(2, 4589612359L, "Commercial Street","Puma");
		 /*show1.showRoomId = 2;
		 show1.contactNo = 4589612359L;
		 show1.location = "Commercial Street";*/
		 System.out.println("The show room id is "+show1.showRoomId );
		 System.out.println("The name of the showroom is "+ show.name);
		 System.out.println("the contact number of "+ name + show1.contactNo);
		 System.out.println("The no of branches of the showroom "+ noOfBranches);
		 System.out.println("The location of the puma showroom is "+ show1.location);
		 
		 
		 
	
	
	
	}




}