package com.wbqa.Array;

import java.util.Arrays;

import org.apache.commons.lang.ArrayUtils;

public class MergeArray {

	public void mergeTwoArrays(int[] array1, int[] array2) {
		int array3[] = ArrayUtils.addAll(array1, array2);
		System.out.println("The merged array is:" + Arrays.toString(array3));
		int i = 0, j = 0, k = 0;
		int[] mergedArray = new int[array1.length + array2.length];
		while (i < array1.length && j < array2.length) {
			if (array1[i] < array2[j])

				mergedArray[k++] = array1[i++];

			else
				mergedArray[k++] = array2[j++];
		}
		while (i < array1.length)
			mergedArray[k++] = array1[i++];
		while (j < array2.length)
			mergedArray[k++] = array2[j++];
		System.out.println("The merged array is:"
				+ Arrays.toString(mergedArray));

	}

	public static void main(String[] args) {
		MergeArray ma = new MergeArray();
		ma.mergeTwoArrays(new int[] { 1, 5 }, new int[] { 2, 4, 7 });
	}

}
