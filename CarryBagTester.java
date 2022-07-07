class CarryBagTester{

     public static void main(String a[]){
	 
	    CarryBagDTO carry = new CarryBagDTO();
		//carry.name = "Baba's Carry ba";
		//carry.price = 5.00;
		carry.setName1("Baba's Carry ba");
		carry.setPrice(5.00);
		System.out.println(carry.getName()+"  "+carry.getPrice());
		carry.hold();
	 
	 
	 }



}