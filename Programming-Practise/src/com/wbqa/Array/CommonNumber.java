package com.wbqa.Array;

import java.util.Arrays;

public class CommonNumber {

	public void findCommon(int[] arr1, int[] arr2) {
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		int len1 = arr1.length;
		int len2 = arr2.length;
		for (int i = 0; i < len1; i++) {
			for (int j = 0; j < len2; j++) {
				if (arr1[i] == arr2[j])
					System.out.println("Common element is:" + arr1[i]);
				continue;
			}
		}
	}

	public static void main(String[] args) {

		int[] arr1 = new int[] { 3, 2, 1, 4, 5 };
		int[] arr2 = new int[] { 3, 7, 8, 9, 2 };
		CommonNumber cn = new CommonNumber();
		cn.findCommon(arr1, arr2);

	}

}
