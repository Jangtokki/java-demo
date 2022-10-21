package java_016_stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class java_170_stream {

	public static void main(String[] args) {
		
		File file = new File("E:\\Jang\\java_workspace\\java-demo\\src\\java_016_stream\\song.txt");
		RandomAccessFile raf = null;
		String stn = new String("\r\nMaron 5 - Daylight, Sunday Morninggggggg\r\n");
		
		try {
			raf = new RandomAccessFile(file, "rw");
			
			System.out.println(raf.getFilePointer());
			//song.txt파일의 총 길이를 구한다. -> 커서를 끝으로 옮김
			long size = raf.length();
			
			raf.seek(size);
			raf.writeUTF(stn);
			System.out.println(raf.getFilePointer());
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
