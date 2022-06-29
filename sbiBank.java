class SbiBank extends Bank {

     @Override
     public void getInterest(double interest) {

		System.out.print("The SBI bank ");
         interest = interest + 3.2 ;
   
        super.getInterest(interest);
        
         
     }







}