package com.niit.mr2;

import java.util.Scanner;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Employee e;
		System.out.println("Enter Id, Name, Designation of Employee Serially: ");
		int id = sc.nextInt();
		String name = sc.next();
		String designation = sc.next();
		e = new Employee();
		e = new Employee(id,name,designation);
		System.out.println(e.toString());
		sc.close();
	}

}
