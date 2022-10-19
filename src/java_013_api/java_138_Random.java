package java_013_api;

import java.util.Random;

public class java_138_Random {

	public static void main(String[] args) {
		
		Random ran = new Random();
		double r1 = ran.nextDouble();
		System.out.println(r1*10);
		
		int r2 = ran.nextInt();
		System.out.println(r2);
		
		int r3 = ran.nextInt(100); //0~100 사이 난수
		System.out.println(r3);
		
		
	}

}
