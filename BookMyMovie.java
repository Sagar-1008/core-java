class BookMyMovie{

     String movies[] ;
	 String theaterName;
	 int totalNoOfTickets;
	 int ticketPrice = 500;
	 int totalTicketPrice;
	 
	 String snacks[];
	 int noOfSnacks;
	 int snacksPrice;
	 
	
	public BookMyMovie(String theaterName, int totalNoOfTickets, String movies[], int noOfSnacks, int snacksPrice,  String snacks[] )
	{
		this.theaterName = theaterName;
		this.totalNoOfTickets = totalNoOfTickets;
		this.movies = movies;
		this.noOfSnacks = noOfSnacks;
		this.snacks = snacks;
		System.out.println("bookMyMovie object created");
	}
	
	
	 
	 
	 public int showTime(int noOfTickets, String bookedBy, String movieName)
	 {
		  int totalTicketPrice = 0;
		  
		  System.out.println("the showTime method started");
		  System.out.println("The arg 1 "+ noOfTickets);
		  System.out.println("The arg 3 "+ movieName);
		  System.out.println("The arg 2 "+ bookedBy);
		  
	      for(int i = 0; i < movies.length;i++)
		  {
		      if(movieName == movies[i])
			  {  
			     System.out.println("the movie is matched");
				 
				 if(noOfTickets < totalNoOfTickets){
			    totalTicketPrice = ticketPrice * noOfTickets ;
                totalNoOfTickets = totalNoOfTickets - noOfTickets;
                System.out.println("for the movie "+ movieName +" The price of the booked tickets "+ totalTicketPrice +" Total available tickets "+ totalNoOfTickets +" Booked by "+ bookedBy );				
			  
			   
			  
			  }
		  
		       else {
			   System.out.println("The tickets are not available");
			   
			   }
			  }
		      else{
			     System.out.println("The movie is not available");
			  }
		  
		  }
	 
	 
	   return totalTicketPrice;
	 
	 }

   
      public int buySnacks(String snackName, int quantity){
		  
		  int totalSnacksPrice = 0;
		  System.out.println("The snackTime method is started");
		  System.out.println("The snacks name is  "+ snackName);
		  System.out.println("The quantity of the snacks "+ quantity);
		  
		  
		  for(int i=0; i < snacks.length; i++)
		  {
			  if(snackName == snacks[i]){
				  System.out.println("the snack is matched ");
				  if(quantity < noOfSnacks)
				  {
					  totalSnacksPrice =  snacksPrice * quantity ;
					  noOfSnacks = noOfSnacks - quantity;
					  System.out.println("The Snacks name : "+ snackName +"The price of the snacks "+ totalSnacksPrice +" Total no of  snacks available in the shop "+ noOfSnacks);
				  }
				  else{
					  System.out.println("astu snacks illa");
				  }
			  }
			  else{
				  System.out.println("The snack is not available");
			  }
		  }
		  return totalSnacksPrice;
	  }

}

