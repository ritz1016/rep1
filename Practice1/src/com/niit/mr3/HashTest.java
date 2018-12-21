package com.niit.mr3;

import java.util.HashMap;

public class HashTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, Employee> empMap = new HashMap<>();
		empMap.put(101, new Employee(101,"Kishor",45345));
		empMap.put(102, new Employee(102,"Kumar",655656));
		empMap.put(103, new Employee(103,"Radhika",86886));
		
		System.out.println("Employees : "+empMap);

	}

}
