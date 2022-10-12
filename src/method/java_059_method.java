package method;

public class java_059_method {

	public static void main(String[] args) {
		int data = 11;
//		boolean result = process(data);
//		if(result) {System.out.printf("%d는 짝수입니다", data);}
//		else {System.out.printf("%d는 홀수입니다", data);}
		
		String result = process(data)? "짝수" : "홀수";
		System.out.printf("%d는 %s입니다.\n", data, result);
		
		System.out.printf("%d는 %s입니다.", data, process(data)? "짝수" : "홀수");
		
		//출력결과 
		//10일때 -> 10은 짝수입니다.
		//9일때 -> 9는 홀수입니다.
		
	}
	
	
	
	public static boolean process(int data) {
		
		//data 매게변수와 같이 짝수이면 true,
		//홀수이면 false를 리턴하는 메소드 구현
		
//		if(data%2==0) {
//			return true;
//		}else {return false;}
		
		return data %2 == 0? true : false;
		
		
	}

}
