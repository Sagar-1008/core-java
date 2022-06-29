class YesBank extends Bank {


        @Override
     public void getInterest(double interest) {
		System.out.print("The YES bank ");

         interest = interest + 3.2 ;
   
         super.getInterest(interest);
        
         
     }








}