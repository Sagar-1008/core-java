class Shoe{
  
  //states/variable/properties/fields
     String name;
	 int price;
	 int size;
	 String colour;
	 String type;
	 
	 public Shoe(){
		 System.out.println("Shoe object is created");
	 }
	 
	 
	 public static void main(String a[])
	 {
		 Shoe shoe = new Shoe();
		 shoe.name = "adidas";
		 shoe.price = 2879;
		 shoe.colour = "Grey";
		 shoe.size = 10;
		 shoe.type = "Sneaker";
		 System.out.println("The Name of shoe is "+ shoe.name);
		 System.out.println("The price of the shoe is "+ shoe.price);
		 System.out.println("The Colour of the shoe is "+ shoe.colour);
		 System.out.println("The size of the shoe "+ shoe.size);
		 System.out.println("The types of shoe "+ shoe.type);
		 System.out.println("=============================================");
		 
		 
		 Shoe shoe1 = new Shoe();
		 shoe1.name = "Puma";
		 shoe1.price = 1800;
		 shoe1.colour = "White";
		 shoe1.size = 9;
		 shoe.type = "Sports Shoe";
		 System.out.println("The Name of shoe is "+ shoe1.name);
		 System.out.println("The price of the shoe is "+ shoe1.price);
		 System.out.println("The Colour of the shoe is "+ shoe1.colour);
		 System.out.println("The size of the shoe "+ shoe1.size);
		 System.out.println("The types of shoe "+ shoe1.type);
		 System.out.println(" =============================================");
		 
		 
		 Shoe shoe2 = new Shoe();
		 shoe2.name = "Sparx";
		 shoe2.price = 899;
		 shoe2.colour = "Blue";
		 shoe2.size = 11;
		 shoe.type = "Casual Shoe";
		 System.out.println("The Name of shoe is "+ shoe2.name);
		 System.out.println("The price of the shoe is "+ shoe2.price);
		 System.out.println("The Colour of the shoe is "+ shoe2.colour);
		 System.out.println("The size of the shoe "+ shoe2.size);
		 System.out.println("The types of shoe "+ shoe2.type);
		 System.out.println("==================================================");
		 
		 
		 Shoe shoe3 = new Shoe();
		 shoe3.name = "Nike";
		 shoe3.price = 2155;
		 shoe3.colour = "White";
		 shoe3.size = 8;
		 shoe.type = "Sneaker";
		 System.out.println("The Name of shoe is "+ shoe3.name);
		 System.out.println("The price of the shoe is "+ shoe3.price);
		 System.out.println("The Colour of the shoe is "+ shoe3.colour);
		 System.out.println("The size of the shoe "+ shoe3.size);
		 System.out.println("The types of shoe "+ shoe3.type);
		 
		 
		 
		  
		 
		 
	 }
	 
}