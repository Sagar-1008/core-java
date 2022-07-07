class LaptopTester{

     public static void main(String a[]){
	 
	    LaptopDTO lap = new LaptopDTO();
		lap.setName("Lenovo");
		lap.setPrice(43000.00);
		lap.setRam("8GB");
		lap.setColor("Grey");
		lap.setOperatingSystem("Windows 11");
		System.out.println(lap.getName()+"  "+lap.getPrice()+"  "+lap.getRam()+"  "+lap.getColor()+"  "+lap.getOperatingSystem());
	    lap.display();
	 
	 }


}