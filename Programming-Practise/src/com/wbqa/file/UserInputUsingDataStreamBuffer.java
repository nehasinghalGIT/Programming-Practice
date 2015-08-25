package com.wbqa.file;

import java.io.DataInputStream;
import java.io.IOException;

/*
 *   --> DatainputStream: Use this class to input 2 integer numbers and multiply them.
 */
public class UserInputUsingDataStreamBuffer {

	public static void calMultiplication() throws IOException {
		DataInputStream ds = new DataInputStream(System.in);
		System.out.println("Enter the first number");
		String input = ds.readLine();
		int num1 = Integer.parseInt(input);
		System.out.println("Enter the second number");
		input = ds.readLine();
		int num2 = Integer.parseInt(input);
		int mul = num1 * num2;
		System.out.println("Multiplication is:" + mul);
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		calMultiplication();

	}

}
