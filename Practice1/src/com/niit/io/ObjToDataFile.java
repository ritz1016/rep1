package com.niit.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import org.apache.log4j.Logger;

public class ObjToDataFile {

	static Logger log = Logger.getLogger(ObjToDataFile.class);
	
	public static void main(String[] args) {
		 FileOutputStream fos = null;
		 ObjectOutputStream oos = null;
		 Person p = new Person("Ritesh", "Student", "ritz1016@gmail.com");
		 Person p2 = new Person("Ritesh2", "Student2", "ritz10161@gmail.com");
		 try{
			 fos= new FileOutputStream("Test2.dat");
			 oos = new ObjectOutputStream(fos);
			 oos.writeObject(p);
			 oos.writeObject(p2);
		 }
		 catch(IOException e){
			 log.error(e);
		 }
		 finally{
			 try {
				oos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				log.error(e);
			}
			 try {
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				log.error(e);
			}
		 }

	}

}
