package basic;

/*
 * 리터널(literal) : 그 자체의 값 (1, 2, 3 ,,,'a' , 'b' , true, false)
 * 변수 : 하나의 값을 저장하기 위한 메모리공간
 * 자바에서 제공하는 데이터타입
 * 1. primitive DataType : 기본 데이터 타입
 * 		문자 - char(2byte)
 * 		숫자 - 정수 - byte(1byte), short(2byte), int(4byte), long(8byte)
 * 		    - 실수 - float(4byte), double(8byte)
 * 		논리 - boolean(1byte)		
 * 
 * 
 * 2. Reference DataType : 참조 데이터 타입
 * 		Array, Class, Interface
 * 
 * 시스템에서 인식하는 데이터 타입 크기
 * byte < char, short < int < long < float < double
 * 
 */

public class java_003_type {
	public static void main(String[] args) {

		// #변수선언
		int data; // 데이터타입 변수명;

		// #값을 변수에 할당
		data = 3; // 데이터 변수에 3값을 할당(저장)

		// int data = 3; => 변수선언과 값을 한번에

		System.out.println(data);

		// data변수에 새로운 값 할당
		data = 10;
		System.out.println(data);

		// double avg =4;
		// int num = 4.0; error => 변수의 타입과 값의 크기 타입이 일치해야한다

		System.out.println("================");

		int x = 0101; // 숫자앞에 0이 붙으면 8진수로 표기됌
		System.out.println(x); //65

		int y = 65; //10진수
		System.out.println(y); //65

		int z = 0B101; //2진수
		System.out.println(z); //5
		
		int k = 0x101; //16진수
		System.out.println(k); //257
	}
}
