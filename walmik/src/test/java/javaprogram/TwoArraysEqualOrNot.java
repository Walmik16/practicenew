package javaprogram;

import java.util.Arrays;

public class TwoArraysEqualOrNot {

	//java program to two arrays equal or not
	public static void main(String[] args) {
		
		int arr1[]= {10,20,30,40};
		int arr2[]= {10,20,40,50};
		int arr3[]= {10,20,30,40};
		
		System.out.println(Arrays.equals(arr1,arr2));
		System.out.println(Arrays.equals(arr1,arr3));
		System.out.println(Arrays.equals(arr2,arr3));
	}
}
