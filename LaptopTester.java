class LaptopTester{

     public static void main(String a[]){
	 
	 Lenovo lenovo = new Lenovo(45000, "intelCore i3", "Windows 11", "15.4 inch");
	 System.out.println(" The price of the laptop is "+ lenovo.price +"The processor of the laptop is "+lenovo.processor+" The operating syatem of the laptop is "+ lenovo.operatingSystem);
	 System.out.println("The Display of the laptop is "+ lenovo.display);
	 lenovo.getuses();
	 
	 
	 }

}