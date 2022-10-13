package java_007_class.part06;

public class Calculator {

	/*오버로딩(overloading)
	 * 1. 단일 클래스에서 같은 이름의 메소드를 여러개 정의 하는 기능이다.
	 * 2. 오버로딩의 조건
	 * 		1)메소드의 이름이 같아야한다.
	 * 		2)매게변수와 갯수 또는 데이터 타입이 달라야한다.
	 * 		3)리턴타입은 오버로딩을 구분하는데 사용되지 않는다.
	 * 
	 * 
	 */
	void addValue(int x, int y) {
		System.out.println(x+y);
	}
	
	void addValue(int x, int y, int z) {
		System.out.println(x+y+z);
	}
	
	void addValue(double x, double y) {
		System.out.println(x+y);
	}
	
}
