package com.wbqa.Array;

import java.util.Arrays;

public class Array {

	public void sortElementsInArray(int[] array) {
		int temp = 0;
		int length = array.length;
		for (int i = 0; i < length-1; i++) {
			if (array[i] > array[i+1]) {
				temp = array[i];
				array[i] = array[i + 1];
				array[i + 1] = temp;
			}
		}
		System.out.println("Sorted array is:" + Arrays.toString(array));
	}

	public static void main(String[] args) {
		Array a = new Array();
		a.sortElementsInArray(new int[] { 1, 2, 3, 5, 4 });
		a.sortElementsInArray(new int[] { 1, 3, 2, 4, 5 });

	}

}
