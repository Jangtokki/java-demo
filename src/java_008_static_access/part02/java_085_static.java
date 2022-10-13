package java_008_static_access.part02;

public class java_085_static {
	int x = 3;
	static int y = 5; 

	public static void main(String[] args) {
		System.out.printf("y=%d\n", y);
		//process(); //non-static
		display(); //static
		java_085_static js = new java_085_static();
		js.process();
	}
	
	public void process() {
		System.out.println("process");
		display(); //non static 메소드에서 static 메소드 호출 가능
	}
	
	public static void display() {
		System.out.println("display");
	}

}
