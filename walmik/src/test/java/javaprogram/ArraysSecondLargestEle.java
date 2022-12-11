package javaprogram;

import java.util.Arrays;

public class ArraysSecondLargestEle {

	// java program find arrays second largest Element

	public static void main(String[] args) {

		int arr[] = { 7, 2, 3, 4, 5, 10, 6, 8, 1, 9 };
		// using function
		Arrays.sort(arr);  // array sort by assending order
		System.out.println("second largest Number using function: "+arr[arr.length - 2]);// 9
		
		
		// using logic
		int empty = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) { //> for desending order //for assending <
					empty = arr[i];                 //also possible //empty = arr[j]; 
					arr[i] = arr[j];                               //arr[j] = arr[i];
					arr[j] = empty;                                 //arr[i] = empty;
				}
			}
			System.out.print(arr[i]);
		}
		System.out.println();
		System.out.println("second largest Number: "+arr[1]); //second largest=9
		System.out.println("second smallest Number: "+arr[arr.length-2]);//second smallest=2
		
		System.out.println("---------Array Printing------------");
		for(int i=0;i<arr.length;i++) 
		{
			System.out.print(arr[i]);
		}
	}

}
