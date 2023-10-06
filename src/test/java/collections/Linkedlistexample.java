package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlistexample {

	public static void main(String[] args) {
		LinkedList<String> list=new LinkedList<String>();
		list.add("santosh");
		list.add("naveen");
		list.add("shiva");
		list.add("pavan");
		System.out.println(list);
		//to iterator print use below code
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
		//add with index
		list.add(1,"vinod");
		
		//remove with index
		list.remove(2);
		
	}
	

}
