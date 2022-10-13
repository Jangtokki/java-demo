package java_007_class.part07;

public class CountVarg {

	/* spread operator(...)
	 * 1 jdk5 이전 버젼에서는 특정 메소드를 정의할때 인자와 매게변수의 갯수 및 타입의 수를 정해놓고
	 * 호출할때 일치하지 않으면 오류가 발생했다.
	 * 2 이를 유연하게 처리할 수 있게 variable argument 기능을 제공해주고 있다.
	 * 3 리턴타입 메소드명(데이터 타입...가변 메게변수){ }
	 * 
	 * 
	 */
	void addValue(double...arr) {
		double sum =0;
		for(int i=0; i<arr.length; i++) {
			sum+= arr[i];
		}
		System.out.println(sum);
	}
	
	//고정매게변ㅅ와 가변메게변수가 같이 사용될때는
	//언제나 고정매게변수를 먼저 선언한다.
	void sumValue(String name, int...arr) {
		int sum =0;
		for(int i=0; i<arr.length; i++) {
			sum+= arr[i];
		}
		System.out.printf("name = %s, sum = %d", name, sum);
	}
}
