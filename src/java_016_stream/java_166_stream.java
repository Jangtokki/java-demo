package java_016_stream;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class java_166_stream {

	public static void main(String[] args) {


		
		File file = new File ("E:\\Jang\\java_workspace\\java-demo\\sample.txt");
		System.out.println(file.exists());
		System.out.println(file.isFile());
		System.out.println(file.length());
		
		FileWriter fw = null;
		
		try {
			
			//mode의 값이 true이면 append
			//mode의 값이 false이면 upgrade
			//mode의 값을 생략하면 false이다
			fw = new FileWriter(file, false);
			fw.write("java\n"); //buffer에 저장
			fw.flush();
			fw.write("jsp\n");
			fw.flush();
			fw.write(new char[] {'s','p','r','i','n','g'},0,3);
			fw.write("\n");
			fw.close();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
	}

}
