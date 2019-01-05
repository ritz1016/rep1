package com.niit.PersonDetails;

import java.text.ParseException;
import java.util.ArrayList;

public class PersonParserApp {

	public static void main(String[] args) {
		PersonParser pp = new PersonParser();
		String str2 = "Ritesh, Student, ritesh.chatterjee@hotmail.com, 11-06-1995"
				+"\n Sailab, Student, sailabmishra@hotmail.com, 07-02-1995"
				+"\n Shahbaz, Student, shahbazahmad318@gmail.com, 12-02-1994";
		pp.setStr(str2);
		try{
			ArrayList<Person> persons = pp.getPersons();
			for(Person p : persons){
				System.out.println(p);
			}
			for(Person p : persons){
				System.out.println(p.toCSV());
			}
		}
		catch (ParseException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
	}

}
