class BigBasketTester{


     public static void main(String a[]){
		 
		 BigBasket bb = new BigBasket();
		 bb.setId("854afg25");
		 bb.setOwner("Tata");
		 bb.setOriginPlace("India");
		 bb.setType("Online Supermarket");
		 System.out.println(bb.getId()+"  "+bb.getOwner()+"  "+ bb.getOriginPlace() +" "+bb.getType());
		 bb.useOfBigBasket();
		 
	 }


}