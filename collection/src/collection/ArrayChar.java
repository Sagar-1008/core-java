package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArrayChar {
	public static void main(String[] args) {
		List coll = new ArrayList();
		coll.add('a');
		coll.add('c');
		coll.add('e');
		coll.add('f');
		coll.add('z');
		coll.add('m');
		coll.add('v');
		coll.add('r');
		coll.add('s');
		coll.add('k');
		


		System.out.println("checking the contains()");
		boolean col = coll.contains('k');
		System.out.println(col);

		coll.forEach(System.out:: print);
		List coll1 = new ArrayList();

		coll1.addAll(coll);
		// coll1.forEach(System.out:: print);
		System.out.println("");
		boolean col1 = coll1.containsAll(coll);
		System.out.println(col1);
		coll1.add("Bangalore");
		coll1.add("Hasan");
		coll1.add("Dharawad");
		coll1.add("Belagavi");
		//System.out.println(coll1.removeAll(coll));
		System.out.println(coll1);

		System.out.println(coll1);
		coll1.removeAll(coll);
		System.out.println("After removeAll");
		System.out.println(coll);
		coll.retainAll(coll1);
		System.out.println("After retainAll");
		System.out.println(coll1);
		System.out.println(coll);



	}
}


