class MobileTester{


     public static void main(String []a){
	  
	  OnePlus onePlus = new OnePlus();
	  
	 onePlus.price = 38000;
	 onePlus.display = "5.4inch";
	 onePlus.ram = "8GB ram";
	 onePlus.battery = "4920mAh";
	 onePlus.processor = "Snapdragon 768";
	 System.out.println("The price of the mobile is "+ onePlus.price +"the display of the mobile is "+ onePlus.display+" The ram is "+ onePlus.ram+" The battery is "+onePlus.battery);
	 System.out.println("The processor of the mobile is "+ onePlus.processor);
	 onePlus.usesOfMobile();
	 
	 }



}