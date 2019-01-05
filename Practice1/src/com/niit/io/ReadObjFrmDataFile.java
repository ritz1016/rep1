package com.niit.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import org.apache.log4j.Logger;

import com.niit.newPerson.Person;

public class ReadObjFrmDataFile {

	static Logger log = Logger.getLogger(ReadObjFrmDataFile.class);
	
	public static void main(String[] args) {
		ObjectInputStream ois = null;
		FileInputStream fis =null;
		try{
			fis = new FileInputStream("personObj1.txt");
			ois = new ObjectInputStream(fis);
			com.niit.newPerson.Person p = (Person)ois.readObject();
			System.out.println("The Object Contains: ");
			System.out.println(p);
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
				log.error(e);
			}
			try {
				ois.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				log.error(e);
			}
		}

	}

}
