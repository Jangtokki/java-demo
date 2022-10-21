package java_014_api;

import java.util.Calendar;

public class java_151_System {

	public static void main(String[] args) {
		
		//수능일 : 2022-11-17
		//오늘 : 2022-10-20
		//남은일 : 15
		
		Calendar cal = Calendar.getInstance();
		int eDay_year = 2022;
		int eDay_month = 11;
		int eDay_date = 17;
		
		cal.set(Calendar.YEAR, eDay_year);
		cal.set(Calendar.MONTH, eDay_month);
		cal.set(Calendar.DATE, eDay_date);
		
		Calendar toDay = Calendar.getInstance();
		long eventDay = cal.getTimeInMillis();
		long nowDay = toDay.getTimeInMillis();
		
		long endDay = (eventDay-nowDay)/(60*60*24*1000);
		
		System.out.println(endDay);
		
		
		
		System.out.printf("수능일 : %d-%d-%d\n", eDay_year, eDay_month, eDay_date);
		
		System.out.printf("오늘 : %d-%d-%d\n", toDay.get(Calendar.YEAR),toDay.get(Calendar.MONTH), toDay.get(Calendar.DATE));
		
		System.out.printf("남은일 : %d일", endDay);
		
	}

}
