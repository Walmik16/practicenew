package javaprogram;

public class NumberOfOccurance {

	
	public static void main(String[] args) {
		
		String str="occurance";
		int count=0;
		char []arr=str.toCharArray();
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]=='c')
				count++;
		}
		System.out.println("occurance of single character c :"+count);
	}
}
