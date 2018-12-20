package com.niit.rectangle;

public class Rectangle {
	int length;
	int breadth;
	int area;
	int peri;
	public void setDimension(int l, int b)
	{
		length = l;
		breadth = b;
	}
	public int areaCalc()
	{
		area = length * breadth;
		return area;
	}
	public int periCalc()
	{
		peri = 2 * (length + breadth);
		return peri;
	}

}
