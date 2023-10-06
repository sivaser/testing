package selenium1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Practice {
public static void main(String[] args) {
	
	int a=12345;
	int sum=0;
	while (a!=0) {
		int lastdigit=a%10;
		sum=sum+lastdigit;
		a=a/10;
	}
	
//	List<Integer> num=new ArrayList<Integer>();
//	
//	num.add(1);
//	num.add(2);
//	num.add(1);
//	num.add(4);
//	num.add(4);
//	num.add(5);
//	num.add(15);
//	Set<Integer> a=new HashSet<Integer>(num);
//	System.out.println(a);
//	
	
	
}



}
//String a ="subbu";
//String b=a.replaceAll(" \\s", "");
//char[] b=a.toCharArray();
//Map<Character, Integer> dublicate=new HashMap<Character, Integer>();
//
//for(char c:b)
//{
//	
//	if(dublicate.containsKey(c))
//	{
//		dublicate.put(c, dublicate.get(c)+1);
//	}
//	else {
//		dublicate.put(c, 1);
//	}
//	
//	//c=c+b[i];
//	//System.out.println(a.charAt(i));
//}
//
//Set<Character> d=dublicate.keySet();
//for(char e:d)
//{
//	if(dublicate.get(e)<1)
//	{
//		System.out.println(e+""+dublicate.get(e));
//	}
//}
//
//
//		
//	}
//
//}
