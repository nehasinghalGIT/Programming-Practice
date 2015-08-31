package com.wbqa.string;

public class FindAndReplace {

	public void replaceString(String original, String find, String replace) {
		String newString = original.replaceAll(find, replace);
		System.out.println("New String is:" + newString);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindAndReplace fr = new FindAndReplace();
		fr.replaceString("WBQA", "WB", "BB");
	}

}
