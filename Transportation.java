class Transportation{
    
	int id;
	String name;
	String mode;
	long helplineNo;
	static String location = "Majestic";
	
	public Transportation(int id, String name, String mode, long helplineNo)
	{
	   System.out.println("The transportaion object created");
	   this.id = id;
	   this.name =  name;
	   this.mode =  mode;
	   this.helplineNo = helplineNo;
	
	
	}
	
	public static void main(String a[])
	{
	     Transportation trans = new Transportation(12, "Metro", "Roadways",8971254698L);
		 System.out.println("The name of the transportation "+ trans.name+" The id no is "+ trans.id  );
		 System.out.println("The mode of the transportation is "+ trans.mode);
		 System.out.println("the helpline number is "+ trans.helplineNo);
		 System.out.println("The location of the "+ trans.name + Transportation.location);
		 
		 Transportation trans1 = new Transportation(13, "Bus","RoadWays",9561234587L);
		 System.out.println("The name of the transportation "+ trans1.name+" The id no is "+ trans1.id );
		 System.out.println("The mode of the transportation is "+ trans1.mode);
		 System.out.println("the helpline number is "+ trans1.helplineNo);
		 System.out.println("The location of the "+ trans1.name + Transportation.location);
		 
		 Transportation trans2 = new Transportation(14, "Ship", "waterways", 45871236525L);
		 System.out.println("the name of the transportation is "+ trans2.name +" The id of the transportation is "+ trans2.id+ " the mode of the transportation is "+ trans2.mode);
		 System.out.println("The helpline no is "+ trans2.helplineNo+" The location is "+location);
		 
		 Transportation trans3 = new Transportation(15, "Railway", "roadways", 8457123659L);
		 System.out.println("the name of the transportation is "+ trans3.name +" The id of the transportation is "+ trans3.id+ " the mode of the transportation is "+ trans3.mode);
		 System.out.println("The helpline no is "+ trans3.helplineNo+" The location is "+location);
	
	
	}

}