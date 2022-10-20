package java_014_System;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class java_158_exception {

	public static void main(String[] args) {

		File file = new File("sample.txt");
		
		//FileNotFoundException은 checked excaption이다.
		//반드시 try-catch-finally(예외처리)를 한다.
		FileReader fr = null;
		
		try {
		fr = new FileReader(file);
		System.out.println(fr.read());
		}catch(FileNotFoundException ex) {
			System.out.println(ex.toString());
		}catch(IOException ex) {
			System.out.println(ex.toString());
		}
	}

}
