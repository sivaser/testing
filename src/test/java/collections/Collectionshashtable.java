package collections;

import java.util.Hashtable;

public class Collectionshashtable {

	public static void main(String[] args) {
		Hashtable<Integer, String>ht=new Hashtable<Integer, String>();
		ht.put(1,"one");
		ht.put(2,"two");
		ht.put(3,"");
		ht.put(4,"a");
		ht.put(5,"a");
		ht.put(3,"two");
		//ht.put(3,null);//it will be throw an error it can store the null value
		//ht.put(null,"");//it will be throw an error it can store the null key
		System.out.println(ht);
		

	}

}
