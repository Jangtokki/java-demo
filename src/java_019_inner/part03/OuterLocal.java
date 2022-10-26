package java_019_inner.part03;

public class OuterLocal {

	private int x;
	static int y;
	final private int z = 10;
	
	public void call(final int a) { //final 매게변수에서, 지역변수에서 사용할건지 여부에따라 붙임)
		final int b = 20;
		int c = 30; //자동으로 final 붙음
		//a=300;
		//c=500;
		System.out.printf("a=%d\n", a);
		
		class InnerLocal{
			void prn() {
				x=5;
				y=150;
				
				System.out.println("x="+x);
				System.out.println("y="+y);
				System.out.println("a="+a);
				System.out.println("b="+b);
				System.out.println("c="+c);
			}
		}
		
		InnerLocal inner = new InnerLocal();
		inner.prn();
		
	}
}
