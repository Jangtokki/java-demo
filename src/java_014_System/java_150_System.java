package java_014_System;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class java_150_System {

	public static void main(String[] args) {

		//long curr = System.currentTimeMillis();
		Calendar cal = Calendar.getInstance();
		int year = 2016;
		int month = 2;
		cal.set(Calendar.YEAR, 2016);
		cal.set(Calendar.MONTH, 2);
		 int date = cal.getActualMaximum(Calendar.DATE);
		    cal.set(Calendar.DATE, date);
		int day = cal.get(Calendar.DAY_OF_WEEK);
		
		//System.out.println(day);
		char week = ' ';
		switch(day) {
		case 5: week= '목'; break;
		}
		
		
		
		
	    
	  
	     
//	     String pattern = "EEE";
//	     SimpleDateFormat sdf = new SimpleDateFormat(pattern);
//	     String data = sdf.format(curr);
	     
	     System.out.printf("%d-%d-%d-%c요일", year, month, date, week);
	}

}
