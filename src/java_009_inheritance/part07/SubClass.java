package java_009_inheritance.part07;

public class SubClass extends SuperClass{

	
	public SubClass() {
		//구현
		
		super(10, 20, 30);
		super.display();
		}
	
	public SubClass(int a, int b, int c) {
		
	}
	
	public void sumData() {
		System.out.println("합 : " + (x + y +z));
	}
}
