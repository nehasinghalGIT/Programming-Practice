package com.wbqa.Array;

/*  	   a. Write a program to find the largest number in a given array.*/

public class LargestNumArray {

	int max = Integer.MIN_VALUE;

	public int findLargestNum(int[] array) {
		int length = array.length;
		for (int i = 0; i < length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {

		LargestNumArray ln = new LargestNumArray();
		LargestNumArray ln1 = new LargestNumArray();
		int largest = ln.findLargestNum(new int[] { 3, 2, 6, 4, 8, 1 });
		System.out.println("Largest number is:" + largest);
		int large = ln1.findLargestNum(new int[] { -3, -2, -6, -4, -8, -1 });
		System.out.println("Largest number is:" + large);

	}

}
