package java_013_api;

import static java.lang.Math.*;

public class java_136_Math {

	public static void main(String[] args) {
		
		/* 난수를 이용해서 소수점 첫째자리까지 반올림해서 구하시오
		 * ex) 0.5689... > 5.7
		 */
		
		
		double ran = random();
		System.out.println(ran);
		
		ran = ran * 100;
		System.out.println(ran);
		
		System.out.println(round(ran));
		long data = round(ran);
		System.out.println(data);
		
		System.out.println("==========================");
		double num = (double)round(ran)/10;
		
		System.out.println(num);
		
		System.out.println("==========================");
		
		System.out.println((double)(round(random()*100))/10);
	}

}
