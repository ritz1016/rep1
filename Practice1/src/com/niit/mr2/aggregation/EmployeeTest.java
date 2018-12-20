package com.niit.mr2.aggregation;

import java.util.Scanner;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		Employee e1 = new Employee();
//		e1.setId(101);
//		e1.setName("Ritesh");
//		e1.setDesignation("Trainee");
//		Address a1 = new Address(101, "Konnagar", "Ghatal", "721212");
//		e1.setAddress(a1);
		System.out.println("Enter Id, Name, Designation of Employee Serially: ");
		int id = sc.nextInt();
		String name = sc.next();
		String designation = sc.next();
		Address address = new Address();
		System.out.println("Enter House No., Street, City, Pincode of The Employee");
		address.hno= sc.nextInt();
		address.street = sc.next();
		address.city = sc.next();
		address.pin = sc.next();
		Employee e1 = new Employee(id, name, designation, address);
		System.out.println("e1 : "+e1);
//		Employee e2 = new Employee(101, "Ritesh", "Trainee", new Address(101, "Konnagar", "Ghatal", "721212"));
//		System.out.println("e2 : "+e2);
		sc.close();
	}

}
