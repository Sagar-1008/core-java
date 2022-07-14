<<<<<<< HEAD
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
		/* System.out.println("Enter the existing id to update the type");
		 int existingId = sc.nextInt();
		 System.out.println("Enter type to be update");
		 String updateType = sc.next();
		 cus.updateTypeById(existingId, updateType);
		 cus.getOrderDetails();*/
		 
		 
		 System.out.println("Enter the existing Name to update the price");
		 String existingName = sc.next();
		 System.out.println("Enter price to be update");
		 int updatePrice = sc.nextInt();
		 cus.updatePriceByName(existingName, updatePrice);
		 
		 cus.getOrderDetails();
	  
	  }


=======
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


>>>>>>> d09fbfea06445d75a0b0ed212c040bedaa1b843a
}