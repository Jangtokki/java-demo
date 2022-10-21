package java_014_api;

import java.util.Calendar;

public class java_149_System {

	public static void main(String[] args) {
		
	  
	     //Test tt = new TestExam();
	     //System.out.println(tt);
		
	     Test ts = Test.getInstance();
	     ts.prn();
	     
	     Calendar cal = Calendar.getInstance();
	     System.out.println(cal.toString());
	     
	     int year = cal.get(Calendar.YEAR);
	     int month = cal.get(Calendar.MONTH) + 1; //Month는 1월일때 0으로 리턴함
	     int date = cal.get(Calendar.DATE);
	     //int hour = cal.get(Calendar.HOUR); //12시간 단위로 표시
	     int hour = cal.get(Calendar.HOUR_OF_DAY); //24시간 단위
	     int minute = cal.get(Calendar.MINUTE);
	     int second = cal.get(Calendar.SECOND);
	     
	     System.out.printf("%d-%d-%d %d:%d:%d\n", year, month, date, hour, minute, second);
	     
	     //이번달의 마지막일 리턴
	     System.out.println(cal.getActualMaximum(Calendar.DATE));
	     
	     //오늘의 요일 리턴(일요일->1 토요일->7)
	     System.out.println(cal.get(Calendar.DAY_OF_WEEK));
	     
	     cal.add(Calendar.DATE, -5); //날짜 세팅을 조정함
	     System.out.println(cal.toString());
	     
	     cal.set(Calendar.YEAR, 2020); //년도 세팅을 바꿈
	     System.out.println(cal.toString());
	     
	}

}



	abstract class Test{
		private static TestExam te = new TestExam();
		abstract public void prn();
		
		public static Test getInstance() {
			return te;
		}
	}
	
	class TestExam extends Test{
		@Override
		public void prn() {
			
			System.out.println("prn");
		}
	}
