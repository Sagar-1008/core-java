class Clothes{

  static String name = "Mens Clothing";
          String type;
		  int price;
		  
		  public Clothes(){
			  System.out.println("The Clothes object is created");
		  }
		  
		  public Clothes(String type, int price){
			  this();
			  this. type = type;
			  this.price = price;
		  }
   
         public static void main(String a[]) {
			 
			 Clothes clothes = new Clothes("Hoodie", 499);
				 System.out.println("The clothes are "+ Clothes.name +" The type of the clothes are "+ clothes.type +" The price of the clothes "+ clothes.price );
				 
			     Clothes clothes1 = new Clothes("Shirts", 799);
				 System.out.println("The clothes are "+ Clothes.name +" The type of the clothes are "+ clothes1.type +" The price of the clothes "+ clothes1.price );
		 }

}