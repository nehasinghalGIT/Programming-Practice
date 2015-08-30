package com.wbqa.Array;

public class MissingNumber {

	int sum = 0, missingNum;

	public int findMissingNumber(int[] array) {
		int length = array.length;
		for (int i = 0; i < length; i++) {
			sum += array[i];
			// We need to take the missind number in account, therefore length+1
			int actualSum = ((length + 1) * (length + 2)) / 2;
			missingNum = actualSum - sum;
		}
		return missingNum;
	}

	public static void main(String[] args) {

		MissingNumber mn = new MissingNumber();
		int actual = mn.findMissingNumber(new int[] { 1, 2, 3, 4, 6, 7 });
		System.out.println("Missing Number is:" + actual);

	}

}
