class Library{

        int libId;
		String name;
		String type;
		int noOfBooks;
		int noOfReaders;
		static String location = "Vijayanagar";
		
		public Library(int libId, String name, String type, int noOfBooks, int noOfReaders)
		{
		   System.out.println("The Library object is created");
		   this.libId = libId;
		   this.name = name;
		   this.type = type;
		   this.noOfBooks = noOfBooks;
		   this.noOfReaders = noOfReaders;
		
		}
		
		 public static void main(String a[]){
		 
		   Library lib = new Library(123, "Central Library", "Public", 5000, 250);
		   System.out.println("The name of the library and id is "+ lib.name+"  "+ lib.libId+" The type of libray is "+ lib.type);
		   System.out.println("The no of books present in the library and no of raders are "+ lib.noOfBooks +"  "+ lib.noOfReaders+" Respectively");
		   System.out.println("The location of the library "+ location);
		   System.out.println("=================================================");
		   
		   Library lib1 = new Library(124, "Compete", "Public", 300, 60);
		   System.out.println("The name of the library and id is "+ lib1.name+"  "+ lib1.libId+" The type of libray is "+ lib1.type);
		   System.out.println("The no of books present in the library and no of raders are "+ lib1.noOfBooks +"  "+ lib1.noOfReaders+" Respectively");
		   System.out.println("The location of the library "+ location);
		   System.out.println("=================================================");
		   
		   Library lib2 = new Library(125, "Vidya Bharati", "College Library", 1000, 400);
		   System.out.println("The name of the library and id is "+ lib2.name+"  "+ lib2.libId+" The type of libray is "+ lib2.type);
		   System.out.println("The no of books present in the library and no of raders are "+ lib2.noOfBooks +"  "+ lib2.noOfReaders+" Respectively");
		   System.out.println("The location of the library "+ location);
		   System.out.println("=================================================");
		   
		   Library lib3 = new Library(126, "Jnana Ganga", "Public", 10000,1000);
		   System.out.println("The name of the library and id is "+ lib3.name+"  "+ lib3.libId+" The type of libray is "+ lib3.type);
		   System.out.println("The no of books present in the library and no of raders are "+ lib3.noOfBooks +"  "+ lib3.noOfReaders+" Respectively");
		   System.out.println("The location of the library "+ location);
		   
		   
		   
		 
		 }







}