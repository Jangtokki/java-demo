package java_014_System;

public class java_160_exception {

	public static void main(String[] args) {
		
		int data = 8;
		try {
		if(data<=10)
			//throw 강제적으로 예외를 발생시킬때 사용됌
			throw new UserException("10이상만 입력하세요.");
		System.out.println(data);
		}catch(UserException ex) {
			System.out.println(ex.toString());
		}
	}

}
