package com.niit.PersonDetails;

import java.text.ParseException;
import java.util.ArrayList;

public class PersonParser {
	
	String str;
	public void setStr(String str) {
		this.str = str;
	}
	public ArrayList<Person> getPersons() throws ParseException{
		String []str2 = str.split("\n");
		ArrayList<Person> persons =new ArrayList<>();
		for(String s : str2){
			int i = 0;
			Person p1 = new Person();
			String []val = s.split(",");
			for(String s1 : val){
				if(i==0){
					p1.setName(s1);
				}
	
				if(i==1){
					p1.setRole(s1);
				}
				
				if(i==2){
					p1.setEmail(s1);
				}
				if(i==3){
					p1.setDob(s1);
				}
				i++;		
			}
			
		persons.add(p1);
		}
		
		return persons;
	}
	
}
