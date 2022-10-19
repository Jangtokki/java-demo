package java_013_api;

import java.util.StringTokenizer;

public class java_132_StringBuffer {

	public static void main(String[] args) {
		
		//StringTokenizer("문자열", "구분자")
		//문자열의 구분자가 공백일때는 2번째 인자값은 생략할 수 있다.
		//StringTokenizer st = new String("java,jsp",",");
		StringTokenizer st = new StringTokenizer("java jsp");
//		System.out.println(st.countTokens());
//		System.out.println(st.nextToken());
//		System.out.println(st.countTokens());
//		System.out.println(st.nextToken());
		
//		for(int i=0; i<st.countTokens()+1; i++) {
//			System.out.println(st.nextToken());
//		}
		
		//메모리에 저장된 토큰이 있으면 true,없으면 false
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}

}
