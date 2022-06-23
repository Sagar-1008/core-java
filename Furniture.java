class Furniture{
      
	  String name;
	  int price;
	  int noOfSeatings;
	  
	  public Furniture(){
	    
	     System.out.println("The furniture object is created");
	  }
	  
	  public Furniture(String name, int price, int noOfSeatings){
	      this();
		  this.name = name;
		  this.price = price;
		  this.noOfSeatings = noOfSeatings;
	      
	  } 
	  
	  public static void main(String a[]){
		  
		  Furniture furni = new Furniture("Wooden Furniture", 25000, 3);
		  System.out.println(" the name of the furniture is "+ furni.name +" The price of the furniture is "+ furni.price +" the furniture has "+ furni.noOfSeatings + " number of the seatings");
		  
		   Furniture furni1 = new Furniture("iron Furniture", 15000, 4);
		  System.out.println("The name of the furniture is "+ furni1.name +" The price of the furniture is "+ furni1.price +" the furniture has "+ furni1.noOfSeatings + " number of the seatings");
	  }



}