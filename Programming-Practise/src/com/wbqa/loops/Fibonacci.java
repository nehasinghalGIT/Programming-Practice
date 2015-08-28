package com.wbqa.loops;

import java.util.Arrays;
import java.util.Scanner;

/* 	  	a. Write a program that prints a fibonaci series that is a sequence 
 * of numbers like0 1 1 2 3 5 8.You can vary the number of elements to be 
 * printed meaning you can print 10 numbers or 15 or 20 or any desired number.
 */

public class Fibonacci {

	public int[] printFibonacci(int num) {
		int sum = 0, prev = 0, next = 1;
		int[] array = new int[num];
		for (int i = 0; i < num; i++) {
			array[i] = prev;
			sum = prev + next;
			prev = next;
			next = sum;
		}
		return array;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fibonacci f = new Fibonacci();
		System.out
				.println("how many numbers in the fibonacci series you want to print");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int[] fibo = new int[num];
		fibo = f.printFibonacci(num);
		System.out.println("The series is:" + Arrays.toString(fibo));

	}

}
