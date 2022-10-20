package java_014_api.prob;

/*
 * javac Prob001_String.java
 * java Prob001_String JAva Test
 */
/*1 프로그램 실행할때  "JAva Test" 문자열을 args배열에서 값을 받아 출력결과에 같이
 *  나오도록 프로그램을 구현하시오.
 *  java Prob001_String JAva Test
 *   * 
 * 2 출력결과
 *   source : JAva Test 
 *   convert: jaVA tEST
 *   length: 9
 *   reverse : tseT avAJ
 */

public class Prob002_String {

	public static void main(String[] args) {
		
		args  = new String [2];
		String st = "java Prob001_String JAva Test";
		String[] data  =st.split(" ");
		StringBuffer se = new StringBuffer(data[2]+" "+data[3]);
		se.reverse();
		args[0] = "source : "+data[2]+" "+data[3]+"\nconvert : ";
		args[1] = "length : "+se.length()+"\nreverse : "+se.toString();
		
		System.out.println(args[0]);
		System.out.println(args[1]);
	}
		
}// end class

