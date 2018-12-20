package com.niit.circle;

import java.util.Scanner;

public class CircleMain {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Circle cm = new Circle();
		System.out.println("Enter the radius of the circle: ");
		int rad = sc.nextInt();
		cm.setDimensions(rad);
		double area = cm.getArea();
		System.out.println("The area of the circle with radius "+rad+" is "+area);
		double perimeter = cm.getPerimeter();
		System.out.println("The perimeter of the circle with radius "+rad+" is "+perimeter);
		sc.close();
		System.out.println("pi = "+cm.getPi());

	}

}
