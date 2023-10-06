package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylistexample {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("santosh");
		list.add("naveen");
		list.add("shiva");
		list.add("pavan");
		System.out.println(list);
		//to iterateor print use below code
		Iterator<String>itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		//print using for each
		for(String name:list) {
			System.out.println(name);
		}
		//print using for loopp
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
	}
	

}
