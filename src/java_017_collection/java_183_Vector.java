package java_017_collection;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.Vector;

public class java_183_Vector {

	public static void main(String[] args) {

		String path = "./src/java_017_collection/score.txt";

		Vector<Sawon> vt = lines(path);
		// FileReader fr = new FileReader(path);
	

	
		prnDisplay(vt);

	}

	private static Vector<Sawon> lines(String filename){
		//strName 매게변수의 값을 이용해서 vector에 데이터를 저장후 리턴하는 프로그램
		Vector<Sawon> vt = new Vector<Sawon>();
		try(Scanner sc = new Scanner(new File(filename))){
			while(sc.hasNextLine()) {
				String[]data = sc.nextLine().split("[:/]");
				Sawon sn = new Sawon(data[0], Integer.parseInt(data[1]), Integer.parseInt(data[2]), Integer.parseInt(data[3]));
				vt.add(sn);
			}
		}catch(FileNotFoundException ex) {
			System.out.println(ex.toString());
		}
		
		return vt;
	}

	private static void prnDisplay(Vector<Sawon> vt) {
		
		for(Sawon sn : vt) {
			System.out.println(sn.toString());
		}
		

	}

}
