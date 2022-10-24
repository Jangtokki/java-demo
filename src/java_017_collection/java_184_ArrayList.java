package java_017_collection;

import java.util.ArrayList;

public class java_184_ArrayList {

	public static void main(String[] args) {
		
		/* Vector ArrayList
		 * 1. 백터는 동기화 처리가 되어있고 ArrayList는 비동기화 처리한다.
		 * 2. 백터와 ArrayListd은 메모리에 요소를 처리할때 배열의 구조를 따른다.
		 * 3. 백터와 ArrayList의 클래스는 처리방법이 비슷하다.
		 * 4. 백터와 ArrayList으로 수시로 요소의 삽입, 삭제를 처리하는 것은 좋은 방법이 아니다.
	
		 */
		
		ArrayList<Integer> aList = new ArrayList<Integer>();
		aList.add(10); //auto boxing => up-Casting
		aList.add(20);
		aList.add(30);
		
		for(int i=0; i<aList.size(); i++) {
			System.out.println(aList.get(i));
			
		}
		
		System.out.println("===================================");
		
		for(Integer it : aList){
			System.out.println(it);
		}
		
		System.out.println("===================================");
		
		System.out.println(aList.remove(0)); //0 index값 삭제됌
		
		
		System.out.println("===================================");
		
		for(Integer it : aList){
			System.out.println(it);
		}
	}

}
