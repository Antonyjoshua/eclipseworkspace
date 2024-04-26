package com.corejave;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Date_calender {

	public static void main(String[] args) {
		// date class is used to get the current time in java
		// it comes from util package
		Date d = new Date();
		System.out.println(d.toString());
		// to get the date in specific format use simpledateformat class
		SimpleDateFormat sdt = new SimpleDateFormat("YYYY/MM/dd ss-mm-HH");
		System.out.println(sdt.format(d));
		// Calender object and date class are similar. But calendar object has more
		// options
		// In Java, Calendar is an abstract class, which means you cannot directly
		// create instances of it using the new keyword. Abstract classes are meant to
		// be subclassed, and their concrete implementations are provided by subclasses.
		// The Calendar.getInstance() method returns an instance of a concrete subclass
		// of Calendar, such as GregorianCalendar, which you can use to work with dates
		// and times.
		Calendar instance = Calendar.getInstance();
		Calendar cd = new GregorianCalendar();
		System.out.println(instance.getTime());
		System.out.println(sdt.format(instance.getTime()));
		System.out.println(instance.getFirstDayOfWeek());
		System.out.println(instance.get(Calendar.AM_PM));
		System.out.println(instance.get(Calendar.DAY_OF_WEEK));
		System.out.println(instance.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println(instance.get(Calendar.DAY_OF_MONTH));
	}

}
