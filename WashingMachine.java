class WashingMachine
{
  static String name = "Samsung";
  static int price = 40899;
  static String color = "Inox";
  static String itemWeight = "65000 grams";
  static String capacity = "9000 Kg";
  static boolean isTurned ;
  static int maxTime = 50;
  static int minTime;
  static int currentTime;
  
  public static void main(String a[])
  {
   System.out.println("The name of the washing machine is  "+ name);
   System.out.println("The price of the washing machine is "+ price);
   System.out.println("The color of the washing machine is "+ color);
   System.out.println("The capacity of the washing machin is "+ capacity);
   System.out.println("The Weight of the Washing machine is "+ itemWeight);
   onOrOff();
   increaseTime();
   increaseTime();
   increaseTime();
   onOrOff();
   decreaseTime();
  decreaseTime();
  decreaseTime();
  onOrOff();
  decreaseTime();
  decreaseTime();
  decreaseTime();
  increaseTime();
  increaseTime();
  decreaseTime();
  decreaseTime();
   onOrOff();
   System.out.println("the main method is ended");
  }
  
  public static void onOrOff()
  {
    System.out.println("Invoking the onOroff()");
	if(isTurned == false)
	{
	  isTurned = true;
	  System.out.println("The Washing machine is turned on");
	 
	}
	
	else if(isTurned == true)
	{
	  isTurned = false;
	  System.out.println("The washing machine is turned off");
	}
   System.out.println("The onOrOff method is ended");
  }
  
  static void increaseTime(){
	  System.out.println("The increaseTime method is started");
	  if(isTurned == true){
		  System.out.println("The Washing machine is turned on");
		  if(currentTime < maxTime){
			  currentTime = currentTime + 1;
			  System.out.println("The current time for washing is "+ currentTime);
		  }
		  else{
			  System.out.println("The washing time reached maximum time");
		  }
	  }
	  else{
		  System.out.println("The washing machine is turned off");
	  }
	  System.out.println("The increaseTimemethod ended");
  }
  
  static void decreaseTime(){
	  System.out.println("The decreaseTime method is started");
	  if(isTurned == true){
	  if(currentTime > minTime){
		  currentTime = currentTime - 1;
		  System.out.println("The current time for the washing is "+ currentTime);
	  }
	  else{
		  System.out.println("the washing time reached minimum time");
	  }
  }
  else{
	  System.out.println("Turned on the washing machine");
  }
  System.out.println("The decreaseTime method ended");
  }
}