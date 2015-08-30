package com.wbqa.file;

import java.io.Console;

public class UserInputFromConsole {
	
	public static void calDivision() throws Exception
	{
		Console c=System.console();
		System.out.println("Enter the first number");
		String input=c.readLine();
		//int num1=Integer.parseInt(input);
		//System.out.println("Enter the second number");
		//input=console.readLine();
		//int num2=Integer.parseInt(input);
		//int div=num1/num2;
		System.out.println("Division is :" + input);

	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		calDivision();
		
		

	}

}
