package com.niit.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import org.apache.log4j.Logger;

public class FileWriteDemo1 {
	
	public static Logger log = Logger.getLogger(FileWriteDemo1.class);
	
	public static void main(String[] args) {
		 ObjectOutputStream oos =null;
		 FileOutputStream fos =null;
		 File file = new File("test1.dat");
		 try{
			 fos = new FileOutputStream("Test1.dat");
			 oos = new ObjectOutputStream(fos);
			 oos.writeObject("HEllo World! Welcome TO JAVA!!!");
		 }
		 catch(FileNotFoundException e){
			 log.error(e);
		 }
		 catch(IOException e){
			 log.error(e);
		 }
		 finally{
			 try{
				 fos.close();
			 }
			 catch(IOException e){
				 log.error(e);
			 }
		 }

	}

}
