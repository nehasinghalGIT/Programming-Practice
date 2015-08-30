package com.wbqa.loops;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestPrimeNumber {
	@Before
	public void setup() {
		System.out.println("-----Test Starts------");
	}

	@Test
	public void testFiboTen() {
		PrimeNumber pn = new PrimeNumber();
		int[] actual = f.printFibonacci(10);
		int[] expected = new int[] { 0, 1, 1, 2, 3, 5, 8, 13, 21, 34 };
		Assert.assertArrayEquals(expected, actual);
	}

	@Test
	public void testFiboFifteen() {
		Fibonacci f = new Fibonacci();
		int[] actual = f.printFibonacci(15);
		int[] expected = new int[] { 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89,
				144, 233, 377 };
		Assert.assertArrayEquals(expected, actual);

	}

	@Test
	public void testFiboFive() {
		Fibonacci f = new Fibonacci();
		int[] actual = f.printFibonacci(5);
		int[] expected = new int[] { 0, 1, 1, 2, 3 };
		Assert.assertArrayEquals(expected, actual);

	}



}
