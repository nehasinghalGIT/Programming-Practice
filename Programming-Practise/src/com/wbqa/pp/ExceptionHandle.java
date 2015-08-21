package com.wbqa.pp;

/*
 * Created by Neha Singhal */
/* 
 * b. Write a program containing a function which is expected 
 * to throw any kind of exception say NullPointerException or
 *  ArithmeticException etc and then handle this function in the parent
 *   function which calls this function.*/

public class ExceptionHandle {

	public static void handleException() throws NullPointerException {

		try {
			String str = null;
			System.out
					.println("Example of NullPointerException" + str.length());
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
