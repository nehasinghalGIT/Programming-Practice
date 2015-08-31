package com.wbqa.Array;

public class LinearSearch {

	boolean flag = false;

	public void findElement(int[] array, int num) {
		int length = array.length;
		for (int i = 0; i < length; i++) {
			if (array[i] == num) {
				System.out.println("Element is present");
				flag = true;
				break;
			}
		}
		if (flag == false) {
			System.out.println("Element not present");
		}
	}

	public static void main(String[] args) {

		LinearSearch ls = new LinearSearch();
		ls.findElement(new int[] { 1, 2, 3, 4, 5, 6 }, 7);
	}

}
