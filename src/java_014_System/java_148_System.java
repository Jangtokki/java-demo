package java_014_System;

import java.text.SimpleDateFormat;

public class java_148_System {

	public static void main(String[] args) {
		
		//currentTimeMillis(): 1970. 1. 1 부터 초단위로
		//누적한 값을 필리세컨드로 리턴한다.
		//하루는 86400초이다. 1초는 1000밀리세컨드이다.
		long curr = System.currentTimeMillis();
		System.out.println(curr);
		
		String pattern = "yyyy-MM-dd HH:mm:ss a E";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		
		String date = sdf.format(curr);
		System.out.println(date);
	}

}
