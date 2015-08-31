package com.wbqa.string;

public class StringSpilt {
	int i = 0;

	public void splitString(String str) {
		String[] strArray = str.split(" ");
		int length = strArray.length;

		strArray[i] = strArray[i].concat("1");
		strArray[i + 1] = strArray[i + 1].concat("2");
		strArray[i + 2] = strArray[i + 2].concat("3");

		System.out.println(strArray[i] + strArray[i + 1] + strArray[i + 2]);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringSpilt ss = new StringSpilt();
		ss.splitString("This is nice");

	}

}
