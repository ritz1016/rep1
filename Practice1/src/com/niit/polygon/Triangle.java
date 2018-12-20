package com.niit.polygon;

public class Triangle extends Polygon{
	public Triangle(){} 
	public Triangle(int l, int b){
		super(l,b);
	}
	public double getArea(){
		return (super.dim1*super.dim2)/2;
	}

}
