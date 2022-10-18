package java_012_api;

public class java_119_String {

	public static void main(String[] args) {
		
		String sn = "korea";
		char[] data= display(sn);
		System.out.println(data);
		System.out.println(sn);
		
		//출력결과
		//aerok
		//korea
	}
	
	public static char[] display(String alpa) {
		
		char[] arr = new char[alpa.length()];
		for(int i=0; i<arr.length; i++) {
			arr[i]= alpa.charAt(arr.length-i-1);
			
			
		}
		
		return arr;
	}

}
