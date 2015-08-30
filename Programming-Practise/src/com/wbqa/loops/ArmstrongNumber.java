package com.wbqa.loops;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class ArmstrongNumber {

	LinkedList<Integer> stack = new LinkedList<>();
	int sum = 0;

	public int checkArmstrong(int num) {
		while (num > 0) {
			int n = (num % 10) * (num % 10) * (num % 10);
			stack.push(n);
			num = num / 10;

		}
		while (!stack.isEmpty()) {
			sum = sum + stack.pop();
		}
		return sum;
	}

	public static void main(String[] args) {

		ArmstrongNumber a = new ArmstrongNumber();
		System.out.println("Enter a 3-digit number");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int result = a.checkArmstrong(num);
		if (result == num)
			System.out.println("Number is Armstrong");
		else
			System.out.println("number is not armstrong");

	}

}
