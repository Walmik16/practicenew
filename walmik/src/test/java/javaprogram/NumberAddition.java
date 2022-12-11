package javaprogram;

public class NumberAddition {

	public static void m1() {
		// addition of number seperately

		String str = "12ABB8C2";
		int num = 0;
		char[] arr = str.toCharArray();

		for (char a : arr) {

			boolean value = Character.isDigit(a);
			if (value == true) {

				num = num + Character.getNumericValue(a);
			}
		}
		System.out.println(num); // 1+2+8+2=13
	}

	public static void m2() {
		String str = "12ABB8C2";

		String temp = "0";

		int sum = 0;

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);
			boolean value = Character.isDigit(ch);
			if (value==true) {
				temp = temp + ch;
			}
//jar ch madhe digit ala tr to temp madhe store hoel ani next jr char ala tr temp data intiger  madhey convert karun sum madhe store karu
//ani temp la vapas redefine karu zero			
			else {
				sum = sum + Integer.parseInt(temp);
				temp = "0";
			}
		}
		int finalvalue = sum + Integer.parseInt(temp);// 20+2

		System.out.println(finalvalue);// 22
	}

	public static void main(String[] args) {
		m1();// 1+2+8+2=13
		m2();// 12+8+2=22
	}
}
