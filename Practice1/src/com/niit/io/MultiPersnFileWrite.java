package com.niit.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import org.apache.log4j.Logger;

public class MultiPersnFileWrite {

	static Logger log = Logger.getLogger(MultiPersnFileWrite.class);
	
	public static void main(String[] args) {
		 ObjectOutputStream oos = null;
		 FileOutputStream fos = null;
		 try{
			 fos = new FileOutputStream("persons1.dat");
			 oos = new ObjectOutputStream(fos);
			 Person p1 = new Person("Ritesh", "Student", "ritz1016@gmail.com");
			 Person p2 = new Person("Sailab", "Student", "sailabmishra@gmail.com");
			 Person p3 = new Person("Titiksha", "Student", "adtitksha@gmail.com");
			 Person p4 = new Person("Anupama", "Student", "anupama@gmail.com");
			 Person p5 = new Person("Shreema", "Student", "shreema@gmail.com");
			 Person p6 = new Person("Apoorva", "Student", "apoorva@gmail.com");
			 ArrayList<Person> persons = new ArrayList<>();
			 persons.add(p1);
			 persons.add(p2);
			 persons.add(p3);
			 persons.add(p4);
			 persons.add(p5);
			 persons.add(p6);
			 
			 for(Person p : persons){
				 oos.writeObject(p);
			 }
		 }
		 catch(IOException e){
			 log.error(e);
		 }
		 finally{
			 try {
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				log.error(e);
			}
			 try {
				oos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				log.error(e);
			}
		 }

	}

}
