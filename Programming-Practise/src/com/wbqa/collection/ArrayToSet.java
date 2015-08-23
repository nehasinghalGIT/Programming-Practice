package com.wbqa.collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*  		b. Write a program to find duplicates in an array using set. */

public class ArrayToSet {

	public int[] findDups(int[] array) {
		Set<Integer> set = new HashSet();
		for (int i = 0; i < array.length; i++) {
			set.add(array[i]);
		}
		Iterator<Integer> it = set.iterator();
		int i = 0;
		int[] newArray = new int[set.size()];
		while (it.hasNext()) {
			newArray[i++] = it.next();
		}
		return (newArray);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayToSet as=new ArrayToSet();
		int[] array = as.findDups(new int[] { 1, 2, 4, 2, 5, 1 });
		System.out.println("The elements of array after removing duplicates:"
				+ Arrays.toString(array));

	}

}
