package java_016_stream;

import java.io.File;
import java.io.IOException;

public class java_173_stream {

	public static void main(String[] args) {
	
		File file = new File("E:\\Jang\\java_workspace\\java-demo\\src\\java_016_stream\\text.txt");
		if(!file.exists()) {
			try {
				file.createNewFile();
				System.out.println("파일생성");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
