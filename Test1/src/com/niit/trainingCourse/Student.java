package com.niit.trainingCourse;

public class Student implements Comparable<Student>{
	
	private String name;
	private String address;
	private String course;
	private int age;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name, String address, String course, int age) {
		super();
		this.name = name;
		this.address = address;
		this.course = course;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
//		return "Student [name=" + name + ", address=" + address + ", course=" + course + ", age=" + age + "]";
		return String.format("%-30s%-50s%-30s%-6d", name,address, course, age);
	}
	
		
}
