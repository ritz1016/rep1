package com.niit.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import org.apache.log4j.Logger;

public class FileReadDemo1 {
	public static Logger log = Logger.getLogger(FileReadDemo1.class);
	
	public static void main(String[] args){
		ObjectInputStream ois = null;
		FileInputStream fis = null;
		try{
			fis =new FileInputStream("Test1.dat");
			ois = new ObjectInputStream(fis);
			String str = (String)ois.readObject();
			System.out.println("File Contains : ");
			System.out.println(str);
		}
		catch(FileNotFoundException e){
			log.error(e);
		}
		catch(IOException e){
			log.error(e);
		}
		catch(ClassNotFoundException e){
			log.error(e);
		}
		finally{
			try{
				ois.close();
			}
			catch(IOException e){
				log.error(e);
			}
		}
		System.out.println("Thank you");

	}
}
