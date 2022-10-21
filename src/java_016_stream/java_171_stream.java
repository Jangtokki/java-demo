package java_016_stream;

import java.io.File;

public class java_171_stream {

	public static void main(String[] args) {

		File file = new File("E:\\Jang\\java_workspace\\java-demo\\src\\java_016_stream\\temp");
		System.out.println(file.isDirectory());

		if (!file.isDirectory()) {
			file.mkdir();
			//file.mkdirs(); // 생성 파일이 여러개일 경우
			
			System.out.println("폴더생성");

		} else {
			System.out.println("폴더 존재");
		}
	}

}
