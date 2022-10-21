package java_014_api;

public class java_154_exception {

	public static void main(String[] args) {
		
		int[] num = new int [3];
		num[0] = 10;
		System.out.println(num.length);
		//System.out.println(num[4]);
		process(num);
		try {
		display(num);
		}catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println(ex.toString());
		}
		
	}
	
	public static void display(int[] num) throws ArrayIndexOutOfBoundsException{
		System.out.println(num[5]);
	}
	
	public static void process(int[] num) {
		try {
			//예외발생 가능 구문
			System.out.println(num[4]);
		}catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println(ex.getMessage());
		}finally {
			System.out.println("program end");
		}
	}

}
