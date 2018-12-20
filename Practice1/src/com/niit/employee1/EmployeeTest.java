package com.niit.employee1;

//import java.util.Scanner;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Worker w = new Worker(101, "Ritesh");
		Supervisor s = new Supervisor(101, "Ritesh", 5);
		Manager m = new Manager(101, "Ritesh", "B.Tech");
		System.out.println(w.toString());
		System.out.println(s.toString());
		System.out.println(m.toString());
//		Employee a = new Worker(101, "Ritesh");
//		Employee b = new Supervisor(101, "Ritesh", 5);
//		Employee c = new Manager(101, "Ritesh", "B. Tech");
//		System.out.println(a.toString());
//		System.out.println(b.toString());
//		System.out.println(c.toString());

	}

}
