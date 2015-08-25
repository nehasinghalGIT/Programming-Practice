package com.wbqa.file;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 *  BufferedReader and InputStreamReader: 
 *  Use this classes to input 2 integer numbers and subtract them.
*/
public class UserInputUsingBufferedReader {

	public static void calculateDifference() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the first number");
		String input = br.readLine();
		int num1 = Integer.parseInt(input);
		System.out.println("Enter the second number");
		input = br.readLine();
		int num2 = Integer.parseInt(input);
		int diff = num1 - num2;
		System.out.println("Difference is : " + diff);
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		calculateDifference();
	}

}
