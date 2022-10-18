package java_012_api;

public class java_114_Object {

	
	/*	java api
	 * 	Object
	 * 	1. 클래스 중에서 최상위 클래스이다.
	 * 	2. Object를 제외한 모든 클래스들은 Object를 상속받고 있다.
	 * 	3. java.lang패키지에서 제공하는 클래스이다.
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		
		Object obj = new Object();
		System.out.println(obj);
		System.out.println(obj.toString());
		
		int x = 5;
		int y = 5;
		System.out.printf("x=%d y=%d x==y:%b\n", x, y, x==y); //값비교 : true
		
		Object ojt = new Object();
		System.out.printf("obj==ojt:%b\n", obj==ojt); //주소비교 : false
		
		System.out.printf("obj.equals(ojt):%b\n", obj.equals(ojt)); //equals( ) : 주소비교, 객체비교만 가능하다.
		
		System.out.println(obj.getClass()); //class java.lang.Object
		
		System.out.println(obj.getClass().getName()); //java.lang.Object
		
		Object opt = obj.hashCode();
		System.out.println(opt);
		
		
	}

}
