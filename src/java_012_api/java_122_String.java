package java_012_api;

public class java_122_String {

	public static void main(String[] args) {
		
		System.out.printf("2_9a은");
		prnDisplay(numCheck("2_8a"));
	}
	
	public static boolean numCheck(String data) {
		for(int i=0; i<data.length(); i++) {
			if(!(data.charAt(i)>='0' && data.charAt(i)<='9'))
				return false;
			
		}
		return true;
	}
	
	public static void prnDisplay(boolean chk) {
		
		if (chk) {System.out.println("숫자입니다");} else System.out.println("문자입니다");
		//chk값이 true이면 "숫자입니다"
		//chk값이 false이면 "문자입니다" 출력
	}

}
