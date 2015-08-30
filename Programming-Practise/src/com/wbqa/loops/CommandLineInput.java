package com.wbqa.loops;

import java.util.Scanner;

public class CommandLineInput {

	public static void printCommLine() {
		System.out.println("Enter your name");
		Scanner s = new Scanner(System.in);
		String name = s.nextLine();
		System.out.println("Enter your age");
		int age = s.nextInt();
		System.out.println("Name is:" + name + "Age is:" + age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printCommLine();

	}

}
