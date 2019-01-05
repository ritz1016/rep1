package com.niit.dateprac;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

import org.apache.log4j.Logger;

public class DatePrac {
	static Logger log = Logger.getLogger(DatePrac.class);
	public static void main(String[] args) {
		
		Date d = new Date();
		System.out.println("Date is : "+d);
		GregorianCalendar gc = new GregorianCalendar();
		System.out.println("The calender object is : "+gc);
		gc.set(Calendar.YEAR, 1985);
		gc.set(Calendar.MONTH, 00);
		gc.set(Calendar.DATE, 19);
		System.out.println("The calender object is : "+gc);
		Date d2 = gc.getTime();
		System.out.println("The new Date is : "+d2);
		DateFormat df = DateFormat.getDateInstance(DateFormat.LONG);
		System.out.println("The DateFormat is : "+df.format(d2));
		DateFormat df2 = DateFormat.getDateInstance(DateFormat.SHORT);
		System.out.println("The DateFormat is : "+df2.format(d2));
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MMMM-yyyy");
		System.out.println("The Simple Date Format : "+sdf.format(d2));
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the date in the format(dd-mm-yyyy)");
		String date = sc.next();
		try{
			Date d3 = sdf.parse(date);
			System.out.println("The date given by user: "+d3);
		}
		catch(ParseException e){
			log.error("Exception "+e);
		}
	}

}
