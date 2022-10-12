package method;

public class java_064_method {

	public static void main(String[] args) {
		//[출력결과]
		//java test
		//tset avaj
		//java test
		char[] arr = {'j','a','v','a',' ','t','e','s','t'};
		
		System.out.println(arr);
		System.out.println(reverse(arr));
		System.out.println(arr);
		
	}
	
	public static char[] reverse(char[] data) {
		//data 요소 앞뒤를 바꿔서 리턴하는 프로그램 구현
		
			char[] arr = new char[data.length];
		for(int i = arr.length-1; i >=0; i--) {
		arr[arr.length-i-1] = data[i];
		
			
		}
	
		
		
		return arr;
	}
	

}
