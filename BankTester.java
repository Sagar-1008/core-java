class BankTester{


    public static void main(String a[]){
	
	  Bank kotak = new KotakBank();
	  kotak.getInterest(5.0);
	  
	  Bank yes = new YesBank();
	  yes.getInterest(5.0);
	  
	  Bank hdfc = new HdfcBank();
	  hdfc.getInterest(5.0);
	 
	  
	  Bank icici = new IciciBank();
	  icici.getInterest(5.0);
	  
	  Bank basa = new BasaveswarBank();
	  basa.getInterest(5.0);
	  
	  Bank maruti = new MarutiBank();
	  maruti.getInterest(5.0);
	  
	  Bank canara = new CanaraBank();
	  canara.getInterest(5.0);
	  
	  Bank karanataka = new KarnatakaBank();
	  karanataka.getInterest(5.0);
	}


}