package com.wbqa.pp;

/*Created by Neha Singhal
 * 
 * b. Write a program to print 1 to 10 
 * numbers without using loops and you should not have more than 1 print statement.
 */

public class PrintNums {

	static int i = 0;

	static {
		try {
			recurse();
		} catch (Throwable t) {
			System.exit(0);
		}
	}

	private static void recurse() {
		System.out.println(++i + 0 / (i - 11) + "");
		recurse();
	}

	public static void main(String[] args) {
		recurse();
	}

}
