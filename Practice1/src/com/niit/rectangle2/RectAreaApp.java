package com.niit.rectangle2;

import java.util.Scanner;

public class RectAreaApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Quadrilateral qd = null;
		System.out.println("Enter lenght and breadth of the rectangle: ");
		int len = sc.nextInt();
		int bre = sc.nextInt();
		if (len == bre){
			qd = new Quadrilateral(len);
		}
		else{
			qd = new Quadrilateral(len, bre);
		}
		int area = qd.areaCalc();
		System.out.println("Area of the rectangle: "+area);
		int perimeter = qd.periCalc();
		System.out.println("Perimeter of the rectangle: "+perimeter);
		sc.close();
	}

}
