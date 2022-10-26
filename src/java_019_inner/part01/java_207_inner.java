package java_019_inner.part01;

public class java_207_inner {

	public static void main(String[] args) {


		OuterInstance outer = new OuterInstance() ;
		
		outer.display();
		
		OuterInstance.InnerInstance inner = outer.new InnerInstance();
		inner.run();
	}

}
