package java_013_api;

import java.util.Scanner;

public class java_140_Scanner {

	public static void main(String[] args) {
		
		//콘솔창으로 데이터를 읽어보기 위해서 콘솔창과 연결
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름:");
		
		//String name = sc.next(); //한단어씩 출력
		String name = sc.nextLine(); //한 라인으로 출력
		
		System.out.println(name);
		
	}

}
