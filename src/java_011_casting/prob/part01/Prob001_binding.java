package java_011_casting.prob.part01;
/*
 * 아래를 참조하여 main()메소드를 구현하세요.
 * 단, main( )메소드에서 선언된 객체변수를 사용합니다.
 * 
 * [출력결과]
 * (2,3)
 * (3,4)red
 * (2,3)입니다
 * (3,4)입니다
 */


public class Prob001_binding {

	public static void main(String[] args) {
		CPoint a, b;
		// 여기에서 구현하세요.
		CPoint Cp = new CPoint(2, 3);
		CPoint cp = new ColorPoint(3, 4, "red");
		Cp.show();
		cp.show();
		System.out.println(Cp);
		System.out.println(cp.toString());
		

	}//end main()
}//end class
