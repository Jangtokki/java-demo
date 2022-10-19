package java_013_api;

public class java_145_Mrapper {

	public static void main(String[] args) {
		char data ='a';
		
		System.out.println(Character.toUpperCase(data)); // 대문자로 변경해서 출력
		System.out.println(Character.toLowerCase(data)); // 소문자로 변경해서 출력
		System.out.println(Character.isUpperCase(data)); // 대문자인지 소문자인지 true false
		System.out.println(Character.isLowerCase(data));
		System.out.println(Character.isAlphabetic(data)); //알파벳인지 아닌지 true false
		System.out.println(Character.isDigit(data)); //숫자인지
		System.out.println(Character.toString(data)); //char -> 문자열로 가져오기
		
		
		
		
	}

}
