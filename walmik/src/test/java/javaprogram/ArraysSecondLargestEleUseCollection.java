package javaprogram;

import java.util.ArrayList;
import java.util.TreeSet;

public class ArraysSecondLargestEleUseCollection {

	// java program find arrays second largest Element using collection 
	public static void main(String[] args) {
		
		int arr[] = { 7, 2, 3, 4, 5, 10, 6, 8, 1, 9 };
		
		TreeSet tr=new TreeSet();
		
		for(int num:arr) 
		{			
			tr.add(num);
		}
		System.out.println(tr);//[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
		ArrayList al=new ArrayList(tr);
		
		System.out.println("second largest Number: "+al.get(al.size()-2));
		System.out.println("second smallest Number: "+al.get(1));
	}
}
