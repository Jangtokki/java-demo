package java_012_api;

public class java_120_String {

	public static void main(String[] args) {
		
		System.out.println("<<첫번째 메세지>>");
		handleMessage("PROD-0001:iPhone4:940000:4:애플");
		System.out.println("<<두번째 메세지>>");
		handleMessage("PROD-0002:갤럭시S:960000:삼성");
	}
	
	private static void handleMessage(String sn) {
		//제품아이디, 제품명, 가격, 수량, 제조사를 출력하라
		String[] data  =sn.split(":");
		if(data.length==5) {
			System.out.println("제품아이디 :"+data[0]);
			System.out.println("제품명 :"+data[1]);
		}else {
			System.out.println("메세지 형식이 잘못되었습니다");
		}
		
	}

}
