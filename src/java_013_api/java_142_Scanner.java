package java_013_api;

import java.util.Scanner;

public class java_142_Scanner {

	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		System.out.print("부서 연봉 평가");
		String line = sc.nextLine();
		System.out.println(line);
		
		String[] arr = line.split("\\s{1,}");
		for(int i =0; i<arr.length; i++)
			System.out.printf("arr[%d]=%s\n", i, arr[i]);
		
		System.out.printf("%s %s %s\n", arr[0], arr[1], arr[2]);
	}

}
