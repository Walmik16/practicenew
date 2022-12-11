package javaprogram;

public class FactorialNum {

	//java program to calculate factorial number
	
	public static void main(String[] args) {
		
		//5!=5*4*3*2*1=120
		int a=5;
		int temp=1;
		for(int i=a;i>=1;i--) 
		{
			temp=temp*i;
		}
		System.out.println(temp);
		
		//if number go after multiplation beyond its range then
		int aa=20;
		long res=1;
		for(int i=aa;i>=1;i--) 
			res=res*i;
		System.out.println(res);
	}
	
}
