package java_012_api;

public class java_127_RegEX {

	public static void main(String[] args) {
		
		/* [출력결과]
		 * 851306-2689540 승인이 완료되었습니다.
		 * 750625-16843 다시 입력하세요.
		 * 
		 */
		
		System.out.printf("851306-2689540");
		display(process("851306-2689540"));
		System.out.printf("750625-16843");
		display(process("750625-16843"));
		
	}
	
	public static boolean process(String sn) {
//		if(sn.length()==14) {
//			System.out.println(" 승인이 완료되었습니다");
//
//	}else System.out.println(" 다시 입력하세요");
//		return false;
			return sn.matches("\\d{6}-\\d{7}");
	}
	

	
	public static void display(boolean res) {
		
		if(res) {
			System.out.println(" 승인이 완료되었습니다");
		}else {
			System.out.println(" 다시 입력하세요");
		}
		
	}

}
