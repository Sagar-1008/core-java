class KotakBank extends Bank{

     @Override
     public void getInterest(double interest) {

         System.out.print("The Kotak bank ");
         interest = interest + 2.5 ;
   
         super.getInterest(interest);
        
         
     }



}