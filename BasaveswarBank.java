class BasaveswarBank extends Bank{

     @Override
     public void getInterest(double interest) {

		System.out.print("The Basaveswar bank ");
         interest = interest + 1.7 ;
   
        super.getInterest(interest);
        
         
     }








}