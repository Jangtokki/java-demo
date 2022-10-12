package method;

public class java_061_method {

	public static void main(String[] args) {
		
		//[출력결과] 
		//20은 양수입니다
		//0은 0입니다
		//-20은 음수입니다'
		process(20);
		process(0);
		process(-20);
		
		
		
	}
	
	public static void process(int num) {
		
		if(num>0) {
			System.out.printf("%d는 양수입니다.", num);
		} else if(num==0) { System.out.printf("%d는 0입니다.", num);}
		else {System.out.printf("%d는 음수입니다.", num);}
		//num 변수의 값이 0보다 크면 '양수', 0이면 '0', 0보다 작으면 "음수"로 출력하는 메소드 구현
	}

}
