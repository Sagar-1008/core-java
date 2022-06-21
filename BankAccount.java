class BankAccount
{
   static double amount;
   static double totalAmount;
   public static void main(String a[])
   {
     System.out.println("the main method started");
	 deposit(18000.00);
	 withdraw(15215.00);
	 totalAmount();
	
	 deposit(20000.00);
	 withdraw(10000.00);
	 totalAmount();
	 
	 deposit(30000.00);
	 withdraw(7000);
	 totalAmount();
	 
	 deposit(45000);
	 withdraw(30000);
	 totalAmount();
	 
	 deposit(15000);
	 withdraw(11000);
	 totalAmount();
	 
	 deposit(58000);
	 withdraw(45000);
	 totalAmount();
	 
	 deposit(80000);
	 withdraw(59000);
	 totalAmount();
	 
	 deposit(12000);
	 withdraw(5695);
	 totalAmount();
	 
	 deposit(18968);
	 withdraw(19875);
	 totalAmount();
	 
	 deposit(23689);
	 withdraw(16555);
	 totalAmount();
   
   }
  static void deposit(double amt)
  
  {
   System.out.println("invoke Deposit()");
   System.out.println("Amount to be deposited "+ amt);
   System.out.println("Amount before deposit "+ amount);
   amount = amount + amt;
   System.out.println("The amount after deposit "+ amount);
   System.out.println("deposit method ended");
  }
  
  static void withdraw(double withd)
  {
    System.out.println("invoke withdraw()");
	System.out.println(" amount to be withdraw "+ withd);
	System.out.println("the Amount before withdraw "+ amount);
	amount = amount - withd;
	System.out.println(" The Total Balance is "+ amount);
    System.out.println(" withdraw method ended ");	
  }
  
  
 static void totalAmount()
 {
	 totalAmount = amount;
	 System.out.println("The Total balance "+ totalAmount);
 }
}