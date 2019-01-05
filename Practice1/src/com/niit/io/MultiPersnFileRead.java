package com.niit.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import org.apache.log4j.Logger;

import com.niit.io.Person;

public class MultiPersnFileRead {

	static Logger log = Logger.getLogger(MultiPersnFileRead.class);
	
	public static void main(String[] args) {
		 FileInputStream fis =null;
		 ObjectInputStream ois = null;
		 try{
			 fis = new FileInputStream("persons1.dat");
			 ois = new ObjectInputStream(fis);
			 System.out.println("List of Persons : ");
			 while(fis.available()>0){
				 Person p = (Person)ois.readObject();
				 System.out.println(p);
			 }
		 }
		 catch(IOException e){
			 log.error(e);
		 }
		 catch(ClassNotFoundException e){
			 log.error(e);
		 }
		 finally{
			 try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 try {
				ois.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }

	}

}
