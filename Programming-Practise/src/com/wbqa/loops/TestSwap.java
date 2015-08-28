package com.wbqa.loops;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestSwap {
	
	@Before
	public void setup()
	{
		System.out.println("*****Test Starts************");
	}
	
	@Test
	public void testSwapPositive()
	{
		SwapNumbers s=new SwapNumbers();
		int[] actual=s.swapNumUsingThirdVar(2, 3);
		int[] expected=new int[]{3,2};
		Assert.assertArrayEquals(expected, actual);
	}
	
	@Test
	public void testSwapNegative()
	{
		SwapNumbers s=new SwapNumbers();
		int[] actual=s.swapNumUsingThirdVar(-2, -3);
		int[] expected=new int[]{-3,-2};
		Assert.assertArrayEquals(expected, actual);
	}


}
