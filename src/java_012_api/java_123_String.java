package java_012_api;

public class java_123_String {

	public static void main(String[] args) {
		
		String p1 = "박상원,561203-1597650";
		String p2 = "김연아,030628-4056892";
		String p3 = "정해인,900824-8052582";
		display(p1);
		display(p2);
		display(p3);
		
	}
	
	public static void display(String str) {
		
		String[] data  =str.split(",");
		if(str.charAt(11)=='1') {
			
			System.out.printf("%s님은 남자입니다\n", data[0]);
		}else System.out.printf("%s님은 여자입니다\n", data[0]);
	}

}
