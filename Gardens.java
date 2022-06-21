class Gardens{


     int id;
	 String name;
	 String type;
	 int noOfVisitors;
	 
	 public Gardens(int id, String name, String type, int noOfVisitors )
	 {
	     System.out.println("The garden object is created");
		 this.id = id;
		 this.name = name;
		 this.type = type;
		 this.noOfVisitors = noOfVisitors;
		 
	 }
	 
	 public static void main(String a[])
	 {
	     Gardens garden = new Gardens(35812, "Cubbon Park", "Roaming Garden", 150);
		 System.out.println("The id of the "+ garden.name +" is "+ garden.id + " The type of garden is "+ garden.type + " The number of visitors are  "+ garden.noOfVisitors);
		 System.out.println("------------------------------------------------------------------------------------------");
		 
		 Gardens garden1 = new Gardens(35814, "Lal Bagh", "Botinical Garden", 300);
		 System.out.println("The id of the "+ garden1.name +" is "+ garden1.id + " The type of garden is "+ garden1.type + " The number of visitors are  "+ garden1.noOfVisitors);
		 
		 Gardens garden3 = new Gardens(35815, "Tb Dam Garden", "Entaertainment Garden", 300);
		 System.out.println("The id of the "+ garden3.name +" is "+ garden3.id + " The type of garden is "+ garden3.type + " The number of visitors are  "+ garden3.noOfVisitors);
		 
	 }
	 
	 



}