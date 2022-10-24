package java_018_collection;

import java.util.Enumeration;
import java.util.Hashtable;

public class java_194_HashSet {

	public static void main(String[] args) {


		/*
		 * Hashtable
		 * 1 Map 인터페이스 구현해놓은 클래스
		 * 2 Map 인터페이스를 구현해 놓은 클래스들은 key, value쌍으로 저장한다.
		 * 3 value를 구현해주는 것은 key 이므로 key은 중복을 허용하지 않는다.
		 */
		
		Hashtable<Integer, String> table = new Hashtable<Integer, String>();
		table.put(10, "java");
		table.put(20, "jsp");
		table.put(30, "spring");
		
		System.out.println(table.get(10));
		
		System.out.println("=== Enumeration ===");
		Enumeration<String> enu = table.elements();
		//value 가져오기
		while(enu.hasMoreElements())
			System.out.println(enu.nextElement());
		
		
		//key 값 가져오기
		Enumeration<Integer> enuKey = table.keys();
		while(enuKey.hasMoreElements()) {
			Integer key = enuKey.nextElement();
		
			System.out.printf("%d:%s \n", key, table.get(key));}
		
		System.out.println("============================");
		for(Integer key : table.keySet()) {
			System.out.printf("%d:%s \n", key, table.get(key));}
		
		
	}

}
