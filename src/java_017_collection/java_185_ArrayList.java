package java_017_collection;

import java.util.ArrayList;

public class java_185_ArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> aList = new ArrayList<String>();
		aList.add(new String("java"));
		aList.add(new String("jsp"));
		aList.add(new String("spring"));
		prnDisplay(aList);
		process(aList);
		
	}
	
	public static void prnDisplay(ArrayList<String> aList) {
		//aList 매게변수의 요소에서 'J' or 'j'가 포함되어있는 요소만 출력하는 프로그램을 구현하시오
		//인덱스의 요소값을 가져옴
		//포함되어있는 요소를 찾는 메소드사용
		
		for(String sn : aList) {
			if(sn.toLowerCase().contains("j"))
				System.out.println(sn);
			
			
			}
		
	}
	
	public static void process(ArrayList<String> aList) {
		System.out.println(aList.contains("jsp")); //true
	}

}
