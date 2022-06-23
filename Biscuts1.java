class Biscuts1{

        
		String biscutsName[] = {"GoodDay", "Hide&Seek", "Parle-G", "Mom'sMagic"};
		int price;
		int noOfBiscuts;
		
		public Biscuts1(){
		
		System.out.println("the Biscuts object is created");
		}
		
		public Biscuts1( int price, int noOfBiscuts  ){
		this();
		this.getBiscuts("GoodDay");
		
		this.price = price;
		this.noOfBiscuts = noOfBiscuts;
		}
		
		public static void main(String a[]){
			
			Biscuts1 biscuts = new Biscuts1( 10, 15);
			System.out.println("The selected biscuit has a price of "+ biscuts.price +" The no of pieces it has "+ biscuts.noOfBiscuts);
			
		}
        
		   public void getBiscuts(String biscutName)
		   {
			    for(int i = 0 ; i < biscutsName.length; i++)
				{
					if(biscutName == biscutsName[i] )
					{
						System.out.println("The selected biscut is "+ biscutsName[i]);
					}
					
					
				}
			   
		   }
}