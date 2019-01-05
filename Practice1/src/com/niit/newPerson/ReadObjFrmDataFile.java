package com.niit.newPerson;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import org.apache.log4j.Logger;
import com.niit.PersonDetails.Person;;

public class ReadObjFrmDataFile {

	static Logger log = Logger.getLogger(ReadObjFrmDataFile.class);
	
	public static void main(String[] args) {
		ObjectInputStream ois = null;
		FileInputStream fis =null;
		try{
			fis = new FileInputStream("C:\\Users\\Ritesh\\workspace\\MultiPersnFileIO\\personObj1.dat");
			ois = new ObjectInputStream(fis);
			System.out.println("The Object Contains: ");
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
