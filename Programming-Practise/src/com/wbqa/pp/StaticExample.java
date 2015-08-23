package com.wbqa.pp;

/*e. Write a program that contains a constructor, a static block 
 * and a static method. Execute the program in order to verify 
 * the order to execution of methods and block.
 */

public class StaticExample {

	public StaticExample() {
		System.out.println("Inside constructor ");
	}

	static {
		System.out.println("Inside the static block ");
	}

	public static void printI() {
		System.out.println("Inside static method ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticExample se = new StaticExample();
		printI();

	}

}
