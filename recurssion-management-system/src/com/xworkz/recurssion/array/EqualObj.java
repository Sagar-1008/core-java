package com.xworkz.recurssion.array;

public class EqualObj {
      
	int id;
	String name;

	/*public EqualObj(String name) {
		super();
		//this.id = id;
		this.name = name;
	}*/
	@Override
	public int hashCode() { 
		return this.id;
	}

	public static void main(String[] args) {
		
		EqualObj obj = new EqualObj();
		obj.name = "abc";
		//obj.id = 2;
		EqualObj obj1 = new EqualObj();
		//obj1.id = 2;
		obj1.name = "abc";
		 
		System.out.println(obj.hashCode());
		System.out.println(obj1.hashCode());
		
		/*System.out.println(obj.name.equals(obj1.name)); */
	    System.out.println(obj1.equals(obj));
		
		// System.out.println(obj==obj1);
	}
	
}
