class BeerTester{


    public static void main(String a[]){
	   
	   Tuborg tub = new Tuborg();
	   tub.price = 140 ;
	   tub.alcoholicContent = "4.6%";
	   tub.quantity = "650 ml";
	   tub.mfgDate = "26 April 2022";
	   tub.expiry = "Best before 24 months";
	   tub.toGetweight();
	   System.out.println(tub.price +"   "+tub.alcoholicContent+"  "+tub.quantity+"  "+tub.mfgDate+"  "+tub.expiry);
	
	}


}