package java_014_System;

public class java_156_exception {

	public static void main(String[] args) {


		String data1 = "a";
		String data2 = "0";
		
		try {
			int x = Integer.parseInt(data1);
			int y = Integer.parseInt(data2);
			int res = x/y;
			System.out.println(res);
					
		}
		catch(ArithmeticException ex) {
		System.out.println(ex.toString());	
		}catch(NumberFormatException ex) {
			System.out.println(ex.toString());
		}
	}

}
