package com.calculator.EpamHT3;

public class Calculator 
{
	public int add(int num1,int num2)
	{
		return num1+num2;
	}
	public int subtract(int num1,int num2)
	{
		if(num1>num2)
			return num1-num2;
		else
			return num2-num1;
	}
	public int multiply(int num1,int num2)
	{
		return num1*num2;
	}
	public int division(int num1,int num2)
	{
		return num1/num2;
	}
}
