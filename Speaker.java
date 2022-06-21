class Speaker{
   static String name = "JBL";
   static double price = 2500;
   static String color = "Blue";
   static boolean isConnected;
   static int maxVolume = 6;
   static int currentVolume ;
   static int minVolume ;
   
   public static void main(String a[]) 
  {
	  
    System.out.println("The Brand name of the Speaker "+ name);
	System.out.println("The price of the speaker "+ price);
	System.out.println("The color of the speaker "+ color);
    onOrOff();
	increaseVolume();
	increaseVolume();
	increaseVolume();
	decreaseVolume();
	increaseVolume();
	increaseVolume();
	increaseVolume();
	increaseVolume();
	increaseVolume();
	increaseVolume();
	increaseVolume();
	decreaseVolume();
	decreaseVolume();
	decreaseVolume();
	decreaseVolume();
	decreaseVolume();
	decreaseVolume();
	onOrOff();
  
  }
 
  public static void onOrOff()
  {
     System.out.println("Invoking onOrOff()");
	 if(isConnected == false)
	 {
	   isConnected = true;
	   System.out.println("The Speaker is Turned On.... Is available for connection");
	 }
	 
	 else if(isConnected == true)
	 {
	     isConnected = false;
		 System.out.println("The Speaker is Turned off");
	 }
  
  }
  
  public static void increaseVolume()
  {
	  System.out.println("The incraese volume method is started");
	  if(isConnected == true)
	  {
		  System.out.println("The speaker is turned on ");
		 if(currentVolume < maxVolume)
		 {
			currentVolume = currentVolume + 1 ;
            System.out.println("The Current Volume is "+ currentVolume);			
			  
		 }
		 
		 else{
			 System.out.println("The speaker reach max volume ");
			 
		 }
		   
	  }
	  else{
		  
		 System.out.println("The speaker is off "); 
	  }
  }
  
  public static void decreaseVolume()
  {
	 System.out.println("The decreaseVolume method");
     if(isConnected == true)
     {
		System.out.println("The speaker is turned on"); 
		if(currentVolume > minVolume){
			currentVolume = currentVolume - 1 ;
			System.out.println("the current volume is "+ currentVolume);
		}
		else{
			System.out.println("The reach minimum volume ");
		}
		 
	 }
     else{
		 System.out.println("The speaker is off");
	 }	 
	  
  }

}