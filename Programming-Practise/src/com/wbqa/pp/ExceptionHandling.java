package com.wbqa.pp;

/* 
 * Created by Neha Singhal on 08/20/2015
 * a. Write a program that is expected to throw a null pointer exception 
 * and in turn handles it using try catch and finally.
 * 
 */

public class ExceptionHandling {

	public static void handleException() {

		try {
			String str = null;
			System.out
					.println("Example of NullPointerException" + str.length());
		}
		catch (NullPointerException np) {
			np.printStackTrace();
			System.out.println("Inside the catch block");
		}

		finally {
			System.out.println("Program Ends");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		handleException();

	}

}
