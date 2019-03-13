package com.niit.trainingCourse;

import java.util.Collections;
import java.util.List;

public class StudentBO {
	
	public void addStudent(List<Student> studentList, Student student) {
	 	 /*Add the student to the list */
		studentList.add(student);
	}
	public void printAllStudents(List<Student> studentList){
		//Print All the students' details
		for(Student s :studentList){
			System.out.println(s);
		}
	}
	public void printStudentByCourse(List<Student> studentList, String course){ 
	 	//Printing the students details with the specified course
		for(Student s :studentList){
			if(s.getCourse().compareTo(course)==0){
				System.out.println(s);
			}
		}
	}
	public void printStudentByIncreasingAge(List<Student> studentList){ 
	 	//Printing the students details in ascending order of age
		Collections.sort(studentList);
		for(Student s :studentList){
			System.out.println(s);
		}
	}
	public void removeStudentByName(List<Student> studentList, String studentName){  
		/*Remove a Student from the list by studentName
		If the specified studentId is not found,print "Student with <<id>> not found" */
		for(Student s :studentList){
			if(s.getName().compareTo(studentName)==0){
				studentList.remove(s);
			}
		}
	}
	public void removeStudentByCourse(List<Student> studentList, String course){
	 	 /*Remove all the students from the list with the same course
		If the specified course is not found,print "Student or course <<course>> not found" */
		for(Student s :studentList){
			if(s.getCourse().compareTo(course)==0){
				studentList.remove(s);
			}
		}
	}
	






	
}
