package java_013_api;

import static java.lang.Math.*;

public class java_135_Math {

	public static void main(String[] args) {
		
		//임의값 0.0 <= x < 1.0
		double ran = random();
		System.out.println(ran);
		
		//0.00 <= x < 9.99
		ran = ran * 10;
		System.out.println(ran);
		
		//소수점 이하는 버림 (0.0~9.0 을 리턴)
		int num = (int)floor(ran); //floor 소수점이하 버림/ round(ran) 반올림 / ceil(ran)
		
		System.out.println(num);
		
		num= num +1;
		System.out.println(num);
		
		System.out.println("==========================");
		System.out.println((int)(floor(random()*10))+1);
		
		
		
	}

}
