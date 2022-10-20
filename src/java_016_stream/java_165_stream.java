package java_016_stream;

import java.util.Scanner;

public class java_165_stream {

	public static void main(String[] args) {

		System.out.println("[순번 이름 평균]입력 : ");
		Scanner sc =  new Scanner(System.in);
		int num;	//순번
		String name; //이름
		double avg; //평균
		
		//순번:10
		//이름:홍길동
		//평균:9.5
		
		
		num = sc.nextInt();
		name = sc.next();
		avg = sc.nextDouble();
		
		System.out.printf("순번: %d\n이름: %s\n평균: %.1f", num, name, avg);
		
	}

}
