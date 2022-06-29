class KarnatakaBank extends Bank{

     @Override
     public void getInterest(double interest) {

		System.out.print("The KarnatakaBank bank ");
         interest = interest + 3.4;
   
        super.getInterest(interest);
        
         
     }








}