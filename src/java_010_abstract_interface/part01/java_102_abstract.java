package java_010_abstract_interface.part01;

public class java_102_abstract {

	/*
	 * 클래스 종류 : 클래스, 추상클래스, 인터페이스
	 * 메소드 정의 : 메소드 선언부 + 메소드 구현부
	 * public void prn(){ }
	 * 
	 * 추상메소드 : 선언부만 정의된 메소드이다.
	 * abstract public void prn();
	 * 
	 * 추상클래스 : 추상메소드를 가지고 있는 클래스이다.
	 * abstract public class Test{ }
	 * 
	 * 추상클래스 제공 목적 : 추상메소드를 강제적으로 오버라이딩하고 객체 생성을 할 수 있도록 하기 위해서
	 * 
	 * 
	 * 
	 */
	
	
	public static void main(String[] args) {
		//CarAbs cars = new CarAbs // 추상메소드는 생성이 안됌
		
		SenndaAbs sa = new SenndaAbs();
		
		sa.work();
		
		TruckAbs tr = new TruckAbs();
		
		tr.work();
		
	}

}
