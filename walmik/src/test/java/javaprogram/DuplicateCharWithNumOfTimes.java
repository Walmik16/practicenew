package javaprogram;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateCharWithNumOfTimes {

	// java program to find duplicate char in string and print number of times
	public static void main(String[] args) {

		String a = "abbcccddddeeeee";

		char[] arr = a.toCharArray();

		
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();

		for (char ar : arr) {
			if (hm.containsKey(ar))
				
			hm.put(ar, hm.get(ar) + 1);

			else
				hm.put(ar,1);
		}
		 System.out.println(hm); //{a=1, b=2, c=3, d=4, e=5}
		Set<Character> keys = hm.keySet();
		for (char key : keys) 
		{
			if (hm.get(key) > 1)
				System.out.println(key + " :" + hm.get(key));
		}
		
		System.out.println("----------another way iteration=Entry Method--------");
		
		for(Map.Entry entry:hm.entrySet()) 
		{
		//	if(entry.getValue()>1)
		System.out.println(entry.getKey()+" :"+entry.getValue());	
		}
		
		
		System.out.println("----------another way iteration  Method--------");
		
		Set s=hm.entrySet(); //convert HashMap into set
		System.out.println(s);  //[a=1, b=2, c=3, d=4, e=5]
		Iterator itr=s.iterator();
		
		while(itr.hasNext())
		{
			//  System.out.print(itr.next() + " "); // a=1 b=2 c=3 d=4 e=5 
		Map.Entry entry=(Entry)itr.next();
		System.out.println(entry.getKey()+" :"+entry.getValue());	
		}
		
	}

}
