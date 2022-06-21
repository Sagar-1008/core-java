class SuperMarket
{
   static String biscuts[] = {"Oreo ", "Bourboun ", "Prle G ", "HideandSeek ", "Momsmagic ", "Goodday ", "DarkFantasy "};
   static String vegetables[] = {"Beans", "Tomato", "Mint", "Zinger", "Cocumber", "Lemon", "Potato", "Onion"};
   static String deos[] = {"Fog", "Nivea", "Woldstone", "KS", "Park Avenue", "Denvier", "Setwet"};
   static String sportItems[] = {"Balls", "Bat", "gloves", "pad", "rockets", "guard", "Vollyball", "Football"};
   static String soaps[] = {"Dove", "Santoor", "Lifeboy", "Wildstone", "pears", "Mysore sandal", "Medimex", "Rin", "Wheel", "surfexcel"};
   static String coolDrinks[]  = {"Sprite", "MountainDew", "7Up", "Mazaa", "Slice", "Red bull", "sting"};
   static String fruits[] = {"gova", "Mangoes", "sapota", "apple", "water Melon", "Dragonfruit", "jackfruit"};
   static String chocolates[] = {"5Star", "Dairy milk", "Mily Bar", "Snikers", "Kitkat", "Munch", "Perk"};
   static String snacks[] = {"Moong Dal", "Lays", "Togz", "Cheetos", "Doritos", "Pringles", "Kurkure"};
   static String grocerries[] = {"Rice", "Peanunt", "ground Nut", "turmeric powder", "chicken masala", "Garam Masala", "Tea Powder"};
   static String homeAppliances[] = {"AC", "Refrigerator", "Fan", "Mixer", "Grinder", "TV", "Geaser"};

   public static void main(String a[])
   {
   
    getBiscuts();
	getVegetables();
	getDeos();
	getSportItems();
	getSoaps();
	getCoolDrinks();
	getFruits();
	getChocolates();
	getSnacks();
	getGrocerries();
	getHomeAppliances();
	
   }  
    
    public static void getBiscuts()
	{
		System.out.println("The List of Biscuts available in the Market");
		for(int i=0;i<biscuts.length;i++)
		{
			
			System.out.println(biscuts[i]);
			
		}
	}


     public static void getVegetables()
	 {
		 System.out.println("The List of Vegetables available in the Market");
		 for(int i=0;i<vegetables.length;i++)
		 {
			 System.out.println(vegetables[i]);
		 }
		 
		 
	 }
	 
	 public static void getDeos()
	 {
		 System.out.println(" The List of Deos available");
		 for(int i=0;i<deos.length;i++)
		 {
			 System.out.println(deos[i]);
		 } 
		 
	 }
	 
	 
	 public static void getSportItems()
	 {
		 System.out.println("The List of Sport Items available");
		 for(int i=0 ; i<sportItems.length;i++)
		 {
			 System.out.println(sportItems[i]);
		 }
	 }
	 
	 
	 public static void getSoaps()
	 {
		 System.out.println("The List of soaps Available");
		 for(int i=0; i<soaps.length;i++)
		 {
			 System.out.println(soaps[i]);
		 }
	 }
	 
	 public static void getCoolDrinks()
	 {
		 System.out.println("The list of Cool Drinks Available");
		 for(int i=0;i<coolDrinks.length;i++)
		 {
			 System.out.println(coolDrinks[i]);
		 }
	 }
	 
	 public static void getChocolates()
	 {
		 System.out.println("The List of Chocolates available");
		 for(int i=0 ; i<chocolates.length;i++)
		 {
			 System.out.println(chocolates[i]);
			
		 }
	 }
	 
	 public static void getFruits()
	 {
		 System.out.println("The List of Fruits Available");
		 for(int i=0; i<fruits.length;i++)
		 {
			 System.out.println(fruits[i]);
		 }
	 }
	 
	 public static void getSnacks()
	 {
		 System.out.println("The List of Snacks available");
		 for(int i=0;i<snacks.length;i++)
		 {
			 System.out.println(snacks[i]);
		 }
	 }
	 
	 public static void getGrocerries()
	 {
		 System.out.println("The list of Grocerries Available");
		 for(int i=0;i<grocerries.length;i++)
		 {
			 System.out.println(grocerries[i]);
		 }
	 }
	 
	 public static void getHomeAppliances()
	 {
		 System.out.println("The List of Home Appliances Available");
		 for(int i=0;i<homeAppliances.length;i++)
		 {
			 System.out.println(homeAppliances[i]);
		 }
	 }


}