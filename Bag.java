class Bag{
       String name;
	   int price;
	   String type;
	   
	   public Bag(){
	   this("WildCraft", 1500, "Duffle bag");
	   
	   System.out.println("The bag object is created");}
	   
	   public Bag(String name, int price, String type)
	   {
	      
	      this.name = name;
		  this.price = price;
		  this.type = type;
	   }
	   
	   public static void main(String a[]){
	   
	     Bag bag = new Bag();
		 System.out.println("The brand name of the bag is "+bag.name +" The price of the bag is "+bag.price+" type os the bag "+ bag.type);
		 
		 Bag bag1 = new Bag();
		 System.out.println("The brand name of the bag is "+bag1.name +" The price of the bag is "+bag1.price+" type os the bag "+ bag1.type);
	   
	   }

}
// how to create the another object with different arguments