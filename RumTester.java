class RumTester{


    public static void main(String a[]){
	   
	   OldMonk old = new OldMonk();
	   old.price = 440 ;
	   old.alcoholicContent = "42.7%";
	   old.quantity = "750 ml";
	   old.mfgDate = "21 April 2022";
	   old.expiry = "Best before 24 months";
	   old.toGetKick();
	   System.out.println(old.price +"   "+old.alcoholicContent+"  "+old.quantity+"  "+old.mfgDate+"  "+old.expiry);
	
	}


}