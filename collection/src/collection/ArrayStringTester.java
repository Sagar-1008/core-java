package collection;

import java.util.ArrayList;
import java.util.Collection;

public class ArrayStringTester {
	public static void main(String[] args) {
          
		Collection coll = new ArrayList();
		coll.add("Bangalore");
		coll.add("Vijayanagar");
		coll.add("rajajinagar");
		coll.add("Rajarajeswarinagar");
		coll.add("KR Puram");
		coll.add("Hampinagar");
		coll.add("Attiguppe");
		coll.add("Chandra Layout");
		coll.add("BasaveswarNagar");
		coll.forEach(System.out :: println);

	}
}
