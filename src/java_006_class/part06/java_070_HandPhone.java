package java_006_class.part06;

public class java_070_HandPhone {

	public static void main(String[] args) {
		
		/* 1. HandPhone hp : stack area 에 4바이트 메모리 생성
		 * 2. new : heap area에 객체를 생성
		 * 3. HandPhone() : heap area에 생성된 멤버변수에 초기값을 할당
		 * 4. = : heap 영억에 생성된 객체의 메모리 주소를 stack area에 할당
		 * 
		 * 
		 */
		
		//HandPhone hp = new HandPhone("홍길동", "010-2222-3333");
		
		HandPhone hp = new HandPhone("홍길동");
		hp.display();
	}

}
