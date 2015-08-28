package com.wbqa.loops;

import java.util.Scanner;

public class SwapNumbers {

	int n1, n2,i=0;
	int[] result=new int[2];

	public int[] swapNumUsingThirdVar(int n1, int n2) {
		int temp;
		temp = n1;
		n1 = n2;
		n2 = temp;
		result[i]=n1;
		i++;
		result[i]=n2;
		printNum(n1, n2);
		return result;
	}

	public void swapNumWithoutThirdVar(int n1, int n2) {
		n1 = n1 + n2;
		n2 = n1 - n2;
		n1 = n1 - n2;
		printNum(n1, n2);
	}

	public void printNum(int n1, int n2) {
		System.out.println("Numbers After swapping:  " + " " + "n1=" + n1
				+ "n2=" + n2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the 1st number");
		int num1 = s.nextInt();
		int num2 = s.nextInt();
		SwapNumbers sn = new SwapNumbers();
		sn.swapNumUsingThirdVar(num1, num2);
		sn.swapNumWithoutThirdVar(num1, num2);

	}

}
