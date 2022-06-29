class MarutiBank extends Bank{

     @Override
     public void getInterest(double interest) {

		System.out.print("The Maruti bank ");
         interest = interest + 2.7 ;
   
        super.getInterest(interest);
        
         
     }








}