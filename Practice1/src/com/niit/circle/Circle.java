package com.niit.circle;

public class Circle {
	int radius;
	double area;
	double perimeter;
	public static final double PI = (double)22/7;
	public void setDimensions(int r)
	{
		radius = r;
	}
	public double getPi()
	{
		return PI;
	}
	public double getArea()
	{
		area = PI * radius * radius;
		return area;
	}
	public double getPerimeter()
	{
		perimeter = 2 * PI * radius;
		return perimeter;
	}

}
