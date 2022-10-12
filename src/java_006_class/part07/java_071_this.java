package java_006_class.part07;

public class java_071_this {

	public static void main(String[] args) {
		Product pn = new Product("s001", "공산품", 4000);
		pn.display();
		
		Product pt = new Product();
		pt.display();
	}

}
