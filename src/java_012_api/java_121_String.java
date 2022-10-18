package java_012_api;

public class java_121_String {

	public static void main(String[] args) {
		
		String stn=new String("java_jsp_spring");
		System.out.println(process(stn.toCharArray()));
		
	}
	
	public static char[] process(char arr[]) {
		//'_'를 ' '으로 변환후 리턴하는 프로그램
		for(int i=0; i<arr.length; i++) {
			if(arr[i]=='_') {
				arr[i] = ' ';
			}
		}
		return arr;
	}

}
