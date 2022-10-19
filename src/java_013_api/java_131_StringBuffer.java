package java_013_api;

public class java_131_StringBuffer {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("java test");
		
		display(sb.toString().toCharArray());
		
		
	}
	
	public static void display(char[] data) {
		for(char cn:data) {
			System.out.println(cn);
		}
	}

}
