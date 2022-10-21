package java_016_stream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class java_177_stream {

	public static void main(String[] args) {
	
		try(FileWriter fw =  new FileWriter(new File("E:\\\\Jang\\\\java_workspace\\\\java-demo\\\\src\\\\java_016_stream\\sample.txt"))){
			fw.write("java\n");
			fw.write("jsp\n");
			fw.write("spring\n");
			
		}catch(FileNotFoundException ex) {
			System.out.println(ex.toString());
		}catch(IOException ex) {
			System.out.println(ex.toString());
		}
		
		System.out.println("======================================================");
		
		try(FileReader fr = new FileReader("E:\\\\Jang\\\\java_workspace\\\\java-demo\\\\src\\\\java_016_stream\\sample.txt");
				BufferedReader br = new BufferedReader(fr)){
					String line = null;
					while(line==null) {
						System.out.println(line);
				}
	}catch (IOException e) {
		System.out.println(e.toString());
	}

	}

}
