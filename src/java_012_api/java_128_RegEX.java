package java_012_api;

import java.util.regex.Pattern;

public class java_128_RegEX {

	public static void main(String[] args) {
		
		/*
		 * 아이디를 입력할때 영문자,숫자 조합으로 합니다. 최소 5자이상 10자이하까지만 가능합니다.
		 * (반드시 영문으로 시작한다)
		 * [출력결과]
		 * 로그인이 되었습니다.
		 * 회원이 아닙니다.
		 */
		
		System.out.println("ymy232");
		display(process("ymy232"));
		System.out.println("korea");
		display(process("korea"));
		
	}
	
	public static boolean process(String sn) {
		
		if(sn.matches("[\\w]{5,10}")
				&& Pattern.compile("[0-9]").matcher(sn).find()
				&& Pattern.compile("[a-zA-Z]").matcher(sn).find()) {return true;}
		else {return false;}
		
		
	}
	
	public static void display(boolean res) {
		if(res) {
			System.out.println(" 로그인이 되었습니다.");
		} else {
			System.out.println(" 회원이 아닙니다.");
		}
	}

}
