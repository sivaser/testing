package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Collectionshashmap {

	public static void main(String[] args) {
		HashMap<Integer, String>hs=new  HashMap<Integer, String>();
		hs.put(3,"siva");
		hs.put(2,"geddam");
		hs.put(1,"kumar");
		System.out.println(hs);
		hs.remove(2);
		System.out.println(hs);
		hs.put(null, "its null value");
		hs.put(null, "its null value");
		
		//print hash set
		Set hp=hs.entrySet();
		Iterator ip=hp.iterator();
		while(ip.hasNext()) {
			Map.Entry mp=(Map.Entry)ip.next();
			System.out.println(mp.getKey()+" "+mp.getValue());
		}
		
		

	}

}
