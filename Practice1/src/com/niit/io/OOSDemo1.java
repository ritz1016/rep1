package com.niit.io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.apache.log4j.Logger;

public class OOSDemo1 {
	
	public static Logger log = Logger.getLogger(OOSDemo1.class);
	
	public static void main(String[] args) {
		 ByteArrayOutputStream baos = new ByteArrayOutputStream();
		 ObjectOutputStream oos= null;
		 ByteArrayInputStream bais =null;
		 ObjectInputStream ois = null;
		 Person p = new Person("Ritesh", "Student", "ritz1016@gmail.com");
		 try{
			 oos = new ObjectOutputStream(baos);
			 oos.writeObject(p);
			 byte[] arr = baos.toByteArray();
//			 System.out.println(arr);
//			 ------------------------------------------------------------
			 bais =new ByteArrayInputStream(arr);
			 ois = new ObjectInputStream(bais);
			 Person p1 = (Person)ois.readObject();
			 System.out.println("The person values are: "+p1);
		 }
		 catch(IOException e){
			 log.error(e);
		 } catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			log.error(e);
		}
		 
		 finally{
			 try {
				baos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				log.error(e);;
			}
			 try {
				oos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				log.error(e);
			}
			 try {
				bais.close();
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
