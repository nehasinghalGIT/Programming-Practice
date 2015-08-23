package com.wbqa.collection;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/* Unit Test cases for removing duplicates from Array using set*/

public class ArrayToSetTest {

	@Before
	public void setup() {
		System.out.println("**********Test starts*******************");
	}

	@Test
	public void testpositiveDups() {
		ArrayToSet as = new ArrayToSet();

		int[] actual = as.findDups(new int[] { 1, 2, 3, 4, 2 });
		int[] expected = { 1, 2, 3, 4 };
		Assert.assertArrayEquals(expected, actual);

	}

	@Test
	public void testnegativeDups() {
		ArrayToSet as = new ArrayToSet();

		int[] actual = as.findDups(new int[] { -1, -2, -3, -4, -2 });
		int[] expected = { -1, -2, -3, -4 };
		Assert.assertArrayEquals(expected, actual);

	}

	@Test
	public void testPosNegDups() {
		ArrayToSet as = new ArrayToSet();

		int[] actual = as.findDups(new int[] { 1, -2, 3, 4, -2, 1 });
		int[] expected = { 1, -2, 3, 4 };
		Assert.assertArrayEquals(expected, actual);

	}

	@After
	public void teardown() {
		System.out.println("****************Test Ends******************");
	}

}
