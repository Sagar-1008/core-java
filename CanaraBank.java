class CanaraBank extends Bank{

     @Override
     public void getInterest(double interest) {

		System.out.print("The Canara bank ");
         interest = interest + 5.5 ;
   
        super.getInterest(interest);
        
         
     }








}