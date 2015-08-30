package com.wbqa.Array;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

public class TestLargestNum {

	@Before
	public void setup() {
		System.out.println("*****Test Starts***********");
	}

	@Test
	public void testPositive() {
		LargestNumArray ln = new LargestNumArray();
		int actual = ln.findLargestNum(new int[] { 6, 3, 4, 2, 7 });
		int expected = 7;
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void testNegative() {
		LargestNumArray ln = new LargestNumArray();
		int actual = ln.findLargestNum(new int[] { -6, -3, -4, -2, -7 });
		int expected = -2;
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void testPosNeg() {
		LargestNumArray ln = new LargestNumArray();
		int actual = ln.findLargestNum(new int[] { 6, 3, 4, -2, -7 });
		int expected = 6;
		Assert.assertEquals(expected, actual);
	}

}
