class Industries{
	
	int id;
	String name;
	String location;
	String type;
	
	public Industries(int id, String name, String location, String type)
	{
		System.out.println("Industry object is created");
		this.id = id;
		this.name = name;
		this.location = location;
		this.type = type;
		
	}
	
	public static void main(String a[]){
		
		Industries industry = new Industries(1234, "JSW Industry", "Bellary", "Major Industries");
		System.out.println("The id of the "+ industry.name+"  "+ industry.id +" the location of the "+ industry.name +" is "+ industry.location+" and type of the industry "+industry.type);
		System.out.println("----------------------------------------------------------------------------");
		
		Industries industry1 = new Industries(1235, "Aerol formulation", "Hubbali", "Small scale Industries");
		System.out.println("The id of the "+ industry1.name+" is "+ industry1.id +" the location of the "+ industry1.name +" is "+ industry1.location+" and type of the industry is "+industry1.type);
		System.out.println("----------------------------------------------------------------------------");
		
		Industries industry2 = new Industries(1236, "Aravinda exoports", "bengaluru", "middle scale Industries");
		System.out.println("The id of the "+ industry2.name+"  "+ industry2.id +" the location of the "+ industry2.name +" is "+ industry2.location+" and type of the industry is "+industry2.type);
		System.out.println("----------------------------------------------------------------------------");
		
		Industries industry3 = new Industries(1237, "Ultratech", "Mumbai", "Large scale Industries");
		System.out.println("The id of the "+ industry3.name+"  "+ industry3.id +" the location of the "+ industry3.name +" is "+ industry3.location+" and type of the industry is "+industry3.type);
		
	}
	

	
	

}