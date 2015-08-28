package com.wbqa.loops;

import java.util.Scanner;

public class Factorial {
	int fact = 1;

	public int calFactorial(int num) {
		if(num<0)
		{
			System.out.println("Invalid Input");
			fact=0;
		}
		else
		{
		for (int i = num; i > 0; i--) {
			fact = fact * i;
		}
		System.out.println("Factorial is " + fact);
		}
		return fact;

	}
	
	public int recursiveFactorial(int num)
	{
		if(num==1)
			return 1;
		else
			fact=num * recursiveFactorial(num-1);
			return fact;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factorial f = new Factorial();
		System.out.println("Enter the number");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int result = f.calFactorial(num);
		int result1=f.recursiveFactorial(num);
		System.out.println(result1);

	}

}
