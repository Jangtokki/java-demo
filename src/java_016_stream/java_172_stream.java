package java_016_stream;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class java_172_stream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File file = new File("E:\\Jang\\java_workspace\\java-demo\\src\\java_016_stream\\sample.txt");
		//file.createTempFile("sourse", "test");

//		if (!file.isDirectory()) {
//			//file.delete();
//			
//			file.mkdirs(); // 생성 파일이 여러개일 경우
//			
//			System.out.println("폴더 삭제");
//
//		} else {
//			System.out.println("폴더 없음");
	//	}
		
		
		//종료시 삭제되도록 설정
		file.deleteOnExit();
		
		
		Scanner sc = new Scanner(file);
		System.out.println(sc.nextLine());
		System.out.println(sc.nextLine());
		sc.close();
		
	}

}
