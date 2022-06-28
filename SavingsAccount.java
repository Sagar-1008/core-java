class SavingsAccount extends BankAccount{

    double interestRate;

   public SavingsAccount( double interestRate ) {
   // super() will be called by the compiler
    this.interestRate = interestRate;
   
   }

    //Calucalate the periodInterest
	public double periodInterest() {
	
	   double interest = getBalance() * interestRate/100 ;
	   deposit(interest);
	   
	   return interest;
	}


}