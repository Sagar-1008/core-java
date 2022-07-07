class AirportTester{


     public static void main(String a[]){
		 
		 AirportDTO airport = new AirportDTO();
		 airport.setName("Kempegowda International airport");
		 airport.setId("236jhu589");
		 airport.setNoOfPassengers(15000);
		 airport.setLocation("Devanahalli");
		 airport.setType("International Airport");
		 System.out.println("The name of the Airport is "+airport.getName()+"\nThe id is "+airport.getId()+" \nThe no of passenger travels per day is "+airport.getNoOfPassengers()+"\nThe airport located in  "+ airport.getLocation() +"\n The type of the airport is "+ airport.getType());
		 
		 
	 }


}