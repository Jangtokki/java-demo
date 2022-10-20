package java_016_stream;

import java.io.InputStream;
import java.util.Scanner;

public class java_164_stream {

	public static void main(String[] args) {
		
		//InputStream is = System.in;
		
		Scanner sc =  new Scanner(System.in);
		int x, y;
		System.out.println("x:");
		x=sc.nextInt();
		System.out.println("y:");
		y=sc.nextInt();
		System.out.printf("%d +%d = %d\n", x, y, x+y);
		sc.close();
		
	}

}
