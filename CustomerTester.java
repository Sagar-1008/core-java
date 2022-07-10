import java.util.Scanner ;

class CustomerTester{

      public static void main(String a[]){
	     
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the Number of orders");
		 int size = sc.nextInt();
		 
		 Customer cus = new Customer(size);
		 
		for(int i=0; i<size;i++) {
			
		   OrderDTO order = new OrderDTO();
		   
		   System.out.println("Enter the id of the order");
		   int id = sc.nextInt();
		   System.out.println("Enter the Order name");
		   String name = sc.next();
		   System.out.println("Enter the price of the order");
		   int price = sc.nextInt();
		   System.out.println("Enter type of the order");
		   String type = sc.next();
		   
		   order.setId(id);
		   order.setName(name);
		   order.setPrice(price);
		   order.setType(type);
		   
		   cus.createOrder(order);
		 
		 
		 }
		 
		 cus.getOrderDetails();
	  
	  }


}