package com.niit.rectangle2;

public class Quadrilateral {
	int length;
	int breadth;
	int area;
	int peri;
	public Quadrilateral()
	{}
	public Quadrilateral(int l, int b) 
	{
		length = l;
		breadth = b;
	}
	public Quadrilateral(int l){
		length = breadth = l;
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
