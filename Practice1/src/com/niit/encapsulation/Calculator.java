package com.niit.encapsulation;

public class Calculator {

	int val1;
	int val2;
	public void read(int v1, int v2)
	{
		val1=v1;
		val2=v2;
		
	}
	public int add()
	{
		int res;
		res = val1 + val2;
		return res;
		
	}
	public int sub()
	{
		int res;
		res= val1 - val2;
		return res;
	}
	public int mul()
	{
		int res;
		res = val1 * val2;
		return res;
	}
	public int div()
	{
		int res;
		res = val1 / val2;
		return res;
	}
	

}
