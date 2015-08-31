package com.wbqa.Array;

import java.util.Arrays;

public class SortArray {

	public void sortArrayBubble(int[] array) {
		int temp = 0;
		int length = array.length;
		for (int i = 0; i < length; i++) {
			for (int j = i + 1; j < length; j++) {
				if (array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		System.out.println("Sorted array is:" + Arrays.toString(array));
	}

	public static void main(String[] args) {

		SortArray sa = new SortArray();
		sa.sortArrayBubble(new int[] { 3, 2, 8, 6, 9, 7 });
		sa.sortArrayBubble(new int[] { 3, 1, 2, 5, 4 });
		sa.sortArrayBubble(new int[] { -3, -2, -8, -6, -9, -7 });

	}

}
