class PetrolBunk{

       int id;
	   String name;
	   String gstNo;
	   static double dieselPrice = 87.89;
	   static double petrolPrice = 101.45;
	   
	   public PetrolBunk(int id, String name, String gstNo){
		   
		   System.out.println("The PetrolBunk object is created");
		   this.id = id;
		   this.name = name;
		   this.gstNo = gstNo;
	   }
	   
	   public static void main(String a[]) {
		   
		   PetrolBunk petro  = new PetrolBunk(12456, "Bharat Petroleaum","9AG235TY");
		   System.out.println("The id and Name of the petrol bunk is "+ petro.id +"  "+ petro.name+" The gst no of "+petro.name+" is "+ petro.gstNo);
		   System.out.println("The petrol and diesel price is "+ petrolPrice +","+ dieselPrice+" respectively");
		   System.out.println("============================================================================");
		   
		   PetrolBunk petro1  = new PetrolBunk(12457, "reliance Petroleaum","54hgdf125");
		   System.out.println("The id and Name of the petrol bunk is "+ petro1.id +"  "+ petro1.name+" The gst no of "+petro1.name+" is "+ petro1.gstNo);
		   System.out.println("The petrol and diesel price is "+ petrolPrice +"  "+ dieselPrice+" respectively");
		   System.out.println("============================================================================");
		   
		   PetrolBunk petro2  = new PetrolBunk(12458, "Bharat Petroleaum","458jsh126");
		   System.out.println("The id and Name of the petrol bunk is "+ petro2.id +"  "+ petro2.name+" The gst no of "+petro2.name+" is "+ petro2 .gstNo);
		   System.out.println("The petrol and diesel price is "+ petrolPrice +" " + dieselPrice+" respectively");
		   System.out.println("============================================================================");
		   
		   PetrolBunk petro3  = new PetrolBunk(12459, "mandovi Petroleaum","8ay125jddfhf");
		   System.out.println("The id and Name of the petrol bunk is "+ petro3.id +"  "+ petro3.name+" The gst no of "+petro3.name+" is "+ petro3.gstNo);
		   System.out.println("The petrol and diesel price is "+ petrolPrice +"  "+ dieselPrice+" respectively");
		   
	   }

}