class HistoricalPlaces{
        
		
		String place;
		static String dep = "Karnataka state department of Archeology";
		int visitors;
		int noOfPlaces;
		
		public HistoricalPlaces(String place,int visitors, int noOfPlaces)
		{
			System.out.println("The historical places object is created");
			this.place = place;
			this.visitors = visitors;
			this.noOfPlaces = noOfPlaces;
			
		}
		
		public static void main(String a[])
		{
			HistoricalPlaces histo = new HistoricalPlaces("Hampi", 1000, 9);
			System.out.println("The name of the historical place is "+ histo.place +" and The no of visitors daily are "+ histo.visitors);
			System.out.println("The number of monument places in the "+ histo.place +" is "+ histo.noOfPlaces);
			System.out.println("Maintainance of "+ histo.place+" is taken by "+ dep);
			System.out.println("=============================================================");
			
			HistoricalPlaces histo1 = new HistoricalPlaces("Badami", 200, 4);
			System.out.println("The name of the historical place is "+ histo1.place +" and The no of visitors daily are "+ histo1.visitors);
			System.out.println("The number of monument places in the "+ histo1.place +" is "+ histo1.noOfPlaces);
			System.out.println("Maintainance of "+ histo1.place+" is taken by "+ dep);
			System.out.println("=============================================================");
			
			HistoricalPlaces histo2 = new HistoricalPlaces("Mysore", 500, 5);
			System.out.println("The name of the historical place is "+ histo2.place +" and The no of visitors daily are "+ histo2.visitors);
			System.out.println("The number of monument places in the "+ histo2.place +" is "+ histo2.noOfPlaces);
			System.out.println("Maintainance of "+ histo2.place+" is taken by "+ dep);
			System.out.println("=============================================================");
			
			HistoricalPlaces histo3 = new HistoricalPlaces("Pattadakallu", 250, 7);
			System.out.println("The name of the historical place is "+ histo3.place +" and The no of visitors daily are "+ histo3.visitors);
			System.out.println("The number of monument places in the "+ histo3.place +" is "+ histo3.noOfPlaces);
			System.out.println("Maintainance of "+ histo3.place+" is taken by "+ dep);
			
		}




}