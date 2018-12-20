package com.niit.rectangle;

import java.util.Scanner;

public class RectAreaApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Rectangle ra = new Rectangle();
		System.out.println("Enter lenght and breadth of the rectangle: ");
		int len = sc.nextInt();
		int bre = sc.nextInt();
		ra.setDimension(len, bre);
		int area = ra.areaCalc();
		System.out.println("Area of the rectangle: "+area);
		int perimeter = ra.periCalc();
		System.out.println("Perimeter of the rectangle: "+perimeter);
		sc.close();
	}

}
