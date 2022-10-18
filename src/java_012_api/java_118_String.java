package java_012_api;

public class java_118_String {

	public static void main(String[] args) {
		
			/*[출력결과]
			 * ip : 127.0.0.1
			 * port : 8080
			 */
			
			String sn = "123.0.0.1:8080";
			
			int index = sn.indexOf(":");
			System.out.println("ip:"+sn.substring(0, index));
			System.out.println("port:"+sn.substring(index+1));
			
			
			System.out.println(sn.charAt(0));
			for(int i=0; i<9; i++) {
				;
				
			}
			
		
	}

}
