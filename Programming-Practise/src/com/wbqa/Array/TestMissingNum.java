package com.wbqa.Array;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

public class TestMissingNum {

	@Before
	public void setup() {
		System.out.println("****Test Starts*****");
	}

	@Test
	public void testMissingNum() {
		MissingNumber mn = new MissingNumber();
		int actual = mn.findMissingNumber(new int[] { 1, 2, 3, 4, 6, 7 });
		int expected = 5;
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void testMissingNum1() {
		MissingNumber mn = new MissingNumber();
		int actual = mn.findMissingNumber(new int[] { 1, 2, 4, 5, 6 });
		int expected = 3;
		Assert.assertEquals(expected, actual);
	}
}
