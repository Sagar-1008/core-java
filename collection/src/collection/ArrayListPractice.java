package collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListPractice {
        public static void main(String[] args) {
			
        	List al = new ArrayList();
        	al.add(1);
        	al.add("Bangalore");
        	al.add(16.98);
        	al.add(98745L);
        	al.add("Vijayanagar");
        	System.out.println(al);
        	System.out.println("after remove method");
        	//remove method by using the index
        	al.remove(1);
        	
        	System.out.println(al);
        	System.out.println("The size of the array list : "+ al.size());
        	System.out.println("After add(index, object)");
        	//insert element at the index
        	al.add(2, "Rajajinagara");
        	System.out.println(al);
        	//retrieve the specific element by index
        	System.out.println(al.get(2));
        	//Change the existing the data
         	al.set(3, al);
         	//after addAll 
         //	al.addAll(3, al);
         	
         	System.out.println(al);
        	//al.add("16.98");
        	//System.out.println(al);
         	
        	
		}
} 
