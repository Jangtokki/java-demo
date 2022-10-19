package java_013_api;

import java.util.StringTokenizer;

public class java_133_StringBuffer {

	public static void main(String[] args) {
		
		StringTokenizer st = new StringTokenizer("java,/jsp,spring", ",/");
		System.out.println(st.countTokens());
		while(st.hasMoreElements())
			System.out.println(st.nextToken());
		
		System.out.println("=================================");
		String [] data = new String("java,/jsp/spring").split("[,/]");
		System.out.println(data.length);
		for(int i=0; i<data.length; i++) {
			System.out.printf("data[%d]=%s\n", i, data[i]);
		}
		
	}

}
