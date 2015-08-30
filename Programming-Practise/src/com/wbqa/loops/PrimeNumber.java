package com.wbqa.loops;

import java.util.Scanner;

public class PrimeNumber {

	boolean flag = true;

	public void findPrime(int num) {
		for (int i = 2; i < num; i++) {
			if ((num % i) == 0) {
				flag = false;
				System.out.println("Number is not prime");
				break;
			}
		}
		if (flag) {
			System.out.println("Number is prime");
		}
	}

	public static void main(String[] args) {
		PrimeNumber pn = new PrimeNumber();
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter the number");
		int num = s.nextInt();
		pn.findPrime(num);
	}

}
