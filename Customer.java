class Customer{


    OrderDTO[] orders ;
	int index;
	
	public Customer(int size){
	  orders = new OrderDTO[size];
      System.out.println("The Customer constructor is created");	  
	
	}
	
	public boolean createOrder(OrderDTO order){
	
	    System.out.println("Inside the createOrder");
		boolean isAdded = false;
		
		if(order != null && order.getName() != null) {
		    
			this.orders[index++] = order;
			isAdded = true;
			System.out.println("The Order detail is saved");
		} else {
		   System.out.println("The order is not saved");
		
		}
	       System.out.println("the createOrder() is ended");
	   return isAdded;
	}
	
	public void getOrderDetails(){
	
	     
		 for(int i=0; i<orders.length; i++){
		    
			  System.out.println(orders[i].getId()+"  "+orders[i].getName()+"  "+orders[i].getPrice()+"  "+orders[i].getType());
		 
		 }
	     
	}



}