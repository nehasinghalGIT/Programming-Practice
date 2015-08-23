package com.wbqa.collection;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/*Unit test class for CreateHashMap*/

public class HashMapTest {

	@Before
	public void setUp() throws Exception {
		System.out.println("*******Test Starts************");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("**********Test Ends***********");
	}

	@Test
	public void testfirstVal() {
		CreateHashMap hm = new CreateHashMap();
		hm.addElements();
		String actual = hm.searchKey("Shelly");
		String expected = "Smith";
		Assert.assertEquals(expected, actual);

	}

	@Test
	public void testsecondVal() {
		CreateHashMap hm = new CreateHashMap();
		hm.addElements();
		String actual = hm.searchKey("Lucy");
		String expected = "wick";
		Assert.assertEquals(expected, actual);

	}

	@Test
	public void testthirdVal() {
		CreateHashMap hm = new CreateHashMap();
		hm.addElements();
		String actual = hm.searchKey("Terry");
		String expected = "Saad";
		Assert.assertEquals(expected, actual);

	}
	
	

}
