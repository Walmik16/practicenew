package javaprogram;

import java.util.HashMap;
import java.util.Set;

public class DuplicateStringWithNumOfTimes {

	public static void main(String[] args) { 

		 
       String[] str= {"walmik","badri","nitin","walmik","nitin","badri","badri","ankush","nitin","amar","nitin"};
		 
  HashMap<String,Integer> hm=new HashMap<String,Integer>();
  
       for(String st:str) 
       {
    	   if(hm.containsKey(st))
    		   hm.put(st,hm.get(st)+1);
    	   else
    		   hm.put(st,1);
       }
       System.out.println(hm);
       Set<String>keys=hm.keySet();
       for(String key:keys)
       {
    	System.out.println(key+" :"+hm.get(key));   
       }
       
		} 

	} 

