package com.niit.polygon;

public class Rectangle extends Polygon{
	public Rectangle(){}
	public Rectangle(int l, int b){
		super(l,b);
	}
	public double getArea(){
		return (super.dim1 * super.dim2);
	}

}
