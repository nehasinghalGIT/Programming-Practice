package com.wbqa.loops;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

public class TestFactorial {

	@Before
	public void setup() {
		System.out.println("-----Test Starts------");
	}

	@Test
	public void testFactPositive() {
		Factorial f = new Factorial();
		int actual = f.calFactorial(4);
		int expected = 24;
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void testFactNegative() {
		Factorial f = new Factorial();
		int actual = f.calFactorial(-4);
		int expected = 0;
		Assert.assertEquals(expected, actual);
	}

	}
