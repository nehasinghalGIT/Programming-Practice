package com.wbqa.pp;

/*  c. Write a program implementing explicit garbage collection.
 *
 */

public class GarbageCollection {

	public void garCollExam() {
		System.out.println("Inside the fucntion");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GarbageCollection gc = new GarbageCollection();
		GarbageCollection gc1 = new GarbageCollection();
		gc.garCollExam();
		gc1.garCollExam();
		gc1 = gc;
		System.gc();

	}

}
