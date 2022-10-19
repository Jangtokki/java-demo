package java_013_api;

import java.util.Scanner;

public class java_143_Scanner {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/*[단입력]
		 * 5 X 1 = 5
		 * 5 X 2 = 10
		 * ...
		 * 5 X 9 = 45
		 * 계속 하시겠습니까?(종료:n, 계속:아무키)
		 * 프로그램종료
		 */
		
		while(true) {
		System.out.print("[단입력]");
		int line = sc.nextInt();
		//System.out.println(line);
		
		//int [] arr = {1,2,3,4,5};
		for(int i=1; i<10; i++) {
			System.out.printf("%d X %d = %d\n", line, i, line*i);
		}
		System.out.print("계속하시겠습니까? (종료:n, 계속:아무키)\n");
		String chk = sc.next();
		if(chk.equals("n")) {break;}	
		
	}System.out.println("프로그램 종료");
	}

}
