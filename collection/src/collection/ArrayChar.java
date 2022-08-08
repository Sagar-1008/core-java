package collection;

import java.util.ArrayList;
import java.util.Collection;

public class ArrayChar {
            public static void main(String[] args) {
				Collection coll = new ArrayList();
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
				
				 coll.forEach(System.out:: println);
				 coll.remove('a');
				 coll.forEach(System.out:: println);
			}
}
