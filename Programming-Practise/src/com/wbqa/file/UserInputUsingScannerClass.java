package com.wbqa.file;

import java.util.Scanner;

/*
 * a. Write a program that takes input from user dynamically using below classes.
 --> Scanner: Use this class to input 2 integer numbers and sum them.

 */
public class UserInputUsingScannerClass {

	public static void calculateSum() {
		System.out.println("Enter the two numbers");
		Scanner s = new Scanner(System.in);
		int num1 = s.nextInt();
		int num2 = s.nextInt();
		int sum = num1 + num2;
		System.out.println("Sum of the entered numbers is :" + sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UserInputUsingScannerClass s = new UserInputUsingScannerClass();
		s.calculateSum();

	}

}
