package method;

public class java_062_method {

	public static void main(String[] args) {
		
		//[출력결과]
		//입시총점 : 135점
		//입시결과 : 불합격
		
		int toeic = 75;
		int it = 60;
		int sum = total(toeic, it);
		System.out.printf("입시총점:%d점\n", sum);
		System.out.printf("입시결과:%s\n", rs(sum));
		
		
	}
	
	public static int total(int toeic, int it) {
		//두 매게변수의 합계를 리턴하는 메소드 구현
		return toeic+it;
	}
	
	public static String rs(int tot) {
		//tot매게변수의 값이 800이상이면 "합격", 미만이면 "불합격"을 리턴하는 메소드 구현
//		if(tot>=800) {
//			return "합격"
//		}else { return false}
		return tot>=800? "합격" : "불합격";
	}

}
