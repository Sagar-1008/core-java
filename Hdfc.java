class HdfcBank extends Bank {

     @Override
     public void getInterest(double interest) {


         interest = interest + 1.2 ;
   
        super.getInterest(interest);
        
         
     }







}