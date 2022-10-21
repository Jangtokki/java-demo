package java_016_stream;

import java.io.File;


public class java_174_stream {

	public static void main(String[] args) {
		File file = new File("E:\\Jang\\java_workspace\\java-demo\\src\\java_016_stream\\text.txt");
		if(file.exists()) {
			
				file.delete();
				System.out.println("파일 삭제");
			
			
		}else {
			System.out.println("파일 없음");
		}
	}

}
