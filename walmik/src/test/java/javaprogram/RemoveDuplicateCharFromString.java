package javaprogram;

public class RemoveDuplicateCharFromString {

	public static void way1(){
		
		String str = "wpwpps";
		String reserve = "";
		char[] arr = str.toCharArray();
		for (char ar : arr) {
			String str2 = String.valueOf(ar);
			if (!reserve.contains(str2))
				reserve = reserve + ar;
		}
		System.out.println(reserve);

	}
	
	
	public static void way2(){
		System.out.println("----------another way-------------");
		String s = "sspwpw";//sspwpw
		char temp;
		char[] a = s.toCharArray();
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j < s.length(); j++) {
				if (a[i] < a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}
			}
		}
		for (int i = 0; i < s.length(); i++)
		{
			for (int j = i + 1; j < s.length(); j++) 
			{
				if(a[i]==a[j])
					System.out.print(a[i]);
				
			}
		}
		
	}
	public static void main(String[] args) {

		way1();
		way2();
	}
}
