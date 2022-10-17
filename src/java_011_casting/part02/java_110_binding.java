package java_011_casting.part02;

public class java_110_binding {
	
	/*
	 * 다형성(polymorphism)
	 * 1. 사전적 의미는 '여러가지 형태를 가실 수 있는 능력'을 의미한다.
	 * 2. 자바에서는 한 파일의 참조변수로 여러 타입의 객체를 창조하는 기술이다.
	 * 		예를들면, 하나의 타입으로 상속관계에 있는 여러 객체를 다루는 기술이다.
	 * 
	 * 바인딩(binding) : 메소드 호출을 실제 메소드의 몸체와 연결하는 기술이다.
	 * 1. 정적바인딩(static binding) : 컴파일 단계에서 어떤 클래스의 어떤 메소드가 호출되는지 연결하는 기술
	 * 2. 동적바인딩(dynamic binding) : 실행단계에서 어떤 클래스의 어떤 메소드가 호출되는지 연결하는 기술
	 */
	
	
	public static void main(String[] args) {
		
		Employee emp = new Employee("Steven", "code001");
		process(emp);
		
		Manager mg = new Manager("Neesa", "professor", "second");
		process(mg);
		
	}
	
	public static void process(Employee emp) {
		System.out.println(emp.toString());
		System.out.println(emp.pay());
	}
	
	public static void process(Manager mg) {
		System.out.println(mg.toString());
		System.out.println(mg.display());
	}
	
//	public static void process(Object obj) {
//		System.out.println(obj.toString());
//		System.out.println(obj.pay());
//	}
	
	

}
