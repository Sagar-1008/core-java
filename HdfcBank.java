class HdfcBank extends Bank {

     @Override
     public void getInterest(double interest) {

		System.out.print("The HDFC bank ");
         interest = interest + 1.2 ;
   
        super.getInterest(interest);
        
         
     }







}