package javaprogram;

public class DuplicateCharWithNumOfTimesWithoutColl {

	
	public static void main(String[] args) {
		
		String str="wpw";
		
		int maxLength=str.length();
		System.out.println(maxLength);//3(length alaways greater+1 than actual)
		String reserve="";
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			  String str2=String.valueOf(ch);
			  String str3=str.replace(str2,""); //str2 replace blank means no.of time char(w) present they all(w) remove so just =p will available in string 			                                      
			  int length=str3.length();        //so just string="p";-- length is 1(0,1) 
			  int occur=maxLength-length;    //so oocurance char=maxLength-length=3-1=2 means two time char occur
			 
			  if(!reserve.contains(str2))
			  {  reserve=reserve+str2;
			  System.out.println(ch+" :"+occur);
			  }
		}
		System.out.println(reserve); //remove duplicate char from string
	}
}
