package java_014_System;

public class java_155_exception {

	public static void main(String[] args) {
		
		StringBuffer sb = null;
		try {
		sb.reverse();
		}catch(NullPointerException ex) {
			sb = new StringBuffer("java");
			System.out.println(sb);
		}finally {
			System.out.println("program end");
		}
		
	}

}
