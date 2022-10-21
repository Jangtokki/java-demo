package java_017_collection;

import java.util.Vector;

public class java_182_Vector {

	public static void main(String[] args) {
		
		//Vector 생성자에 인자값이 없으면 용량의 기본값은 10이다.
		Vector<String> v = new Vector<String>();
	
		
		v.addElement(new String("java"));
		v.add(new String("jsp"));
		v.add(1, new String("spring")); // (이 위치에, "spring"을 생성) 기존 요소는 뒤로 밀려남
		
		for(int i=0; i<v.size(); i++) {
			System.out.printf("v[%d]=%s\n", i, v.get(i));
		}
		
		//요소가 저장되어 있지 않은 메모리 제거
		v.trimToSize();
		
		System.out.println("용량크기 : "+v.capacity());
		System.out.println("요소개수 : "+v.size());
		
		
	}

}
