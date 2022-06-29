class IciciBank extends Bank{

     @Override
     public void getInterest(double interest) {

		System.out.print("The ICICI bank ");
         interest = interest + 1.7 ;
   
        super.getInterest(interest);
        
         
     }








}