package collection;

import java.util.ArrayList;
import java.util.Collection;

public class ArrayTester {
        public static void main(String[] args) {
			Collection coll = new ArrayList();
			coll.add("vikranth Rona");
			coll.add(2);
			coll.add("Vikram");
			coll.add(2L);
			
			coll.remove(2L);
			coll.forEach(System.out :: println);
		}
}
// collection are stores only objects will not stores primitive datatypes.