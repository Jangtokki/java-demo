package java_016_stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class java_169_stream {

	public static void main(String[] args) {
		
		File file = new File("E:\\Jang\\java_workspace\\java-demo\\src\\java_016_stream\\score.txt");
		RandomAccessFile raf = null;
		
		try {
			// "r" : 읽기(read)만 가능하다.
			// "rw" : 읽기(read), 쓰기(write)가 가능하다.
			raf = new RandomAccessFile(file, "r");
			
			//현재위치 확인
			System.out.println(raf.getFilePointer());
			System.out.println(raf.read());
			System.out.println(raf.getFilePointer());
			System.out.println(raf.readLine());
			System.out.println(raf.getFilePointer());
			System.out.println(raf.readLine());
			System.out.println(raf.getFilePointer());
			
			//포인터의 위치를 변경한다. (파일 처음부터 포인터를 찾는다.)
			raf.seek(4); //
			System.out.println((char)raf.read());
			System.out.println(raf.readLine());
			
			//지정된 수 만는 한글 byte를 건너뛴다. (현재 포인터가 있는 위치를 기준으로 건너뛴다.)
			//앞으로 이동할 수 없다. 즉 raf.skipBytes(-1)은 적용되지 않는다.
			raf.skipBytes(2);
			System.out.println(raf.readLine());
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		} finally {try {
			raf.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}}
		
	}

}
