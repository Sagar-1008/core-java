class AccountTester{


   public static void main(String a[])
   {
      SavingsAccount sa = new SavingsAccount(0.3);
	  sa.deposit(7000.00);
	  sa.withdraw(2789.00);
	  sa.getBalance();
	  
	  SavingsAccount other = new SavingsAccount(0.3);
	  sa.transfer(1000, other); //other is object ref name
	  double totalAmount = other.getBalance();
	  System.out.println("Balance of other account "+ totalAmount);
	  System.out.println("=============================================");
	  
	  CurrentAccount ca = new CurrentAccount(20, 1.2);
	  ca.deposit(8000.00);
	  ca.withdraw(2800.00);
	  ca.deposit(10000.00);
	  ca.deposit(4000.00);
	  ca.withdraw(1000.00);
	  ca.deposit(2000.00);
	  ca.withdraw(10000.00);
	  ca.deductionOfFee();
	  ca.periodicInterest();
	  ca.getBalance();
	  
   
   
   
   }



}