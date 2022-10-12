package method;

/*
 * method : 
 * 1 값을 계산하기 위해서 사용되는 기능
 * 2 객체의 동작을 처리하기 위한 기능이다
 * 
 * method 정의 : 선언부 + 구현부
 * 반환자료형 메소드명(데이터타입 매게변수) => 메소드 선언부
 * {
 * 		메소드가 호출되었을때 실행 구문;		
 * 		return 값;
 * 
 * } => 메소드 구현부
 * 
 * 매게변수 = parameter
 * 인수 = argument
 * 
 * 1 리턴값이 없고 매게변수도 없는 형태
 * 	void add( ){
 * 		int X = 10;
 * 		int y = 20;
 * 		if(x<0)
 * 		return;
 * 		System.out.println(x+y);
 * 	}
 * 
 * add( ) => 호출
 * 
 * 
 * 2 리턴값은 있고 매게변수는 없는 형태
 * 
 * 	double avg( ){
 * 		int x =10;
 * 		int y =20;
 * 		return (x+y)/2;			
 * }
 * 
 * 
 * 3 리턴값은 없고 매게변수는 있는 형태
 * 	void plus(int x, int y) {
 * 		System.out.println(x+y);
 * }
 * 
 * plus(10, 20); => 호출
 * 
 * 
 * 4 리턴값이 있고 메게변수도 있는 형태
 * 	double avg (int x, int y) {
 * 		return (x + y)/2.0;
 * }
 * 
 * avg(10, 20); => 호출
 * 
 * 
 * 
 */

public class java_052_method {
	
	/* 프로그램 실행을 하면
	 * JVM(자바가상머신)에서 main스레드가 main()메소드를 호출한다.
	 * 
	 * JVM은 운영채제에 특화된 코드로 변환하여 실행한다. 즉 자바 프로그램 실행환경을 만들어 주는 소프트웨어이다.
	 * 
	 */
	
	
 public static void main(String[] args) { // 실행순서 1
	
	 System.out.println("main start"); //2
	 makeTest(); 						//3
	 System.out.println("main end"); //7
	 
 }										//8
 
	 public static void makeTest() {	//4
		 
		 System.out.println("makeTest"); //5
	 }									//6
	 
	 
	 
	 
	 

}
