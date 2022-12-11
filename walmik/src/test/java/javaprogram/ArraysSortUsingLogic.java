package javaprogram;

public class ArraysSortUsingLogic {

	public static void main(String[] args) {
		String s = "bedac";
		char temp;
		char[] a = s.toCharArray();
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j < s.length(); j++) {
				if (a[i] > a[j]) { //assending
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}
			}
		}
		for (int i = 0; i < s.length(); i++) {
			System.out.print(a[i]);
		}
	}
}
