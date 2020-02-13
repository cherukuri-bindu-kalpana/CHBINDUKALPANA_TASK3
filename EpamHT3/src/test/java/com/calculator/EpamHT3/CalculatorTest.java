package com.calculator.EpamHT3;

import org.junit.Test;

import junit.framework.TestCase;

public class CalculatorTest extends TestCase 
{
	Calculator calculator=new Calculator();
	@Test
	public void testadd()
	{
		assertEquals(100,calculator.add(60, 40));
	}
	@Test
	public void testsubtract()
	{
		assertEquals(1000,calculator.subtract(2000, 1000));
	}
	@Test
	public void testmultiply()
	{
		assertEquals(2400,calculator.multiply(60, 40));
	}
	@Test
	public void testdivision()
	{
		assertEquals(2,calculator.division(50, 20));
	}

}
