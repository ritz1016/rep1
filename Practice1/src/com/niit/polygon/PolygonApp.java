package com.niit.polygon;

public class PolygonApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Polygon t = new Triangle(9, 6);
		Polygon r = new Rectangle(9, 6);
		System.out.println(t.toString());
		System.out.println("area="+t.getArea());
		System.out.println(r.toString());
		System.out.println("area="+r.getArea());
		
	}

}
