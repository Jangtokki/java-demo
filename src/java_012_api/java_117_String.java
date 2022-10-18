package java_012_api;

public class java_117_String {

	public static void main(String[] args) {
		
		String str = new String("KoREa, jsp, java");
		System.out.println("문자열길이 : " + str.length());
		System.out.println("대문자 : " + str.toUpperCase());
		System.out.println("소문자 : " + str.toLowerCase());
		System.out.println("문자 : " + str.charAt(0));
		System.out.println("인덱스 : " + str.indexOf('a'));
		System.out.println("인덱스 : " + str.indexOf(97));
		System.out.println("인덱스 : " + str.lastIndexOf('a'));
		
		//메모리에 저장된 문자열을 ","로 구분해서 문자열 배열로 리턴
		String[] arr = str.split(",");
		for(int i=0; i<arr.length; i++) {
			System.out.printf("arr[%d]=%s\n", i, arr[i]);
		}
	}

}
