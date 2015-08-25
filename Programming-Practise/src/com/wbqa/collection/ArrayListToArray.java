package com.wbqa.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/*  		g. Write a program to copy arraylist to an array.
 * 
 */

public class ArrayListToArray {

	public void arrayList() {
		List<String> arraylist = new ArrayList<String>();
		arraylist.add("one");
		arraylist.add("two");
		arraylist.add("three");
		arraylist.add("four");
		String[] array = new String[arraylist.size()];
		arraylist.toArray(array);

		// printing the array
		System.out.println(Arrays.toString(array));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayListToArray al = new ArrayListToArray();
		al.arrayList();

	}

}
