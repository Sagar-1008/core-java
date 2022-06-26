class CricketTester{

		
		public static void main(String a[]){
			MSDhoni dhoni = new MSDhoni();
			dhoni.location = "Ranchi";
			dhoni.role = "WK and Batsman";
			dhoni.battingStyle = "Right handed batsman";
			dhoni.debtYear = 2004;
			System.out.println("The birth place of the dhoni is "+dhoni.location+" The role of the player "+dhoni.role+" and batting style is "+dhoni.battingStyle+" debt year is "+dhoni.debtYear );
			dhoni.getCricket();
}

}