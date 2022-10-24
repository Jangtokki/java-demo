package java_017_collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class java_188_ArrayList {

	public static void main(String[] args) {

		/* 1 배열 구조로 데이터 관리 : Vector, ArrayList
		 * 						ArrayList-추가-(순차적으로 처리할때 사용)
		 * 2 노드로 데이터 관리 : LinkedList
		 * 						삽입, 삭제-(비 순서적으로 처리할때 사용)
		 * 3 List 를 구현해놓은 컬렉션
		 * 	Vector, ArrayList, LinkedList은 add()해준 순서대로 데이터
		 *  관리를 해준다.
		 * 
		 */
		
		ArrayList<String> aList = new ArrayList<String>();
		aList.add(new String("java"));
		aList.add(new String("jsp"));
		aList.add(new String("hello"));
		
		//insert
		aList.add(1, new String("my sql"));
		
		//remove
		aList.remove(2);
		
		
		for(String stn : aList)
			System.out.println(stn);
		
		System.out.println("==== LinkedList ====");
		LinkedList<String> aNode = new LinkedList<String>();
		
		aNode.add(new String("java"));
		aNode.add(new String("jsp"));
		aNode.add(new String("spring"));
		
		//insert
		aNode.add(1, new String("my sql"));
		
		//remove 
		aNode.remove(); //무조건 첫번째 요소를 선택
		aNode.removeLast(); //가장 마지막 요소 선택
		aNode.remove(1);
		
		for(String stn : aNode)
			System.out.println(stn);
	
		
	}

}
