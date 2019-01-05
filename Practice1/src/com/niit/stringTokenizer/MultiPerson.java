package com.niit.stringTokenizer;

import java.util.ArrayList;

public class MultiPerson {

	public static void main(String[] args) {
		String str2 = "Ritesh, Student, ritesh.chatterjee@hotmail.com"
				+"\n Sailab, Student, sailabmishra@hotmail.com"
				+"\n Shahbaz, Student, shahbazahmad318@gmail.com";
		String []str = str2.split("\n");
//		for(String s : str){
//			System.out.println("---"+s.trim());
//		}
		ArrayList<Person> persons =new ArrayList<>();
//		Person p1 = new Person();
		for(String s : str){
			int i = 0;
			Person p1 = new Person();
//			System.out.println(s);
			String []val = s.split(",");
			for(String s1 : val){
//				System.out.println(s1);
				if(i==0){
					p1.setName(s1);
				}
	
				if(i==1){
					p1.setRole(s1);
				}
				
				if(i==2){
					p1.setEmail(s1);
				}
				i++;		
			}
			
		persons.add(p1);
		}
		
		System.out.println(persons);
	}
	

}
