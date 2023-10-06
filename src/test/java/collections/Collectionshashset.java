package collections;

import java.util.HashSet;
import java.util.Iterator;

public class Collectionshashset {

	public static void main(String[] args) {
		HashSet<Integer>obj=new HashSet<Integer>();
		obj.add(10);
		obj.add(20);
		obj.add(30);
		obj.add(30);
		obj.add(30);
		System.out.println(obj);
		System.out.println(obj.size());
		HashSet<String>hss=new HashSet<String>();
		hss.add("santosh");
		hss.add("siva");
		hss.add(null);
		hss.add(null);
		hss.add("SAntosh");
		Iterator<String>it=hss.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
