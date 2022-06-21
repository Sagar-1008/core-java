class Tv1
{
  static String name = "Oneplus";
  static int price = 23000;
  static String color = "Black";
  static boolean isTurned ;
  static int maxVolume = 50;
  static int currentVolume;
  static int minVolume;
  
  public static void main(String a[])
  {
	 System.out.println("The Brand Name of the TV is "+ name);
	 System.out.println("The price of the TV "+ price);
	 System.out.println(" The Color of the TV "+ color);
    onOrOff();
	increaseVolume();
	increaseVolume();
	increaseVolume();
	increaseVolume();
	increaseVolume();
	increaseVolume();
	onOrOff();
	increaseVolume();
	decreaseVolume();
	decreaseVolume();
	onOroff();
	decreaseVolume();
	decreaseVolume();
	decreaseVolume();
	onOrOff();
	System.out.println("The main method is ended");
  }
  
  public static void onOrOff()
  {
    System.out.println(" The invoking the onOroff()");
	if(isTurned == false)
	{
	  isTurned = true;
	  System.out.println(" The Tv is Turned on");
	}
	
	else if(isTurned == true)
	{
	   isTurned = false;
	   System.out.println("The TV is turned off");
	}
  }
  
  static void increaseVolume()
  {
	  System.out.println("The increaseVolume method started");
	  if(isTurned == true)
	  {
		  System.out.println("The Tv is on");
	  if(currentVolume < maxVolume){
		  currentVolume = currentVolume + 1 ;
		  System.out.println("The current volume of the Tv is "+ currentVolume);
	  }
	  else{
		  System.out.println("The volume reached maximum level");
	  }
	  
	  }
	  else{
		  System.out.println("The Tv is off ");
	  }
  }
  
  static void decreaseVolume()
  {
	  System.out.println("The decrease voluner is started");
	  if(isTurned == true)
	  {
		  System.out.println("The Tv is on");
		  if(currentVolume > minVolume)
		  {
			  currentVolume = currentVolume +1 ;
			  System.out.println("The current volume of the Tv is "+ currentVolume);
			 
		  }
		  else{
			  System.out.println("The Tv reached minimum level");
		  }
	  }
	  else{
		  System.out.println("The Tv is off");
	  }
  }
  
  
  
  
  
  
  
  
  
  
  


}