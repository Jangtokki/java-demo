package java_016_stream;

import java.io.File;

public class java_175_stream {

	public static void main(String[] args) {
		
		File file = new File("E:\\Jang\\java_workspace\\java-demo\\src\\java_016_stream\\a");
		deleteFileList(file);
		
	}
	
	public static void deleteFileList(File srcFile) {
		File[] fileAll = srcFile.listFiles();
		
		
		if(fileAll != null) {
			System.out.println(fileAll.length);
			for(File file : fileAll) {
				System.out.println(file);
				deleteFileList(file);
			}
		}
		System.out.println("Remove file:"+srcFile.getPath());
		srcFile.delete();
				
				
	}

}
