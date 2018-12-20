package com.niit.collection2;

import java.util.TreeSet;

public class StudentApp {

	public static void main(String[] args) {
		TreeSet<Student> students = new TreeSet<>();
		Student s1 = new Student(101, "Ritesh", 24);
		students.add(s1);
		students.add(new Student(102, "Sailab", 24));
		students.add(new Student(103, "Archi", 23));
		
		System.out.println("Set of the students : ");
		for(Student s : students){
			System.out.println(s);
		}

	}

}
