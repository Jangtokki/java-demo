package ncs.test03;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateTest {

	public static void main(String[] args) {

		Calendar cdBirth = new GregorianCalendar(1987, 05 - 1, 27);
		SimpleDateFormat Birth = new SimpleDateFormat("생일:yyyy년MM월dd일");

		Calendar cdNow = new GregorianCalendar(2016, 04 - 1, 18);
		SimpleDateFormat Now = new SimpleDateFormat("현재:yyyy년MM월dd일");

		int nYear = cdNow.get(Calendar.YEAR);
		int bDay = cdBirth.get(Calendar.DAY_OF_WEEK);
		int bYear = cdBirth.get(Calendar.YEAR);

		String week = " ";
		switch (bDay) {
		case 1:
			week = "일요일";
			break;
		case 2:
			week = "월요일";
			break;
		case 3:
			week = "화요일";
			break;
		case 4:
			week = "수요일";
			break;
		case 5:
			week = "목요일";
			break;
		case 6:
			week = "금요일";
			break;
		case 7:
			week = "토요일";
			break;
		}
		

		System.out.println(Birth.format(cdBirth.getTime()) + week);
		System.out.println(Now.format(cdNow.getTime()));
		System.out.println("나이:" + (nYear - bYear) + "세");

	}

}
