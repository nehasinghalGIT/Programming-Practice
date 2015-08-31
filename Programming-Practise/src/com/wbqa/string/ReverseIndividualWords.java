package com.wbqa.string;

public class ReverseIndividualWords {

	public void reverseWords(String sentence) {
		String[] strArray = sentence.split(" ");
		for (String word : strArray) {
			System.out.println(new StringBuffer(word).reverse() + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ReverseIndividualWords rs = new ReverseIndividualWords();
		rs.reverseWords("This is nice");

	}

}
