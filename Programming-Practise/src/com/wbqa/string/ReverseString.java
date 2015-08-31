package com.wbqa.string;

public class ReverseString {

	public void reverseString(String original) {
		String reverse = "";
		for (int i = original.length() - 1; i >= 0; i--) {
			reverse = reverse + original.charAt(i);
		}
		System.out.println("The reverse string is:" + reverse);

	}

	public static void main(String[] args) {
		ReverseString rs = new ReverseString();
		rs.reverseString("Neha");
		rs.reverseString("Yogesh");

	}

}
